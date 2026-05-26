package com.psyduck.erp_lite.infrastructure.persistence.mongo.documents;

import java.time.Instant;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "audit_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditLogDocument {

    @Id
    private ObjectId id;

    private String className;

    private String methodName;

    private String endpoint;

    private String userId;

    private String ipAddress;

    private boolean success;

    private String errorMessage;

    private Long executionTimeMs;

    private Instant timestamp;

}