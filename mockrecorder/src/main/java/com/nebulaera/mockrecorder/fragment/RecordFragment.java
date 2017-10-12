package com.nebulaera.mockrecorder.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nebulaera.mockrecorder.R;


/**
 * Created by Barry on 2017/10/12.
 */

public class RecordFragment extends android.support.v4.app.Fragment {
    private static final String LYJ_TAG = "LYJ_TitleFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.title_fragment, container);
        return view;
    }
}
