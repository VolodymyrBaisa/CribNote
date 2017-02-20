package mvvm.bios.ua.recyclerviewdatabinding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.util.ArrayList;

import mvvm.bios.ua.recyclerviewdatabinding.databinding.CardItemBinding;
import mvvm.bios.ua.recyclerviewdatabinding.model.Content;
import mvvm.bios.ua.recyclerviewdatabinding.view.CardHandler;
import mvvm.bios.ua.recyclerviewdatabinding.viewmodel.CardViewModel;

/**
 * Created by BIOS on 2/18/2017.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private ArrayList<Content> pageContent;
    private Context context;
    private int lastPosition = -1;

    public RecycleAdapter(Context context, ArrayList<Content> pageContent) {
        this.context = context;
        this.pageContent = pageContent;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        CardItemBinding cardItemBinding = CardItemBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(cardItemBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.cardViewModel.setUrlImagePreview(pageContent.get(position).getUrlImagePreview());
        holder.cardViewModel.setTitle(pageContent.get(position).getTitle());

        setAnimation(holder.itemView, position);
    }

    private void setAnimation(View viewToAnimate, int position)
    {
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return pageContent.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        CardViewModel cardViewModel;
        CardHandler cardHandler;

        ViewHolder(View itemView) {
            super(itemView);
            CardItemBinding cardItemBinding = DataBindingUtil.bind(itemView);
            cardViewModel = new CardViewModel();
            cardItemBinding.setCardViewModel(cardViewModel);

            cardHandler = new CardHandler();
            cardItemBinding.setCardHandler(cardHandler);
        }
    }
}
