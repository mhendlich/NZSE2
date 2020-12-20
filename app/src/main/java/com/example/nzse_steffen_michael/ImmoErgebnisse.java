package com.example.nzse_steffen_michael;

import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ImmoErgebnisse extends Fragment {
    public ImmoErgebnisse() {
        super(R.layout.fragment_immo_ergebnisse);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab_Ergebnisse);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((OverviewScreen)getActivity()).changeScreen(Screen.FILTER);
            }
        });
    }


}