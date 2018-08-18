package com.ashrock.servicebuddy.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ashrock.servicebuddy.Main2Activity;
import com.ashrock.servicebuddy.R;
import com.ashrock.servicebuddy.fragments.OfferFragment;
import com.santalu.autoviewpager.AutoViewPager;

public class MultiViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // View Types
    private static final int ITEM = 0;
    private static final int LOADING = 1;
    private static final int HERO = 2; // This will be for the banner
    private static Context mContext;


    public MultiViewAdapter(Context context){
      mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case ITEM:
                View viewItem = inflater.inflate(R.layout.simple_list, parent, false);
                viewHolder = new ItemViewHolder(viewItem);
                break;
            case LOADING:
                //View viewLoading = inflater.inflate(R.layout.item_progress, parent, false);
                //viewHolder = new LoadingVH(viewLoading);
                break;
            case HERO:
                View viewHero = inflater.inflate(R.layout.banner_layout, parent, false);
                viewHolder = new OfferViewHolder(viewHero);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 10;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return HERO;
        } else {
//            return (position == movieResults.size() - 1 && isLoadingAdded) ?
//                    LOADING : ITEM;
            return ITEM;
        }
    }

    // Offer ViewHolder
    public class OfferViewHolder extends RecyclerView.ViewHolder {

        AutoViewPager pager;

        public OfferViewHolder(View itemView) {
            super(itemView);
            pager = itemView.findViewById(R.id.offer_pager);
            final Main2Activity activity = (Main2Activity) mContext;
            pager.setAdapter(new OfferPagerAdapter(activity.getSupportFragmentManager()));

        }
    }

    // Item ViewHolder
    public class ItemViewHolder extends RecyclerView.ViewHolder{
        ImageView imgView;
        public ItemViewHolder(View itemView){
            super(itemView);
            imgView = itemView.findViewById(R.id.demImage);
        }
    }



    static class OfferPagerAdapter extends FragmentStatePagerAdapter {

        OfferPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return OfferFragment.newInstance();
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
