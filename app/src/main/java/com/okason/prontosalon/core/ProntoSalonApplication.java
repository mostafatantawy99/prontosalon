package com.okason.prontosalon.core;

import android.app.Application;

import com.squareup.otto.Bus;

/**
 * Created by Valentine on 1/10/2016.
 */
public class ProntoSalonApplication extends Application {
    private static ProntoSalonApplication instance = new ProntoSalonApplication();
    private Bus bus;

    public static ProntoSalonApplication getInstance() {
        return instance;
    }

    public Bus getBus() {
        return bus;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance.bus = new Bus();
    }

    public static void postToBus(BaseEvent event){
        getInstance().getBus().post(event);
    }

}
