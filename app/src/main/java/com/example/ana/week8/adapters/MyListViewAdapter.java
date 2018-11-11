package com.example.ana.week8.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ana.week8.R;
import com.example.ana.week8.models.DatasModel;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyListViewAdapter extends BaseAdapter{
    private ArrayList<DatasModel> dataList;
    private Context context;

    public MyListViewAdapter(ArrayList<DatasModel> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, R.layout.layout_listview, null);
        TextView name = (TextView) view.findViewById(R.id.textview_name);
        TextView lastName = (TextView) view.findViewById(R.id.textview_lastname);
        TextView age = (TextView) view.findViewById(R.id.textview_age);
        name.setText(dataList.get(position).getName());
        lastName.setText(dataList.get(position).getLastName());
        age.setText(Integer.toString(dataList.get(position).getAge()));
        return view;
    }
}
