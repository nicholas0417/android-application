package com.example.user.icp09;

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
 * Created by Darrow Huang on 2017/5/13.
 */

public class KFCAdapter extends ArrayAdapter {
    Context context;
    int layoutResourceId;
    KFC data[] = null;

    public KFCAdapter(Context context, int layoutResourceId, KFC[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        KFCHolder holder = null;
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new KFCHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imageView);
            holder.txtTitle = (TextView)row.findViewById(R.id.textView5);


            row.setTag(holder);
        }
        else
        {
            holder = (KFCHolder)row.getTag();
        }

        KFC kfc = data[position];
        holder.txtTitle.setText(kfc.title);
        holder.imgIcon.setImageResource(kfc.icon);

        return row;
        //return super.getView(position, convertView, parent);
    }
    static class KFCHolder
    {
        ImageView imgIcon;
        TextView txtTitle;

    }
}
