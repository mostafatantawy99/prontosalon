package com.okason.prontosalon.schedule;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.syncfusion.schedule.ScheduleAppointmentCollection;
import com.syncfusion.schedule.SfSchedule;
import com.syncfusion.schedule.enums.ScheduleView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleFragment extends Fragment {

    private ScheduleAppointmentCollection mAppointmentCollection;
    private SfSchedule mSfSchedule;


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
        mSfSchedule.setScheduleView(ScheduleView.MonthView);
        return mSfSchedule;
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_schedule, container, false);
    }


}
