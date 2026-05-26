package com.psyduck.erp_lite.infrastructure.persistence.mongo.documents;


public record CatalogItem(

        String id,
        String code,
        String value,
        String description,
        Integer displayOrder,
        CatalogMetadata metadata

) {}