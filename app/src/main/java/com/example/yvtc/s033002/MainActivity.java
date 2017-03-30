package com.example.yvtc.s033002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    String cities[] = {"Taipei", "Taichung", "Tainan", "Kaoshung"};
    String codes[] = {"02", "04", "06", "07"};
    ArrayList<Map<String, String>> mylist = new ArrayList<>();
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int i;
        lv = (ListView) findViewById(R.id.listView);

        for (i=0; i<cities.length; i++) {
            Map m = new HashMap();
            m.put("city", cities[i]);
            m.put("code", codes[i]);
            mylist.add(m);
        }

        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, mylist,
                R.layout.myitem, new String[] {"city", "code"},
                new int[] {R.id.textView, R.id.textView2});
        lv.setAdapter(adapter);
    }
}
