package com.example.firebasestorage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class HinhAnhAdapter extends ArrayAdapter<HinhAnh> {
    Activity mContext;
    List<HinhAnh> objects;
    int resource;

    public HinhAnhAdapter(Context context, int resource,  List<HinhAnh> objects) {
        super(context, resource, objects);
        this.mContext= (Activity) context;
        this.resource=resource;
        this.objects=objects;
    }

    public View getView(final int position, View convertView, ViewGroup parent){
        final ViewHolder viewHolder;
        LayoutInflater layoutInflater=this.mContext.getLayoutInflater();


        if(convertView==null){
            convertView=layoutInflater.inflate(this.resource,null);
            viewHolder= new ViewHolder();
            viewHolder.txtName=convertView.findViewById(R.id.txtName);
            viewHolder.imgHinh=convertView.findViewById(R.id.imgHinh);

            viewHolder.position=position;

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        HinhAnh hinhAnh=objects.get(position);
        viewHolder.txtName.setText(hinhAnh.getTenHinh().toString());
        Picasso.with(mContext).load(hinhAnh.getUrlHinh()).into(viewHolder.imgHinh);

        return convertView;
    }
    public static class ViewHolder{
        TextView txtName;
        ImageView imgHinh;
        int position;
    }
}
