package com.core.application.appointment.getAppointments;

import an.awesome.pipelinr.Command;
import com.core.domain.annotations.Generated;
import com.core.domain.models.appointment.Appointment;

import java.util.List;
import java.util.UUID;

@Generated
public class GetAppointmentsQuery implements Command<List<Appointment>> {

    UUID clientId;

    public GetAppointmentsQuery(UUID clientId) {
        this.clientId = clientId;
    }
}
