package com.okason.prontosalon.schedule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.syncfusion.schedule.ScheduleAppointment;
import com.syncfusion.schedule.ScheduleAppointmentCollection;
import com.syncfusion.schedule.SfSchedule;
import com.syncfusion.schedule.enums.ScheduleView;

import java.util.Calendar;

public class ScheduleActivity extends AppCompatActivity {

    ScheduleAppointmentCollection mAppointmentCollection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_schedule);
        setSchedule();
    }

    private void setSchedule() {
        SfSchedule schedule = new SfSchedule(this);
        schedule.setScheduleView(ScheduleView.WeekView);


        mAppointmentCollection = new ScheduleAppointmentCollection();

        //Create new appointment
        ScheduleAppointment updateResume = new ScheduleAppointment();

        //setting appointment start time
        Calendar startTime = Calendar.getInstance();
        startTime.set(
                startTime.get(Calendar.YEAR),
                startTime.get(Calendar.MONTH),
                startTime.get(Calendar.DAY_OF_MONTH),
                10,0, 0);
        updateResume.setStartTime(startTime);

        //setting appointment end time
        Calendar endTime = Calendar.getInstance();
        endTime.set(
                startTime.get(Calendar.YEAR),
                startTime.get(Calendar.MONTH),
                startTime.get(Calendar.DAY_OF_MONTH),
                12,0, 0);
        updateResume.setEndTime(endTime);
        updateResume.setSubject("Update Resume");
        mAppointmentCollection.add(updateResume);
        schedule.setAppointments(mAppointmentCollection);
        setContentView(schedule);
    }
}
