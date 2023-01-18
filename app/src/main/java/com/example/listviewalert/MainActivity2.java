package com.example.listviewalert;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
    ListView costomlistview1;
    ArrayAdapter arrayAdapter;
    String [] title = {"titiel 1","title 2","title 3","title4","title 5"};
    String [] subtitle = {"sub title1","sub title2","sub title3","sub title4","sub title5",};
    Integer [] imgid = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MylistView adp = new MylistView(this,title,subtitle,imgid);
        costomlistview1 = findViewById(R.id.customlistview1);
        costomlistview1.setAdapter(arrayAdapter);
        


    }
}