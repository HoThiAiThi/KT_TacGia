package com.example.kt_tacgia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChiTietBaiThoActivity extends AppCompatActivity {
    TextView txtChiTietBaiTho;
    ImageView imgTacPham;
    TextView txtBaiTho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_bai_tho);
        txtChiTietBaiTho =(TextView) findViewById(R.id.chitiettho);
        txtBaiTho =(TextView) findViewById(R.id.baitho);
        imgTacPham = (ImageView) findViewById(R.id.imgTacPham);
        imgTacPham.setImageResource(R.drawable.tacphammacngon);
        Intent intent= getIntent();
        txtChiTietBaiTho.setText(intent.getStringExtra("tentacpham"));
        if(intent.getStringExtra("tentacpham").equals("Châu chấu đỏ")){
            txtBaiTho.setText(ChiTietBaiTho.CHAUCHAUDO);
        }else if(intent.getStringExtra("tentacpham").equals("Cây tỏi nổi giận")){
            txtBaiTho.setText(ChiTietBaiTho.CAYTOINOIGIAN);
        }
        else if(intent.getStringExtra("tentacpham").equals("Báu vật của đời")){
            txtBaiTho.setText(ChiTietBaiTho.BAUVATCUADOI);
        }
        else if(intent.getStringExtra("tentacpham").equals("Đàn hương hình")){
            txtBaiTho.setText(ChiTietBaiTho.DANHUONGTINH);
        }
        ImageView imgBack= (ImageView) findViewById(R.id.btnBackChiTiet);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChiTietBaiThoActivity.this, com.example.kt_tacgia.DetailActivity.class));
            }
        });
    }


}