package com.okason.prontosalon.schedule;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.okason.prontosalon.R;
import com.syncfusion.schedule.ScheduleAppointment;
import com.syncfusion.schedule.ScheduleAppointmentCollection;
import com.syncfusion.schedule.SfSchedule;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreateAppointmentFragment extends Fragment {



    private View mRootView;
    private ScheduleActivity parentActivity;
    private SfSchedule mSfSchedule;
    private ScheduleAppointment mSelectedAppointment;
    private int mIndexOfAppointment;
    public final static String TAG = CreateAppointmentFragment.class.getSimpleName();

    private Object mObject;
    private Calendar mCalendar;
    private ScheduleAppointmentCollection mScheduleAppointmentCollection;
    private ScheduleAppointment mScheduleAppointment;

    Context mContext;
    View view;
    Calendar start_Calendar;
    Calendar end_Calendar;
    LinearLayout editor;
    TextView subjectTextView,locationText, startDate, startTime, endDate, endTime;
    private String s_time_string, e_time_string;


    public CreateAppointmentFragment() {
        // Required empty public constructor
    }


    public static CreateAppointmentFragment newInstance(
            String calender, String appointment, String collection){
        CreateAppointmentFragment fragment = new CreateAppointmentFragment();

        Bundle args = new Bundle();
        args.putString("Calendar", calender);
        args.putString("Collection", collection);
        args.putString("Appointment", appointment);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPassedInParameters();

    }

    private void getPassedInParameters(){
        Bundle args = getArguments();

        String serializedCalender = args.getString("Calendar");
        String serializedAppointment = args.getString("Appointment");
        String serializedCollection = args.getString("Collection");

        Gson gson = new Gson();
        try {
            mCalendar = gson.fromJson(serializedCalender, Calendar.class);
            mScheduleAppointment = gson.fromJson(serializedAppointment, ScheduleAppointment.class );
            mScheduleAppointmentCollection = gson.fromJson(serializedCollection, ScheduleAppointmentCollection.class);
        } catch (JsonSyntaxException e) {
            Log.d(TAG, "Object serialization failed " + e.getMessage() + " " + e.getCause());
        }
    }

    private void initializeSchedule() {
        mSfSchedule = new SfSchedule(getContext());


        try {
            Log.d(TAG, "Object: " + mObject.toString() + " Calender: "
                    + mCalendar.getTime().toString() + " collection size: "
                    + mScheduleAppointmentCollection.size() + " appointment " + mScheduleAppointment.getSubject());
        } catch (Exception e) {
            Log.e(TAG, "Error " + e.getCause() + " " +  e.getMessage());
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_create_appointment_dialog, container, false);
        initializeSchedule();
        return mRootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mCalendar != null ){
            makeText(mRootView, mCalendar.getTime().toString());
        }
    }

    private void makeText(View view, String message){
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);

        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.accent));
        TextView tv = (TextView)snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        tv.setTextColor(Color.WHITE);
        snackbar.show();
    }

}
