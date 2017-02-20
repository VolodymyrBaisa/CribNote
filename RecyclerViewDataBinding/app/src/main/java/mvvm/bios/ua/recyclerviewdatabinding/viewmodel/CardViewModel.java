package mvvm.bios.ua.recyclerviewdatabinding.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import mvvm.bios.ua.recyclerviewdatabinding.BR;
import mvvm.bios.ua.recyclerviewdatabinding.R;

/**
 * Created by BIOS on 2/18/2017.
 */

public class CardViewModel extends BaseObservable {
    private String urlImagePreview;
    private String title;

    @Bindable
    public String getUrlImagePreview() {
        return urlImagePreview;
    }

    public void setUrlImagePreview(String urlImagePreview) {
        this.urlImagePreview = urlImagePreview;
        notifyPropertyChanged(BR.urlImagePreview);
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.with(view.getContext())
                .load(imageUrl)
                .placeholder(R.drawable.noimage)
                .fit()
                .into(view);
    }
}
