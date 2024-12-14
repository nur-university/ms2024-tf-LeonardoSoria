package com.core.application.nutritionalPlan.getNutritionalPlan;

import an.awesome.pipelinr.Command;
import com.core.domain.annotations.Generated;
import com.core.domain.models.nutritionalPlan.NutritionalPlan;

import java.util.List;
import java.util.UUID;

@Generated
public class GetNutritionalPlanQuery implements Command<List<NutritionalPlan>> {

    UUID clientId;

    public GetNutritionalPlanQuery(UUID clientId) {
        this.clientId = clientId;
    }
}
