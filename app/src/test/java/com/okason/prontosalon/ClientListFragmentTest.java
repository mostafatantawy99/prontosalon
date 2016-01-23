package com.okason.prontosalon;

import android.support.v7.widget.LinearLayoutManager;

import com.okason.prontosalon.clientlist.ClientListAdapter;
import com.okason.prontosalon.clientlist.ClientListFragment;
import com.okason.prontosalon.core.ClientBroadcastReceiver;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import javax.inject.Inject;

/**
 * Created by Valentine on 1/22/2016.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 18)
public class ClientListFragmentTest {
    private ClientListFragment fragment;

    private LinearLayoutManager mockLayoutManager;

    @Inject
    ClientListAdapter mockAdapter;

    @Inject
    ClientBroadcastReceiver mockBroadcastReceiver;

    @Before
    public void setUp() throws Exception {


    }
}
