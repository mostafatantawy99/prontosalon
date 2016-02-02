package com.okason.prontosalon.core;


import android.support.v4.app.Fragment;

import com.squareup.otto.Bus;

/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {

    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public void onResume() {
        super.onResume();
        getAppBus().register(this);
    }

    @Override
    public void onPause() {
        getAppBus().unregister(this);
        super.onPause();
    }

    protected Bus getAppBus(){
        return ProntoSalonApplication.getInstance().getBus();
    }

    protected void postToBus(BaseEvent event){
        ProntoSalonApplication.postToBus(event);
    }
}
