package mvvm.bios.ua.retrofit.adapter;

import android.util.Log;

import mvvm.bios.ua.retrofit.api.AnimevostApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by BIOS on 2/20/2017.
 */

public class AnimevostRestAdapter {
    private static String ANIMEVOST_URL = "https://api.animevost.org";
    private final String TAG = getClass().getSimpleName();
    private Retrofit restAdapter;

    public AnimevostRestAdapter() {
        restAdapter = new Retrofit.Builder()
                .baseUrl(ANIMEVOST_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Log.d(TAG, "AnimevostRestAdapter -- created");
    }

    public AnimevostApi getAnimevostApi() {
        return restAdapter.create(AnimevostApi.class);
    }
}
