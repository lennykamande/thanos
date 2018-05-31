package com.dodrop.riderapp.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Lenny Kamande on 5/31/2018.
 */

public class GoogleMapAPI {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseURL)

    {
        if (retrofit == null)

        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
