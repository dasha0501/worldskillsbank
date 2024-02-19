package com.example.worldskillsbank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BanksAdapter extends BaseAdapter {
    private LayoutInflater LInflater;
    private ArrayList<DataBanks> list;


    public BanksAdapter(Context context, ArrayList<DataBanks> data){

        list = data;
        LInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public DataBanks getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        View v = convertView;


        if ( v == null){
            holder = new ViewHolder();
            v = LInflater.inflate(R.layout.banki_list_item, parent, false);
            holder.adres = (TextView) v.findViewById(R.id.adres);
            holder.sost = (TextView) v.findViewById(R.id.sost);
            holder.rasp = ((TextView) v.findViewById(R.id.rasp));
            v.setTag(holder);
        }



        holder = (ViewHolder) v.getTag();
        DataBanks dataBanks = getData(position);

        holder.adres.setText(v.getResources().getString(dataBanks.getAdresID()));
        holder.sost.setText(v.getResources().getString(dataBanks.getSostID()));
        holder.rasp.setText(v.getResources().getString(dataBanks.getRaspID()));

        return v;
    }


    DataBanks getData(int position){
        return (getItem(position));
    }


    private static class ViewHolder {
        private TextView adres;
        private TextView sost;
        private TextView rasp;
    }
}
