package com.oms_infotech.www.socialmediacentre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    ListView listView;
    String a[]={"Facebook","Whatsapp","Twitter","LinkedIn","Gmail"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,a);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra("web",a[i]);
               startActivity(intent);
               // Toast.makeText(getApplicationContext(),a[i],Toast.LENGTH_LONG).show();

            }

        });
        listView.setAdapter(arrayAdapter);

    }
}
