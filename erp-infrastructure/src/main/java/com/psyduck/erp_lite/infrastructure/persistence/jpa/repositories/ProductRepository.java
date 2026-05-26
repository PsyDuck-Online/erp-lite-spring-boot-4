package com.psyduck.erp_lite.infrastructure.persistence.jpa.repositories;

import com.psyduck.erp_lite.infrastructure.persistence.jpa.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {
}
