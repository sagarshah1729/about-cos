package com.aditya.adityarom;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Cosmic-OS Developers
 */
public class DeveloperAdapter extends RecyclerView.Adapter<DeveloperAdapter.ViewHolder> {

    List<AdapterData> mItems;

    public DeveloperAdapter() {
        super();
        mItems = new ArrayList<AdapterData>();
        AdapterData data = new AdapterData();
        data.setThumbnail(R.drawable.sagar);
        data.setName("Sagar Shah");
        data.setDetail("Founder/Lead Developer");
        mItems.add(data);

        data = new AdapterData();
        data.setThumbnail(R.drawable.aditya);
        data.setName("Aditya Upreti");
        data.setDetail("Co-Founder/Developer/App Developer");
        mItems.add(data);

        data = new AdapterData();
        data.setThumbnail(R.drawable.agent);
        data.setName("Agent_Fabulous");
        data.setDetail("Developer/Web Developer");
        mItems.add(data);

        data = new AdapterData();
        data.setThumbnail(R.drawable.jo);
        data.setName("Joshua Baldassarre");
        data.setDetail("Head Of Graphics/logo's");
        mItems.add(data);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        AdapterData movie = mItems.get(i);
        viewHolder.natThumbnail.setImageResource(movie.getThumbnail());
        viewHolder.natName.setText(movie.getName());
        viewHolder.natDetail.setText(movie.getDetail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView natThumbnail;
        public TextView natName;
        public TextView natDetail;
        CardView cv;


        public ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            natThumbnail = (ImageView)itemView.findViewById(R.id.card_photo);
            natName = (TextView)itemView.findViewById(R.id.card_name);
            natDetail = (TextView)itemView.findViewById(R.id.card_detail);
        }
    }
}