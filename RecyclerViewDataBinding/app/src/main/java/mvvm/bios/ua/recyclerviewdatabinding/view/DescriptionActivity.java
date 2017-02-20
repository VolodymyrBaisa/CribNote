package mvvm.bios.ua.recyclerviewdatabinding.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import mvvm.bios.ua.recyclerviewdatabinding.R;
import mvvm.bios.ua.recyclerviewdatabinding.databinding.DescriptionActivityBinding;
import mvvm.bios.ua.recyclerviewdatabinding.viewmodel.CardViewModel;

/**
 * Created by BIOS on 2/18/2017.
 */

public class DescriptionActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DescriptionActivityBinding descriptionActivityBinding = DataBindingUtil.setContentView(this, R.layout.description_activity);
        CardViewModel cardViewModel = new CardViewModel();
        cardViewModel.setTitle(getIntent().getStringExtra("title"));
        cardViewModel.setUrlImagePreview(getIntent().getStringExtra("urlImagePreview"));
        descriptionActivityBinding.setDescriptionViewModel(cardViewModel);
    }
}
