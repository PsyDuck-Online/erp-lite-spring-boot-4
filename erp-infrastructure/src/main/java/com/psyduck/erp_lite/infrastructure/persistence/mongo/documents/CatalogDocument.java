package com.psyduck.erp_lite.infrastructure.persistence.mongo.documents;

import java.time.Instant;
import java.util.List;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "catalogs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CatalogDocument {

    @Id
    private String id;

    private String name;

    private String description;

    private boolean active;

    private CatalogType catalogType;

    /**
     * Embedded JSON array
     */
    private List<CatalogItem> items;

    private Instant createdAt;

    private Instant updatedAt;

}