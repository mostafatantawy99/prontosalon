package com.okason.prontosalon.schedule;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.okason.prontosalon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreateAppointmentDialogFragment extends Fragment {
    private View mRootView;


    public CreateAppointmentDialogFragment() {
        // Required empty public constructor
    }


    public static CreateAppointmentDialogFragment newInstance(){
        CreateAppointmentDialogFragment fragment = new CreateAppointmentDialogFragment();


        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_create_appointment_dialog, container, false);

        return mRootView;
    }

}
