package com.example.quoctuan.learntablayout.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quoctuan.learntablayout.R;

/**
 * Created by quoctuan on 28/02/2018.
 */

public class FragmentSingers extends Fragment {

    public FragmentSingers() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.singer_layout, container, false);
    }
}
