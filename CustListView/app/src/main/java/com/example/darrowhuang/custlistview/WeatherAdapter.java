package com.example.darrowhuang.custlistview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Darrow Huang on 2017/5/1.
 */

public class WeatherAdapter extends ArrayAdapter<Weather> {
    Context context;
    int layoutResourceId;
    Weather data[]=null;

    public WeatherAdapter(Context context,int layoutResourceId,Weather data[]){
        super(context,layoutResourceId,data);
        this.layoutResourceId=layoutResourceId;
        this.context=context;
        this.data=data;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        WeatherHolder holder = null;
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new WeatherHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imageView);
            holder.txtTitle = (TextView)row.findViewById(R.id.textView3);

            row.setTag(holder);
        }
        else
        {
            holder = (WeatherHolder)row.getTag();
        }
        //return super.getView(position, convertView, parent);
        Weather wea = data[position];
        holder.txtTitle.setText(wea.title);
        holder.imgIcon.setImageResource(wea.icon);

        return row;
    }
    static class WeatherHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}
