package com.example.listviewcolors;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    LinearLayout lnL;
    String[] toBeFilled;
    ArrayAdapter aa;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.listView);
        lnL=findViewById(R.id.linear);

        toBeFilled = getResources().getStringArray(R.array.Colors);
        ArrayAdapter adapter = new ArrayAdapter (this,
                android.R.layout.simple_list_item_1, android.R.id.text1, toBeFilled);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {



                if (position==0) {
                    lnL.setBackgroundColor(getResources().getColor(R.color.yellow));
                }

                if (position==2) {
                    lnL.setBackgroundColor(getResources().getColor(R.color.blue));
                }
                if (position==1) {
                    lnL.setBackgroundColor(getResources().getColor(R.color.green));
                }
                if (position==3) {
                    lnL.setBackgroundColor(getResources().getColor(R.color.red));
                }

            }
        });



    }

}
