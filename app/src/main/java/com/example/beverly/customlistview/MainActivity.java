package com.example.beverly.customlistview;

import android.app.Person;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    //data container
    ArrayList<Person> list = new ArrayList<Person>();
    //adapter
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate
        this.lv = (ListView) this.findViewById(R.id.listView1);
        this.adapter=new CustomAdapter(this,list);

        //populate the list
        list.add(new Person(R.drawable.andrea,"DURANO, Andrea","BSIT-3"));

        //delegate the adapter to the listview
        this.lv.setAdapter(adapter);

    }
}

