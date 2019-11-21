package com.lamnt.nguyentunglam160702188;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView imgAnh;
    private EditText edtHoTen;
    private EditText edtNamSinh;
    private EditText edtDiemToan;
    private EditText edtDiemVan;
    private Spinner spnKhuVuc;
    private Button btnXemDiemThi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Thong tin thi sinh");
        initViews();

        ArrayList<String> khuvucs = new ArrayList<>();
        khuvucs.add("Khu vuc 1");
        khuvucs.add("Khu vuc 2");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,khuvucs);

        spnKhuVuc.setAdapter(adapter);

        btnXemDiemThi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("anh",R.drawable.bg);
                intent.putExtra("hoten",edtHoTen.getText().toString());
                intent.putExtra("namsinh",edtNamSinh.getText().toString());
                intent.putExtra("diemtoan",edtDiemToan.getText().toString());
                intent.putExtra("diemvan",edtDiemVan.getText().toString());
                intent.putExtra("khuvuc",(String) spnKhuVuc.getSelectedItem());
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        imgAnh = findViewById(R.id.imgAnh);
        imgAnh.setImageResource(R.drawable.bg);
        edtHoTen = findViewById(R.id.edtHoTen);
        edtNamSinh = findViewById(R.id.edtNamSinh);
        edtDiemToan = findViewById(R.id.edtDiemToan);
        edtDiemVan = findViewById(R.id.edtDiemVan);
        spnKhuVuc = findViewById(R.id.spnKhuVuc);
        btnXemDiemThi = findViewById(R.id.btnXemDiemThi);
    }
}
