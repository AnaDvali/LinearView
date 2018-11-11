package com.example.ana.week8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ana.week8.adapters.MyListViewAdapter;
import com.example.ana.week8.models.DatasModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DatasModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0; i<MyDatas.Age.length; i++){
            DatasModel myDataObject = new DatasModel(
                    MyDatas.Name[i],
                    MyDatas.LastName[i],
                    MyDatas.Age[i]
            );
            list.add(myDataObject);
        }
        MyListViewAdapter adapter = new MyListViewAdapter(list, this);
        ListView myListView = (ListView)findViewById(R.id.MyListView);
        myListView.setAdapter(adapter);
    }
}
