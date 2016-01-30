package com.okason.prontosalon.calendar;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.syncfusion.calendar.CalendarEventCollection;
import com.syncfusion.calendar.CalendarInlineEvent;
import com.syncfusion.calendar.SfCalendar;
import com.syncfusion.calendar.enums.SelectionMode;

import java.util.Calendar;

public class CalendarActivity extends AppCompatActivity {
    Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
        //setContentView(R.layout.activity_calendar);

        SfCalendar calendar = new SfCalendar(this);
        calendar.setSelectionMode(SelectionMode.SingleSelection);
        calendar.setCalendarTappedListener(new SfCalendar.calendarTappedListener() {
            @Override
            public void onCalendarTapped(Object o, Calendar calendar,
                                         CalendarEventCollection calendarEventCollection,
                                         CalendarInlineEvent calendarInlineEvent) {
                Toast.makeText(mActivity, calendar.getTime().toString(), Toast.LENGTH_SHORT).show();

            }
        });

        setContentView(calendar);
    }
}
