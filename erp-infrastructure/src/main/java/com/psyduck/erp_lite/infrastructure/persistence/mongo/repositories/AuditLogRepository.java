package com.psyduck.erp_lite.infrastructure.persistence.mongo.repositories;

import com.psyduck.erp_lite.infrastructure.persistence.mongo.documents.AuditLogDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuditLogRepository extends MongoRepository<AuditLogDocument, ObjectId> {
}
