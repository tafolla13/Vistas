package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.view.View;

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
        /*viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabs);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new LlegadaFragment(), "Llegada");
        adapter.addFragment(new ContactosFragment(), "Contactos");
        adapter.addFragment(new InformacionFragment(), "Detalles");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);*/
    }
    public void Lleg(View v){
        LlegadaFragment vista1Fragment = new LlegadaFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, vista1Fragment);
        fragmentTransaction.commit();
   }
}
