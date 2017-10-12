package com.nebulaera.apptest.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nebulaera.apptest.R;

/**
 * Created by Barry on 2017/10/12.
 */

public class TitleFragment extends Fragment {
    private static final String LYJ_TAG = "LYJ_TitleFragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.title_fragment, container);
        return inflate;
    }
}
