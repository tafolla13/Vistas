package com.example.myapplication.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.google.android.gms.maps.MapView;

/**
 * A simple {@link Fragment} subclass.
 */
public class LlegadaFragment extends Fragment {
    MapView map;


    public LlegadaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootView = inflater.inflate(R.layout.fragment_llegada, container, false);
       mapa(rootView);
       return rootView;
    }
    public void mapa(View v){
        map=v.findViewById(R.id.mapView);
    }

}
