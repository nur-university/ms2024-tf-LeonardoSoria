package com.core.webapi.dto.response;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NutritionalPlanResponse {
    private String id;
    private String clientId;
    private String nutritionistId;
    private List<String> analysisResults;
    private boolean isDelivered;
    private String planDetails;
}
