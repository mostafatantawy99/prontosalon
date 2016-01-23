package com.okason.prontosalon.clientlist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.okason.prontosalon.R;

/**
 * Created by Valentine on 1/10/2016.
 */
public class ClientListStateFragment extends Fragment {

    private ClientListActivity parentActivity;

    public static ClientListStateFragment newInstance(){
        return new ClientListStateFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        parentActivity = (ClientListActivity)getActivity();
        openFragment(ClientListFragment.newInstance(), "Client List");
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
