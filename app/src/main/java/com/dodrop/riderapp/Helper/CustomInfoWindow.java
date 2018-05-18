package com.dodrop.riderapp.Helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.dodrop.riderapp.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by Lenny Kamande on 5/16/2018.
 */

public class CustomInfoWindow implements GoogleMap.InfoWindowAdapter {

    View myView;

    public CustomInfoWindow(Context context){
        myView = LayoutInflater.from(context)
                .inflate(R.layout.custom_rider_info_window, null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        TextView txtPickupTitle = ((TextView)myView.findViewById(R.id.txtPickUpInfo));
        txtPickupTitle.setText(marker.getTitle());

        TextView txtPickupSnippet = ((TextView)myView.findViewById(R.id.txtPickUpSnippet));
        txtPickupSnippet.setText(marker.getTitle());

        return myView;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
