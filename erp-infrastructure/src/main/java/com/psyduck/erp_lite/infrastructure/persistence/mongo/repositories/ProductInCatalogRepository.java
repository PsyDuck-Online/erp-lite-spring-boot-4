package com.psyduck.erp_lite.infrastructure.persistence.mongo.repositories;

import com.psyduck.erp_lite.infrastructure.persistence.mongo.documents.ProductInCatalogDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductInCatalogRepository extends MongoRepository<ProductInCatalogDocument, String> {
}
