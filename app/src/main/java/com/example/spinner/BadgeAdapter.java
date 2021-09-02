package com.example.spinner;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class BadgeAdapter extends ArrayAdapter<Badge> {

    public BadgeAdapter(Context context, ArrayList<Badge> badgeArrayList) {
        super(context, 0,badgeArrayList);
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position,
                                @Nullable View convertView,
                                @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }
    private View initView(int position,View convertView,ViewGroup parent){
        if(convertView==null){
            convertView=LayoutInflater.from(getContext()).inflate(R.layout.spinner_item,
                    parent,false);
        }
        ImageView imageViewBadge=convertView.findViewById(R.id.image_spinner);
        TextView textViewTitle=convertView.findViewById(R.id.text_spinner_title);
        Badge badgeItem=getItem(position);
        if(badgeItem!=null){
            imageViewBadge.setImageResource(badgeItem.getBadgeImage());
            textViewTitle.setText(badgeItem.getTitle());
        }

        return convertView;
    }
}
