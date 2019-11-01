package com.example.myapplication.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.TabAdapter;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView lle;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        lle=rootView.findViewById(R.id.llegada);
        Lleg();
        return rootView;
    }
    public void Lleg(){

        lle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager = v.findViewById(R.id.viewpager);
                tabLayout = v.findViewById(R.id.tabs);


                adapter = new TabAdapter(getChildFragmentManager());
                adapter.addFragment(new Llegada2Fragment(), "Llegada");
                adapter.addFragment(new ContactosFragment(), "Contactos");
                adapter.addFragment(new InformacionFragment(), "Detalles");
                viewPager.setAdapter(adapter);
                tabLayout.setupWithViewPager(viewPager);

                Toast.makeText(getActivity(),"rer",Toast.LENGTH_LONG).show();

                Llegada2Fragment vista1Fragment = new Llegada2Fragment();
                FragmentManager fragmentManager = getChildFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.viewpager, vista1Fragment);
                fragmentTransaction.commit();
            }
        });

    }
}
