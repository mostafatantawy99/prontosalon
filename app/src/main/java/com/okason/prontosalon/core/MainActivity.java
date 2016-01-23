package com.okason.prontosalon.core;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.okason.prontosalon.R;
import com.okason.prontosalon.calendar.ScheduleFragment;
import com.okason.prontosalon.clientlist.ClientListStateFragment;

public class MainActivity extends AppCompatActivity {

    public static final String STATE_FRAGMENT_TAG = "ClientListState";

    //navigation drawer header
    private AccountHeader headerResult = null;
    private Drawer result = null;

    //Toolbar
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ScheduleFragment.newInstance())
                    .commit();
            addClientStateFragment();
        }
    }

    private void addClientStateFragment(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(ClientListStateFragment.newInstance(), STATE_FRAGMENT_TAG);
        transaction.commit();

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    private void buildHeader(boolean compact, Bundle savedInstanceState){
        //create the AccountHeader
        headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.header)
                .withCompactStyle(compact)
                .withSavedInstance(savedInstanceState)
                .build();
    }


}
