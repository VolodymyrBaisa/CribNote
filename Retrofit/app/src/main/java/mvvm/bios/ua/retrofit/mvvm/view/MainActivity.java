package mvvm.bios.ua.retrofit.mvvm.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.IOException;

import mvvm.bios.ua.retrofit.R;
import mvvm.bios.ua.retrofit.adapter.AnimevostRestAdapter;
import mvvm.bios.ua.retrofit.api.AnimevostApi;
import mvvm.bios.ua.retrofit.mvvm.model.AnimevostData;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by BIOS on 2/20/2017.
 */

public class MainActivity extends AppCompatActivity {
    private final String TAG = getClass().getSimpleName();
    private AnimevostRestAdapter animevostRestAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        runRetrofitTestSync();
    }

    private void runRetrofitTestSync() {
        if(animevostRestAdapter == null) {
            animevostRestAdapter = new AnimevostRestAdapter();
            testAnimevostApiSync(animevostRestAdapter.getAnimevostApi(), "1", "1");
        }
    }

    public void testAnimevostApiSync(AnimevostApi animevostApi, String page, String quantity){
        Log.d(TAG, "AnimevostRestAdapter for page = " + page + " quantity = " + quantity);

        //Call<AnimevostData> call = animevostApi.getAnimevostDataFromApi(page, quantity);
        Call<AnimevostData> call = animevostApi.getAnimevostDataFromApi();

       call.enqueue(new Callback<AnimevostData>() {
           @Override
           public void onResponse(Call<AnimevostData> call, Response<AnimevostData> response) {
               if (response.isSuccessful()) {
                   AnimevostData animevostData = response.body();
                   Log.d(TAG, "success: Anime title: " + animevostData.getTitle() + " img url: " + animevostData.getUrlImagePreview());

               } else {
                   int statusCode = response.code();
                   ResponseBody errorBody = response.errorBody();
                   Log.d(TAG, "Error code:" + statusCode + ", Error:" + errorBody);
               }
           }

           @Override
           public void onFailure(Call<AnimevostData> call, Throwable t) {
               Log.d(TAG, "failure " + t.getMessage());
           }
       });
    }
}
