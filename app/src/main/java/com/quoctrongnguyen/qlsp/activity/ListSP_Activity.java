package com.quoctrongnguyen.qlsp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.quoctrongnguyen.qlsp.R;
import com.quoctrongnguyen.qlsp.adapter.AdapterSP;
import com.quoctrongnguyen.qlsp.model.SanPham;

import java.util.ArrayList;

public class ListSP_Activity extends AppCompatActivity
{
    ListView lstSanPham;
    AdapterSP adapter;
    ArrayList<SanPham> sanPhamArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_pham);
        addControl();
        init();
    }

    private void addControl()
    {
        lstSanPham = findViewById(R.id.lvSP);
    }

    private void init()
    {
        //data
        sanPhamArrayList = new ArrayList<>();
        sanPhamArrayList.add(new SanPham("Ma SP test", "Ten SP test", android.R.drawable.ic_menu_edit));
        //adapter
        adapter = new AdapterSP(getApplicationContext(), sanPhamArrayList);
        //set adapter
        lstSanPham.setAdapter(adapter);
    }
}
