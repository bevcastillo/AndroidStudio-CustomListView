package com.example.beverly.customlistview;

import android.app.Person;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.beverly.customlistview.R.layout.custom_layout;

public class CustomAdapter extends BaseAdapter {
    Context context;
    //data container
    ArrayList<Person> list;
    LayoutInflater inflater;

    public CustomAdapter(Context context, ArrayList<Person> list) {
        this.context = context;
        this.list = list;
        this.inflater = inflater;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PersonHandler handler = null;
        if(convertView==null){
            convertView=inflater.inflate(custom_layout,null);
            handler = new PersonHandler();
            handler.iv = (ImageView) convertView.findViewById(R.id.imageView);
            handler.name = (TextView) convertView.findViewById(R.id.textView1);
            handler.course = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(handler);
        }
        else
            handler = (PersonHandler) convertView.getTag();
            //fill the view elements
            handler.iv.setImageResource(list.get(position).getImg());
            handler.name.setText(list.get(position).getName());
            handler.course.setText(list.get(position).getCourse());

            return convertView;
    }

    //create a static class to handle Person layout
    static class PersonHandler{
        ImageView iv;
        TextView name, course;
    }
}
