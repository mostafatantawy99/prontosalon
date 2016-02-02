package com.okason.prontosalon;


import android.support.test.espresso.ViewAssertion;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.okason.prontosalon.schedule.ScheduleActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Valentine on 1/30/2016.
 */


@RunWith(AndroidJUnit4.class)
@LargeTest
public class ScheduleActivityTest {
    @Rule
    public final ActivityTestRule<ScheduleActivity> schedule = new ActivityTestRule<>(ScheduleActivity.class);

    @Test
    public void shouldBeVisible() throws Exception {
        onView(withId(R.layout.activity_schedule))
                .check((ViewAssertion) isDisplayed());

    }
}
