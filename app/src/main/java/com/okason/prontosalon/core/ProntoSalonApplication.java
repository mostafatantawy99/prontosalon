package com.okason.prontosalon.core;

import android.app.Application;

import com.squareup.otto.Bus;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

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
        Fabric.with(this, new Crashlytics());
        instance.bus = new Bus();
    }

    public static void postToBus(BaseEvent event){
        getInstance().getBus().post(event);
    }

}
