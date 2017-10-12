package com.nebulaera.mockrecorder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.nebulaera.mockrecorder.fragment.RecordFragment;
import com.nebulaera.mockrecorder.fragment.SaveFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fragment> fragments = new ArrayList<>();
    private String[] title = new String[]{"Record", "Save"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragments.add(new RecordFragment());
        fragments.add(new SaveFragment());
        SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.smartTabLayout_tab_title);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPagerTab.setViewPager(viewPager);
    }

}
