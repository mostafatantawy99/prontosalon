package com.okason.prontosalon.schedule;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.google.gson.Gson;
import com.okason.prontosalon.R;
import com.okason.prontosalon.core.BaseFragment;
import com.okason.prontosalon.schedule.events.FinishNewAppointmentEvent;
import com.okason.prontosalon.schedule.events.StartNewAppointmentEvent;
import com.squareup.otto.Subscribe;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleStateFragment extends BaseFragment {

    private ScheduleActivity parentActivity;
    public final static String TAG = ScheduleStateFragment.class.getSimpleName();




    public ScheduleStateFragment() {
        // Required empty public constructor
    }

    public static ScheduleStateFragment newInstance(){
        return new ScheduleStateFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        parentActivity = (ScheduleActivity) getActivity();
        openFragment(ScheduleFragment.newInstance(), "Schedule");
    }

    /**
     * This saves the Schedule information that was passed from the
     * onTappedListener event to the parent activity so that the
     * Create Appointment Fragment can retrieve it from the parent+
      * @param event
     */
   @Subscribe
   public void onStartNewAppointment(StartNewAppointmentEvent event){
        parentActivity.setObject(event.getObject());
        parentActivity.setScheduleAppointment(event.getScheduleAppointment());
        parentActivity.setScheduleAppointmentCollection(event.getScheduleAppointmentCollection());
        parentActivity.setCalendar(event.getCalendar());

       Gson gson = new Gson();
       String serializedCalender = null;
       String serializedAppointment = null;
       String serializedCollection = null;
       try {
           serializedCalender = gson.toJson(event.getCalendar());
           serializedAppointment = gson.toJson(event.getScheduleAppointment());
           serializedCollection = gson.toJson(event.getScheduleAppointmentCollection());
       } catch (Exception e) {
           Log.d(TAG, "Object serialization failed " + e.getMessage() + " " + e.getCause());
       }

       openFragment(CreateAppointmentFragment
               .newInstance(serializedCalender, serializedAppointment,
                       serializedCollection), "Create Appointment");

       Log.d(TAG, "Object: " + event.getObject().toString() + " Calender: "
               + event.getCalendar().getTime().toString() + " collection size: "
               + event.getScheduleAppointmentCollection().size() + " appointment "
               + event.getScheduleAppointment().getSubject());


   }

   public void onCreateNewAppointment(FinishNewAppointmentEvent event){

   }


    private void openFragment(Fragment fragment, String screenTitle){

        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit();
        parentActivity.getSupportActionBar().setTitle(screenTitle);
    }

}
