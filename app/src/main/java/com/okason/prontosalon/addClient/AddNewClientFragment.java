package com.okason.prontosalon.addClient;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.okason.prontosalon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddNewClientFragment extends Fragment {


    public AddNewClientFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_new_client, container, false);
    }

}
