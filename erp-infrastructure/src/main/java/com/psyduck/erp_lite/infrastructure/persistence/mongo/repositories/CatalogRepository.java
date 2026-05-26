package com.psyduck.erp_lite.infrastructure.persistence.mongo.repositories;

import com.psyduck.erp_lite.infrastructure.persistence.mongo.documents.CatalogDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogRepository extends MongoRepository<CatalogDocument, String> {
}
