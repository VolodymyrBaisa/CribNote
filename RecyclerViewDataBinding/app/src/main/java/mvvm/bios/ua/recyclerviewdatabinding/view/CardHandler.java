package mvvm.bios.ua.recyclerviewdatabinding.view;

import android.content.Intent;
import android.view.View;

/**
 * Created by BIOS on 2/18/2017.
 */

public class CardHandler {
    public void onClick(View v, String title, String urlImagePreview){
        Intent intent = new Intent(v.getContext(), DescriptionActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("urlImagePreview", urlImagePreview);
        v.getContext().startActivity(intent);
    }
}
