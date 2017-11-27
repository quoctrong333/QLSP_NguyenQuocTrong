package com.quoctrongnguyen.qlsp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.quoctrongnguyen.qlsp.R;
import com.quoctrongnguyen.qlsp.adapter.AdapterSP;
import com.quoctrongnguyen.qlsp.model.SanPham;

import java.util.ArrayList;

public class SanPhamActivity extends AppCompatActivity {
    ArrayList<SanPham> sanPhamArrayList;
    AdapterSP adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_pham);

//        sanPhamArrayList = new ArrayList<>();
//        ListView lstSanPham = findViewById(R.id.listviewsanpham);
//
//        Intent intent = getIntent();
//        Bundle bundle = intent.getBundleExtra("bundle");
//        sanPhamArrayList = (ArrayList<SanPham>) bundle.getSerializable("listsp");
//
//        adapter = new AdapterSP(getApplicationContext(), sanPhamArrayList);
//        lstSanPham.setAdapter(adapter);
    }
}
