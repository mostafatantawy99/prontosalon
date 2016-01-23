package com.okason.prontosalon;

import android.os.Build;
import android.support.v7.widget.RecyclerView;

import com.okason.prontosalon.clientlist.ClientListFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import static org.junit.Assert.*;

import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;

/**
 * Created by Valentine on 1/10/2016.
 */

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class ClientListTest {
    private ClientListFragment fragment;
    private RecyclerView recyclerView;


    @Before
    public void setUp() throws Exception {
        fragment = ClientListFragment.newInstance();
        startFragment(fragment);

    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(fragment);

    }
}
