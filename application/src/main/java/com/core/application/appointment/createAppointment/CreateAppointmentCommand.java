package com.core.application.appointment.createAppointment;

import an.awesome.pipelinr.Command;
import com.core.domain.annotations.Generated;
import com.core.domain.models.appointment.Appointment;
import com.core.domain.shared.DateValue;

import java.util.UUID;

@Generated
public class CreateAppointmentCommand implements Command<Appointment> {

    UUID clientId;
    DateValue appointmentDate;

    public CreateAppointmentCommand(UUID clientId, DateValue appointmentDate) {
        this.clientId = clientId;
        this.appointmentDate = appointmentDate;
    }

}
