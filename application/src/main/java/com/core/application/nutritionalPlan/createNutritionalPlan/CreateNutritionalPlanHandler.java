package com.core.application.nutritionalPlan.createNutritionalPlan;

import an.awesome.pipelinr.Command;
import com.core.application.appointment.createAppointment.CreateAppointmentCommand;
import com.core.domain.abstracts.IUnitOfWork;
import com.core.domain.models.appointment.Appointment;
import com.core.domain.models.appointment.IAppointmentFactory;
import com.core.domain.models.appointment.IAppointmentRepository;
import com.core.domain.models.nutritionalPlan.INutritionalPlanFactory;
import com.core.domain.models.nutritionalPlan.INutritionalPlanRepository;
import com.core.domain.models.nutritionalPlan.NutritionalPlan;
import com.core.domain.models.nutritionalPlan.NutritionalPlanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CreateNutritionalPlanHandler implements Command.Handler<CreateNutritionalPlanCommand, NutritionalPlan> {

    private final INutritionalPlanFactory nutritionalPlanFactory;
    private final INutritionalPlanRepository nutritionalPlanRepository;

    public CreateNutritionalPlanHandler(INutritionalPlanRepository nutritionalPlanRepository) {
        this.nutritionalPlanFactory = new NutritionalPlanFactory();
        this.nutritionalPlanRepository = nutritionalPlanRepository;
    }

    @Override
    public NutritionalPlan handle(CreateNutritionalPlanCommand command) {
        NutritionalPlan nutritionalPlan = nutritionalPlanFactory.create(command.clientId,
                command.nutritionistId, command.planDetails);

        nutritionalPlanRepository.update(nutritionalPlan);

        return nutritionalPlan;
    }
}
