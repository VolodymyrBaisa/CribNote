package mvvm.bios.ua.recyclerviewdatabinding.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

import mvvm.bios.ua.recyclerviewdatabinding.R;
import mvvm.bios.ua.recyclerviewdatabinding.adapter.RecycleAdapter;
import mvvm.bios.ua.recyclerviewdatabinding.model.Content;

/**
 * Created by BIOS on 2/18/2017.
 */

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private ArrayList<Content> pageContent;
    private RecycleAdapter recycleAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        initViews();
    }

    private void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewBlock);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        pageContent = new Content().getPageContent();
        recycleAdapter = new RecycleAdapter(this, pageContent);
        recyclerView.setAdapter(recycleAdapter);
    }
}
