package com.lolin.deemon_face.careforyou;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private final static String TAG = "SecondActivity";

    private SectionsPageAdapter mSectionPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_second);
        mSectionPageAdapter = new SectionsPageAdapter (getSupportFragmentManager ());
        mViewPager = (ViewPager)findViewById (R.id.container);
        setUpViewPager (mViewPager);


        TabLayout tabLayout = findViewById (R.id.tabs);
        tabLayout.setupWithViewPager (mViewPager);

    }

    private void setUpViewPager (ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter (getSupportFragmentManager ());
        adapter.addFragmenr (new RecentQuestionsFragment (),"Recent questions");
        adapter.addFragmenr (new ChatFragment (),"Chat room");
        adapter.addFragmenr (new Tab3Fragment (),"Stuffs");
    }
}
