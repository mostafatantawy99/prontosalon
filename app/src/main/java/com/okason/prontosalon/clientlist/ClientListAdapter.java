package com.okason.prontosalon.clientlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.okason.prontosalon.R;
import com.okason.prontosalon.model.Client;
import com.okason.prontosalon.util.ClientUtils;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Valentine on 1/10/2016.
 */
public class ClientListAdapter extends RecyclerView.Adapter<ClientListAdapter.ViewHolder> {
    private List<Client> mClients;
    private Context mContext;

    public ClientListAdapter(List<Client> clients, Context context){
        mClients = clients;
        mContext = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_client_list, parent,false);
        ViewHolder viewHolder = new ViewHolder(rowView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (mClients != null){
            try {
                final Client selectedClient = mClients.get(position);
                Picasso.with(mContext)
                        .load(selectedClient.getImagePath())
                        .placeholder(R.drawable.headshot_9)
                        .into(holder.mImageView);
                holder.mClientName.setText(selectedClient.getName());
                holder.mLastAppointmentDate.setText(ClientUtils
                        .formatLastAppointmentDate(selectedClient.getLastAppointmentDate()));
              //  holder.mComment.setText(selectedClient.getComments());

            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    @Override
    public int getItemCount() {
        return mClients == null ? 0 : mClients.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        @Bind(R.id.client_image) ImageView mImageView;
        @Bind(R.id.text_view_client_name) TextView mClientName;
        @Bind(R.id.text_view_last_appointment) TextView mLastAppointmentDate;
        @Bind(R.id.text_view_comment) TextView mComment;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
