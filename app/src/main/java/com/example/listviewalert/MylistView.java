package com.example.listviewalert;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MylistView extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] title;
    private final String[] subtitle;
    private final Integer[] imgid;


    public MylistView(Activity context, String[] title,String[] subtitle,Integer[] imgid) {
        super(context, R.layout.mylist,title);
        this.context = context;
        this.title = title;
        this.subtitle = subtitle;
        this.imgid = imgid;
    }

    @NonNull
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist,null,true);
        TextView title1 = (TextView) rowView.findViewById(R.id.txv1);
        TextView subtitle1 = (TextView)  rowView.findViewById(R.id.txv2);
        ImageView imageView = (ImageView)  rowView.findViewById(R.id.list_item);

        title1.setText(title[position]);
        imageView.setImageResource(imgid[position]);
        subtitle1.setText(subtitle[position]);

        return  rowView;
    }
}
