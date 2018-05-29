package com.dodrop.riderapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Lenny Kamande on 5/16/2018.
 */

public class BottomSheetRiderFragment extends BottomSheetDialogFragment {
    String mLocation, mDestintion;

    public static BottomSheetRiderFragment newInstance(String location, String destination)
    {
        BottomSheetRiderFragment f = new BottomSheetRiderFragment();
        Bundle args = new Bundle();
        args.putString("location", location);
        args.putString("destination", destination);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLocation = getArguments().getString("location");
        mDestintion = getArguments().getString("destination");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_rider, container, false);
        TextView txtLocation = (TextView)view.findViewById(R.id.txtLocation);
        TextView txtDestination = (TextView)view.findViewById(R.id.txtDestination);
        TextView txtCalculate = (TextView)view.findViewById(R.id.txtCalculate);

        //setData

        txtLocation.setText(mLocation);
        txtDestination.setText(mDestintion);
        return  view;


    }
}
