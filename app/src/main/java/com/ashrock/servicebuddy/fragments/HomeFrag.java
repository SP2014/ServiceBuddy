package com.ashrock.servicebuddy.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ashrock.servicebuddy.R;
import com.ashrock.servicebuddy.adapters.MultiViewAdapter;

public class HomeFrag extends Fragment {
   private static final String TAG = HomeFrag.class.getSimpleName();
   private RecyclerView rcView;
   private MultiViewAdapter adapter;

   public HomeFrag(){

   }

   public static HomeFrag getInstance(String param1){
       HomeFrag homeFrag = new HomeFrag();
       Bundle args = new Bundle();
       homeFrag.setArguments(args);
       return homeFrag;
   }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcView = view.findViewById(R.id.customList);
        rcView.setLayoutManager(new LinearLayoutManager(getContext()));
        rcView.setItemAnimator(new DefaultItemAnimator());
        adapter = new MultiViewAdapter(getActivity());
        rcView.setAdapter(adapter);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        return view;
    }
}
