package com.dodrop.riderapp.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Lenny Kamande on 5/31/2018.
 */

public interface IGoogleAPI {
    @GET
    Call<String> getPath(@Url String url);
}
