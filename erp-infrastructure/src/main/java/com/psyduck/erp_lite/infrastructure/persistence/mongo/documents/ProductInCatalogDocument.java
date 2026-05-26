package com.psyduck.erp_lite.infrastructure.persistence.mongo.documents;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product_documents")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductInCatalogDocument {

    @Id
    private String id;

    private String sku;

    private String name;

    private String description;

    private String categoryId;

    private String categoryName;

    private BigDecimal price;

    private String currency;

    private Integer stock;

    private String imageUrl;

    private boolean active;

    private ProductSpecifications specifications;

    private List<String> tags;

    private Instant createdAt;

    private Instant updatedAt;

}