package com.dodrop.riderapp.Common;

import com.dodrop.riderapp.Remote.FCMClient;
import com.dodrop.riderapp.Remote.GoogleMapAPI;
import com.dodrop.riderapp.Remote.IFCMService;
import com.dodrop.riderapp.Remote.IGoogleAPI;

/**
 * Created by Lenny Kamande on 5/17/2018.
 */

public class Common {

    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static final String fcmURL = "https://fcm.googleapis.com";
    public static final String googleAPIUrl = "https://maps.googleapis.com";

    public static final double base_fare = 20.00;
    public static final double time_rate = 4.00;
    public static final double distance_rate = 7.00;

    public static double getPrice(double km, int min)
    {
        return (base_fare+(time_rate*min)+(distance_rate*km));
    }


    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }

    public static IGoogleAPI getGoogleService()
    {
        return GoogleMapAPI.getClient(googleAPIUrl).create(IGoogleAPI.class);
    }

}
