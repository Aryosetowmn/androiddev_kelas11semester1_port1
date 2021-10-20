package com.awslab.portfolioapp.cv;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.awslab.portfolioapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CVFragment extends Fragment {

    RecyclerView RvCv;
    CVAdapter adapter ;
    List<CVItem> items;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RvCv = view.findViewById(R.id.recyclerview_cv);

        // create a list of cv items
        items = new ArrayList<>();
        items.add(new CVItem("2020 ~ 2022 SMK Raden Umar Said Kudus",getString(R.string.lorem_text3)));
        items.add(new CVItem("2017 ~ 2019 SMPI Al - Azhar 23 Semarang",getString(R.string.lorem_text2)));
        items.add(new CVItem("2011 ~ 2016 SDI Al - Azhar 25 Semarang",getString(R.string.lorem_text)));

        adapter = new CVAdapter(items);

        RvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        RvCv.setAdapter(adapter);



    }

    public CVFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cv, container, false);
    }

}
