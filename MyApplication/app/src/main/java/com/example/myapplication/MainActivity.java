package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.HorizontalScrollView;

import com.example.myapplication.Fragment.ContactosFragment;
import com.example.myapplication.Fragment.InformacionFragment;
import com.example.myapplication.Fragment.LlegadaFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabs);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new LlegadaFragment(), "Llegada");
        adapter.addFragment(new ContactosFragment(), "Contactos");
        adapter.addFragment(new InformacionFragment(), "Detalles");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
