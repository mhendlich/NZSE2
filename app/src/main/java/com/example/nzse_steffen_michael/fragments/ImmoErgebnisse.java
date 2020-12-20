package com.example.nzse_steffen_michael.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.nzse_steffen_michael.ContainerActivity;
import com.example.nzse_steffen_michael.DataObjects.ErgebnissDataObject;
import com.example.nzse_steffen_michael.R;
import com.example.nzse_steffen_michael.DataObjects.Screen;
import com.example.nzse_steffen_michael.adapters.CustomListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


public class ImmoErgebnisse extends Fragment {

    private ListView listView;
    private TextView statusTextView;
    private List<ErgebnissDataObject> userErgebnissDataobjectList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_immo_ergebnisse, container, false);
        Context context = getContext();
        if (context != null) {
            statusTextView = view.findViewById(R.id.result_text_view);
            listView = view.findViewById(R.id.immob_result);
            userErgebnissDataobjectList = new ArrayList<>();

            // -- ADDING SOME MOCK DATA --//
            for (int i = 0; i < 8; i++) {
                ErgebnissDataObject e;

                if (i < 3) {
                    e = new ErgebnissDataObject(
                            "HOUSE NUMBER " + String.valueOf(i),
                            "1010" + String.valueOf(i) + " $",
                            true);
                } else {
                    e = new ErgebnissDataObject(
                            "HOUSE NUMBER " + String.valueOf(i), null,
                            "1010" + String.valueOf(i) + " $/MONAT",
                            false);

                }
                userErgebnissDataobjectList.add(e);

            }
            // ----- //
            statusTextView.setText(userErgebnissDataobjectList.size() + " Ergebnisse");
            CustomListAdapter resultListAdapter = new CustomListAdapter(requireActivity(),
                    R.layout.list_row, userErgebnissDataobjectList);
            listView.setAdapter(resultListAdapter);
        }
        return view;
    }

    public ImmoErgebnisse() {
        super(R.layout.fragment_immo_ergebnisse);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab_Ergebnisse);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((ContainerActivity) getActivity()).changeScreen(Screen.FILTER);
            }
        });
    }


}