package com.okason.prontosalon.schedule.events;

import android.util.Log;

import com.okason.prontosalon.core.BaseEvent;
import com.syncfusion.schedule.ScheduleAppointment;
import com.syncfusion.schedule.ScheduleAppointmentCollection;

import java.util.Calendar;

/**
 * Created by Valentine on 1/29/2016.
 */
public class StartNewAppointmentEvent extends BaseEvent {

    private Object mObject;
    private Calendar mCalendar;
    private ScheduleAppointmentCollection mScheduleAppointmentCollection;
    private ScheduleAppointment mScheduleAppointment;
    public final static String TAG = StartNewAppointmentEvent.class.getSimpleName();


    public StartNewAppointmentEvent(Object o, Calendar calendar, ScheduleAppointmentCollection
            scheduleAppointmentCollection, ScheduleAppointment scheduleAppointment){
        mObject = 0;
        mCalendar = calendar;
        mScheduleAppointmentCollection = scheduleAppointmentCollection;
        mScheduleAppointment = scheduleAppointment;

        Log.d(TAG, "Object: " + o.toString() + " Calender: "
                + calendar.getTime().toString() + " collection size: "
                + scheduleAppointmentCollection.size() + " appointment " + scheduleAppointment.getSubject());

    }


    public Object getObject() {
        return mObject;
    }

    public void setObject(Object object) {
        mObject = object;
    }

    public Calendar getCalendar() {
        return mCalendar;
    }

    public void setCalendar(Calendar calendar) {
        mCalendar = calendar;
    }

    public ScheduleAppointmentCollection getScheduleAppointmentCollection() {
        return mScheduleAppointmentCollection;
    }

    public void setScheduleAppointmentCollection(ScheduleAppointmentCollection scheduleAppointmentCollection) {
        mScheduleAppointmentCollection = scheduleAppointmentCollection;
    }

    public ScheduleAppointment getScheduleAppointment() {
        return mScheduleAppointment;
    }

    public void setScheduleAppointment(ScheduleAppointment scheduleAppointment) {
        this.mScheduleAppointment = scheduleAppointment;
    }
}
