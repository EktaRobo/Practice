package com.example.ekta.evaluation2017.ui.main;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ekta.evaluation2017.R;

/**
 * Created by ekta on 4/11/17.
 */

public class MainFragment extends Fragment {


    @Override
    public void onAttach(Context context) {
        dagger.android.support.AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false); //TODO:Layout
        return view;
    }
}
