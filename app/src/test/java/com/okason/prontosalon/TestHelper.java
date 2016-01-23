package com.okason.prontosalon;

import android.view.View;

import com.okason.prontosalon.events.BaseEvent;
import com.squareup.otto.Subscribe;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Valentine on 1/11/2016.
 */
public class TestHelper {

    private ArrayList<BaseEvent> events = new ArrayList<>();

    public static void assertViewIsVisible(View view){
        assertNotNull(view);
        assertThat(view.getVisibility(), equalTo(View.VISIBLE));
    }

    public BaseEvent getLastEvent(){
        if (!events.isEmpty()){
            return events.get(events.size() - 1);
        }
        return null;
    }

    @Subscribe
    public void onAnyEvent(BaseEvent event){
        events.add(event);
    }

    public int numberOfEvents(){
        return events.size();
    }
}
