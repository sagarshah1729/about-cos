package com.aditya.adityarom;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Build;

import java.util.ArrayList;
import java.util.List;

public class infoAdapter extends RecyclerView.Adapter<infoAdapter.ViewHolder> {

    List<AdapterData> mItems;

    public infoAdapter() {
        super();
        mItems = new ArrayList<AdapterData>();
        AdapterData data = new AdapterData();
        data.setName("");
        data.setDetail("");
        mItems.add(data);

        data = new AdapterData();
        data.setName("About Cosmic-OS");
        data.setDetail("Cosmic-OS is an AOSP-based custom ROM with full Substratum support, The aim of this ROM is to deliver light-speed performance with plenty of features, a high level of fluidity, and good battery life. We hope that you\\'ll love our work, and help us in making it even better in the future. \n");
        mItems.add(data);

    }

  /*  private String device()
    {
        String Fullinfo;
        String bootloader = Build.BOOTLOADER;
        String model = bootloader.substring(0,5);
        if (model.equals("G7102")) {
            Fullinfo = "Model: SM-G7102\ncodename: ms013g\nBootloader: "    + bootloader ;
        } else if (model.equals("G7105")) {
            Fullinfo = "Model: SM-G7105\ncodename: ms01lte\nBootloader: "   + bootloader ;
       } else {
            Fullinfo = model;
        }
        return  Fullinfo;
    } */

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_box, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        AdapterData movie = mItems.get(i);
        viewHolder.natName.setText(movie.getName());
        viewHolder.natDetail.setText(movie.getDetail());
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView natThumbnail;
        public TextView natName;
        public TextView natDetail;
        CardView cv;


        public ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv_info);
            natName = (TextView)itemView.findViewById(R.id.card_name);
            natDetail = (TextView)itemView.findViewById(R.id.card_detail);
        }
    }
}
