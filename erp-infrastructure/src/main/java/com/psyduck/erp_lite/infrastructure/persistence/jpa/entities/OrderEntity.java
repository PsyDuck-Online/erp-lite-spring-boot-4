package com.psyduck.erp_lite.infrastructure.persistence.jpa.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(
        name = "orders",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_orders_order_number",
                        columnNames = "order_number"
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderEntity {

    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(
            name = "id",
            columnDefinition = "uuid",
            nullable = false,
            updatable = false
    )
    private UUID id;

    @Column(
            name = "order_number",
            nullable = false,
            length = 50
    )
    private String orderNumber;

    @Column(
            name = "customer_id",
            nullable = false
    )
    private Long customerId;

    @Column(
            name = "customer_name",
            nullable = false,
            length = 200
    )
    private String customerName;

    @Column(
            name = "created_by",
            nullable = false,
            length = 100
    )
    private String createdBy;

    @Column(
            name = "order_date",
            nullable = false
    )
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    @Column(
            name = "status",
            nullable = false,
            length = 20
    )
    private OrderStatus status;

    @Column(
            name = "total_amount",
            nullable = false,
            precision = 15,
            scale = 2
    )
    private BigDecimal totalAmount;

    @Column(
            name = "currency",
            nullable = false,
            length = 3
    )
    private String currency;

    @CreationTimestamp
    @Column(
            name = "created_at",
            nullable = false,
            updatable = false
    )
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(
            name = "updated_at",
            nullable = false
    )
    private LocalDateTime updatedAt;

    @Builder.Default
    @OneToMany(
            mappedBy = "order",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<OrderProductEntity> products = new ArrayList<>();

    @PrePersist
    void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        if (orderDate == null) {
            orderDate = now;
        }
        if(createdAt == null) {
            createdAt = now;
        }
        if(updatedAt == null) {
            updatedAt = now;
        }
        if (status == null) {
            status = OrderStatus.PENDING;
        }
        if (currency == null) {
            currency = "USD";
        }
    }

    @PreUpdate
    void preUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public void addProduct(OrderProductEntity orderProduct) {

        products.add(orderProduct);
        orderProduct.setOrder(this);
    }

    public void removeProduct(OrderProductEntity orderProduct) {

        products.remove(orderProduct);
        orderProduct.setOrder(null);
    }
}