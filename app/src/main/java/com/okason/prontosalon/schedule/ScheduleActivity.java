package com.okason.prontosalon.schedule;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.okason.prontosalon.R;
import com.okason.prontosalon.core.MainActivity;
import com.okason.prontosalon.util.Constants;
import com.syncfusion.schedule.ScheduleAppointment;
import com.syncfusion.schedule.ScheduleAppointmentCollection;

import java.util.Calendar;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ScheduleActivity extends AppCompatActivity {

    private Activity mActivity;
    @Bind(R.id.toolbar) Toolbar toolbar;
    @Bind(R.id.fab) FloatingActionButton fab;

    private Object mObject;
    private Calendar mCalendar;
    private ScheduleAppointmentCollection mScheduleAppointmentCollection;
    private ScheduleAppointment scheduleAppointment;

    public final static String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        addStateFragment();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void addStateFragment() {
        if (getSupportFragmentManager().findFragmentByTag(Constants.SCHEDULE_FRAGMENT_TAG) == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(ScheduleStateFragment.newInstance(), Constants.SCHEDULE_FRAGMENT_TAG);
            transaction.commit();
        }
    }

    public Object getObject() {
        return mObject;
    }

    public void setObject(Object object) {
        mObject = object;
    }

    public Calendar getCalendar() {
        Log.d(TAG, "Calendar get " + mCalendar.getTime().toString());
        return mCalendar;
    }

    public void setCalendar(Calendar calendar) {
        mCalendar = calendar;
        Log.d(TAG, "Calendar set " + calendar.getTime().toString());
    }

    public ScheduleAppointmentCollection getScheduleAppointmentCollection() {
        Log.d(TAG, "Collection set " + mScheduleAppointmentCollection.size());
        return mScheduleAppointmentCollection;
    }

    public void setScheduleAppointmentCollection(ScheduleAppointmentCollection scheduleAppointmentCollection) {
        mScheduleAppointmentCollection = scheduleAppointmentCollection;
        Log.d(TAG, "Collection set " + scheduleAppointmentCollection.size());
    }

    public ScheduleAppointment getScheduleAppointment() {
        Log.d(TAG, "Appointment get " + scheduleAppointment.getSubject());
        return scheduleAppointment;
    }

    public void setScheduleAppointment(ScheduleAppointment scheduleAppointment) {
        this.scheduleAppointment = scheduleAppointment;
        Log.d(TAG, "Appointment set " + scheduleAppointment.getSubject());
    }
}
