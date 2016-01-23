package com.okason.prontosalon.clientlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.okason.prontosalon.R;
import com.okason.prontosalon.util.Constants;

public class ClientListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       if (getSupportFragmentManager()
               .findFragmentByTag(Constants.CLIENT_LIST_FRAGMENT_TAG) == null){
           getSupportFragmentManager()
                   .beginTransaction()
                   .add(ClientListStateFragment.newInstance(),
                           Constants.CLIENT_LIST_FRAGMENT_TAG)
                   .commit();
       }
    }

}
