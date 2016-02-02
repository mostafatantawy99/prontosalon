package com.okason.prontosalon.schedule;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.okason.prontosalon.core.BaseFragment;
import com.okason.prontosalon.model.Appointment;
import com.okason.prontosalon.model.Client;
import com.okason.prontosalon.schedule.events.StartNewAppointmentEvent;
import com.okason.prontosalon.util.ClientUtils;
import com.syncfusion.schedule.ScheduleAppointment;
import com.syncfusion.schedule.ScheduleAppointmentCollection;
import com.syncfusion.schedule.SfSchedule;
import com.syncfusion.schedule.enums.ScheduleView;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleFragment extends BaseFragment {

    private ScheduleAppointmentCollection mAppointmentCollection;
    private SfSchedule mSfSchedule;
    public final static String TAG = ScheduleFragment.class.getSimpleName();


    public ScheduleFragment() {
        // Required empty public constructor
    }

    public static ScheduleFragment newInstance() {
        return new ScheduleFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mSfSchedule = new SfSchedule(getContext());
        setSchedule();
        return mSfSchedule;

    }

    private void setSchedule() {
        mSfSchedule.setScheduleView(ScheduleView.MonthView);
        final ScheduleAppointmentCollection collection = new ScheduleAppointmentCollection();

        Appointment appointment1 = new Appointment();
        Client client1 = new Client(ClientUtils.getNetId());
        client1.setName("James Doe");
        client1.setPreferredAppointmentDay("Tues");

        appointment1.setClient(client1);
        Calendar startTime2 = Calendar.getInstance();
        startTime2.set
                (
                        startTime2.get(Calendar.YEAR),
                        startTime2.get(Calendar.MONTH),
                        startTime2.get(Calendar.DAY_OF_MONTH),
                        9,
                        0,
                        0
                );
        appointment1.setStartTime(startTime2);

        Calendar endTime2 = Calendar.getInstance();
        endTime2.set
                (
                        endTime2.get(Calendar.YEAR),
                        endTime2.get(Calendar.MONTH),
                        endTime2.get(Calendar.DAY_OF_MONTH),
                        13,
                        0,
                        0
                );
        appointment1.setEndTime(endTime2);
        appointment1.setSubject(appointment1.getClient().getName());
        collection.add(appointment1);

        ScheduleAppointment clientMeeting = new ScheduleAppointment();
        Calendar startTime = Calendar.getInstance();
        startTime.set
                (
                        startTime.get(Calendar.YEAR),
                        startTime.get(Calendar.MONTH),
                        startTime.get(Calendar.DAY_OF_MONTH),
                        10,
                        0,
                        0
                );
        clientMeeting.setStartTime(startTime);

        //setting end time for the event
        Calendar endTime = Calendar.getInstance();
        endTime.set
                (
                        endTime.get(Calendar.YEAR),
                        endTime.get(Calendar.MONTH),
                        endTime.get(Calendar.DAY_OF_MONTH),
                        12,
                        0,
                        0
                );
        clientMeeting.setEndTime(endTime);
        //setting Subject for the event
        clientMeeting.setSubject("Client Meeting");


        collection.add(clientMeeting);
        mSfSchedule.setAppointments(collection);



        mSfSchedule.setScheduleView(ScheduleView.WeekView);
        mSfSchedule.setScheduleTappedListener(new SfSchedule.scheduleTappedListener() {
            @Override
            public void onScheduleTapped(Object o, Calendar calendar,
                                         ScheduleAppointmentCollection scheduleAppointmentCollection,
                                         ScheduleAppointment scheduleAppointment) {
                postToBus(new StartNewAppointmentEvent(o, calendar, scheduleAppointmentCollection, scheduleAppointment));
                Log.d(TAG, "Object: " + o.toString() + " Calender: "
                        + calendar.getTime().toString() + " collection size: "
                        + collection.size() + " appointment " + scheduleAppointment.getSubject() );

            }
        });
    }


}
