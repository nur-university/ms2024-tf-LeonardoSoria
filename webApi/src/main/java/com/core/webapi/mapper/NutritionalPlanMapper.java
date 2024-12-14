package com.core.webapi.mapper;

import com.core.domain.models.nutritionalPlan.NutritionalPlan;
import com.core.webapi.dto.response.NutritionalPlanResponse;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class NutritionalPlanMapper {

    public static NutritionalPlanResponse mapToNutritionalPlanResponse(NutritionalPlan nutritionalPlan) {
        if (nutritionalPlan == null) {
            return null;
        }

        return NutritionalPlanResponse.builder()
                .id(nutritionalPlan.getId().toString())
                .clientId(nutritionalPlan.getClientId().toString())
                .nutritionistId(nutritionalPlan.getNutritionistId().toString())
                .planDetails(nutritionalPlan.getPlanDetails())
                .isDelivered(nutritionalPlan.isDelivered())
                .analysisResults(nutritionalPlan.getAnalysisResults().stream().map(UUID::toString).collect(Collectors.toList()))
                .build();
    }

    public static List<NutritionalPlanResponse> mapToNutritionalPlanList(List<NutritionalPlan> nutritionalPlans) {
        return nutritionalPlans.stream()
                .map(NutritionalPlanMapper::mapToNutritionalPlanResponse)
                .collect(Collectors.toList());
    }
}
