package com.example.kt_tacgia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    TextView txtName ;
    ImageView imgTacGia;
    ListView lvDetail;
    List<String> ar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtName = (TextView) findViewById(R.id.tenTacGiaDeTal);
        lvDetail =(ListView) findViewById(R.id.listViewDeTail);
        imgTacGia = (ImageView) findViewById(R.id.imgTacGia);
        ar = new ArrayList<>();
        Intent intent = getIntent();
        txtName.setText(intent.getStringExtra("name"));
        imgTacGia.setImageResource(R.drawable.macngon);
        ar.add(com.example.kt_tacgia.MacNgon.t1);
        ar.add(com.example.kt_tacgia.MacNgon.t2);
        ar.add(com.example.kt_tacgia.MacNgon.t3);
        ar.add(com.example.kt_tacgia.MacNgon.t4);
       ArrayAdapter arrayAdapter = new ArrayAdapter(DetailActivity.this, android.R.layout.simple_list_item_1,ar);
       lvDetail.setAdapter(arrayAdapter);
       lvDetail.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Intent intent1 = new Intent(DetailActivity.this,ChiTietBaiThoActivity.class);
              intent1.putExtra("tentacpham",ar.get(i));
              startActivity(intent1);
           }
       });

        ImageView imgBack =(ImageView) findViewById(R.id.btnBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailActivity.this,ListTacGiaActivity.class));
            }
        });
    }
}