package com.nebulaera.apptest.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nebulaera.apptest.R;

/**
 * Created by Barry on 2017/10/12.
 */

public class ContentFragment extends Fragment {
    private static final String LYJ_TAG = "LYJ_ContentFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.content_fragment, container);
        return inflate;
    }
}
