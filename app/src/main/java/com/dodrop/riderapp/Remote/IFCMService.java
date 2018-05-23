package com.dodrop.riderapp.Remote;

import com.dodrop.riderapp.Model.FCMResponse;
import com.dodrop.riderapp.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Lenny Kamande on 5/22/2018.
 */

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAzklPLcw:APA91bFxEYs0Ex7Szh2oNdILB6tzy7XCfbMGzPeAbHhgJo-aJWbeelMvc2iP7VYxLahSJ-74tr8gKqGL_V9odXakxAVoSTM7_OMAdstwPItvYe0GngHzmLvexoJP0E7-zmMl3Rjs0wKb"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
