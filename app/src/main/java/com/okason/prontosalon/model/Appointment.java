package com.okason.prontosalon.model;

import com.syncfusion.schedule.ScheduleAppointment;

/**
 * Created by Valentine on 1/26/2016.
 */
public class Appointment extends ScheduleAppointment {
    private String id;
    private Client client;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
