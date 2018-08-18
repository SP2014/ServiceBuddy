package com.ashrock.servicebuddy.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ashrock.servicebuddy.R;

public class OfferFragment extends Fragment {
    private static final String TAG = OfferFragment.class.getSimpleName();

    public OfferFragment(){}

    public static OfferFragment newInstance(){
        OfferFragment fragment = new OfferFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.offer_card_item, container, false);
        return view;
    }
}
