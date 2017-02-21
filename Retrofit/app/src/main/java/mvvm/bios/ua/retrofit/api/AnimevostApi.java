package mvvm.bios.ua.retrofit.api;

import mvvm.bios.ua.retrofit.mvvm.model.AnimevostDataContainer;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by BIOS on 2/20/2017.
 */

public interface AnimevostApi {
    @GET("/animevost/api/v0.2/last?")
    Call<AnimevostDataContainer> getAnimevostDataFromApi(
            @Query("page") Integer page,
            @Query("quantity") Integer quantity
    );
}