package com.psyduck.erp_lite.infrastructure.persistence.mongo.documents;

import java.math.BigDecimal;
import java.util.List;

public record CatalogMetadata(

        String icon,
        String color,
        BigDecimal fee,
        List<String> nextStatuses

) {
}