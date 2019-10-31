package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.Fragment.ContactosFragment;
import com.example.myapplication.Fragment.InformacionFragment;
import com.example.myapplication.Fragment.LlegadaFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView lle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lle=findViewById(R.id.llegada);
    }
    public void Lleg(View v){
        LlegadaFragment vista1Fragment = new LlegadaFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, vista1Fragment);
        fragmentTransaction.commit();
   }
}
