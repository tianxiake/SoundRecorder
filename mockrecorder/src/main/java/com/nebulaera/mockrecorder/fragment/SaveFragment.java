package com.nebulaera.mockrecorder.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nebulaera.mockrecorder.R;


/**
 * Created by Barry on 2017/10/12.
 */

public class SaveFragment extends android.support.v4.app.Fragment {
    private static final String LYJ_TAG = "LYJ_SaveFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(LYJ_TAG, "container=" + (container != null ? container.getClass().getSimpleName() : "Null"));
        View view = inflater.inflate(R.layout.content_fragment, null);
        return view;
    }
}
