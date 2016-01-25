package com.okason.prontosalon.clientlist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.okason.prontosalon.R;
import com.okason.prontosalon.data.InMemoryClientData;
import com.okason.prontosalon.model.Client;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClientListFragment extends Fragment {
    private View mRootView;
    @Bind(R.id.client_list) RecyclerView mRecyclerView;
    private List<Client> mClients;
    private ClientListAdapter mAdapter;



    public ClientListFragment() {
        // Required empty public constructor
    }

    public static ClientListFragment newInstance(){
        return new ClientListFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_client_list, container, false);
        ButterKnife.bind(this, mRootView);
        setupRecyclerView();
        return mRootView;

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    private void setupRecyclerView() {
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager;
        mRecyclerView.setBackgroundResource(R.drawable.background_client_list_hair);

        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mClients = InMemoryClientData.getDemoClients();
        mAdapter = new ClientListAdapter(mClients, getActivity());
        mRecyclerView.setAdapter(mAdapter);
    }

}
