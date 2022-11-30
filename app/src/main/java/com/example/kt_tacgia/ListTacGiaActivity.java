package com.example.kt_tacgia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListTacGiaActivity extends AppCompatActivity {
    ListView listViewTacGia;
    ArrayList<com.example.kt_tacgia.TacGia> tacGiaArrayList;
    com.example.kt_tacgia.AdapterTacGia adapterTacGia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tac_gia);
        listViewTacGia =(ListView) findViewById(R.id.listView);
        tacGiaArrayList = new ArrayList<>();
        tacGiaArrayList.add(new com.example.kt_tacgia.TacGia(R.drawable.macngon,"Mạc Ngôn","Nhà Văn","4"));
        tacGiaArrayList.add(new com.example.kt_tacgia.TacGia(R.drawable.huycan,"Huy Cận","Nhà Văn","4"));
        tacGiaArrayList.add(new com.example.kt_tacgia.TacGia(R.drawable.xuanquynh,"Xuân Quỳnh","Nhà Văn","4"));
        tacGiaArrayList.add(new com.example.kt_tacgia.TacGia(R.drawable.shakespeare,"Shakespeare","Nhà Văn","4"));
        tacGiaArrayList.add(new com.example.kt_tacgia.TacGia(R.drawable.hemingway,"Hemingway","Nhà Văn","5"));
        tacGiaArrayList.add(new com.example.kt_tacgia.TacGia(R.drawable.nguyenkhoadiem,"Nguyễn Khoa Điềm","Nhà Văn","4"));
        adapterTacGia = new com.example.kt_tacgia.AdapterTacGia(ListTacGiaActivity.this,R.layout.custom_line_tacgia, tacGiaArrayList);
        listViewTacGia.setAdapter(adapterTacGia);

      listViewTacGia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Intent intent = new Intent(ListTacGiaActivity.this, com.example.kt_tacgia.DetailActivity.class);
              intent.putExtra("name",tacGiaArrayList.get(i).getTen());
              startActivity(intent);
          }
      });
    }
}