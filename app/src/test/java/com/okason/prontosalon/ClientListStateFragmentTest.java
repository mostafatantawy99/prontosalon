package com.okason.prontosalon;

import android.os.Build;

import com.okason.prontosalon.clientlist.ClientListActivity;
import com.okason.prontosalon.clientlist.ClientListStateFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.TestCase.assertNotNull;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;

/**
 * Created by Valentine on 1/11/2016.
 */
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class ClientListStateFragmentTest {
    private ClientListStateFragment fragment;
    private ClientListActivity activity;

    @Before
    public void setUp() throws Exception {
        fragment = ClientListStateFragment.newInstance();
        startFragment(fragment);

    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(fragment);

    }


}
