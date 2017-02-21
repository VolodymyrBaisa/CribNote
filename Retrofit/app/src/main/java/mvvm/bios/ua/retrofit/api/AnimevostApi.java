package mvvm.bios.ua.retrofit.api;

import mvvm.bios.ua.retrofit.mvvm.model.AnimevostData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by BIOS on 2/20/2017.
 */

public interface AnimevostApi {
   /* @GET("/animevost/api/v0.2/last?page=1&quantity=1")
    Call<AnimevostData> getAnimevostDataFromApi();
           /* @Query("page") String page,
            @Query("quantity") String quantity);*/

    @GET("/VolodymyrBaisa/CribNote/master/Retrofit/data.gson")
    Call<AnimevostData> getAnimevostDataFromApi();
}
