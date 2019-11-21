package com.lamnt.nguyentunglam160702188;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private ImageView imgAnh;
    private TextView txtHoTen;
    private TextView txtNamSinh;
    private TextView txtTongDiem;
    private TextView txtKhuVuc;
    private Button btnQuayVe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Xem tong diem");
        initViews();

        Intent intent = getIntent();
        imgAnh.setImageResource(intent.getIntExtra("anh", 0));
        txtHoTen.setText(intent.getStringExtra("hoten"));
        txtNamSinh.setText(intent.getStringExtra("namsinh"));
        txtKhuVuc.setText(intent.getStringExtra("khuvuc"));
        double diemToan = Double.parseDouble(intent.getStringExtra("diemtoan"));
        double diemVan = Double.parseDouble(intent.getStringExtra("diemvan"));

        if (txtKhuVuc.getText().toString().equals("Khu vuc 1")) {
            txtTongDiem.setText(String.valueOf(diemToan + diemVan));
        }

        if (txtKhuVuc.getText().toString().equals("Khu vuc 2")) {
            txtTongDiem.setText(String.valueOf(diemToan + diemVan + 1));
        }


        btnQuayVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initViews() {
        imgAnh = findViewById(R.id.imgAnh);
        txtHoTen = findViewById(R.id.txtHoTen);
        txtNamSinh = findViewById(R.id.txtNamSinh);
        txtKhuVuc = findViewById(R.id.txtKhuVuc);
        txtTongDiem = findViewById(R.id.txtTongDiem);
        btnQuayVe = findViewById(R.id.btnQuayVe);
    }
}
