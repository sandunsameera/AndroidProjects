package com.lolin.deemon_face.careforyou;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    private final static String TAG = "SecondActivity";

    private SectionsPageAdapter mSectionPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_second);
        mSectionPageAdapter = new SectionsPageAdapter (getSupportFragmentManager ());
        mViewPager = findViewById (R.id.container);
        setUpViewPager ();


        TabLayout tabLayout = findViewById (R.id.tabs);
        tabLayout.setupWithViewPager (mViewPager);

    }

    private void setUpViewPager(){
        SectionsPageAdapter adapter = new SectionsPageAdapter (getSupportFragmentManager ());
        adapter.addFragmenr (new RecentQuestionsFragment (),"Recent questions");
        adapter.addFragmenr (new ChatFragment (),"Chat room");
        adapter.addFragmenr (new Tab3Fragment (),"Stuffs");
    }
}
