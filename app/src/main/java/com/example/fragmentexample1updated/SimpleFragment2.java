package com.example.fragmentexample1updated;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SimpleFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SimpleFragment2 extends Fragment {


    public SimpleFragment2() {
        // Required empty public constructor
    }

    public static SimpleFragment2 newInstance(){
        return new SimpleFragment2();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_simple2, container, false);
        return view;


    }
}