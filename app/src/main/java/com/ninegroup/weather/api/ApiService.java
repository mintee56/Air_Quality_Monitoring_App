package com.ninegroup.weather.api;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {
    @GET("api/master/user/user")
    Call<User> getUser(@Header("Authorization") String token);

    @GET("api/master/asset/{assetID}")
    Call<Asset> getAsset(@Path("assetID") String assetID);//, @Header("Authorization") String auth);

    @FormUrlEncoded
    @POST("auth/realms/master/protocol/openid-connect/token")
    Call<Token> getToken(@Field("client_id") String client_id,
                         @Field("username") String username,
                         @Field("password") String password,
                         @Field("grant_type") String grant_type
    );

    @POST("api/master/asset/datapoint/{assetId}/attribute/{attributeName}")
    Call<List<Datapoint>> getDatapoint(@Path("assetId") String assetId,
                                       @Path("attributeName") String attributeName,
                                       @Body RequestBody body);
}
