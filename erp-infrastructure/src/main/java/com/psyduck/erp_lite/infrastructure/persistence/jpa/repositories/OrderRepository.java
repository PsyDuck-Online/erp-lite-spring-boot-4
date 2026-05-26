package com.psyduck.erp_lite.infrastructure.persistence.jpa.repositories;

import com.psyduck.erp_lite.infrastructure.persistence.jpa.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {
}
