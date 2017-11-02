package com.mindnotix.dynamictablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    SectionsPagerAdapter mSectionsPagerAdapter;
    List<Category> categories;
    int initPos = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categories = new ArrayList<>();

        Category category = new Category("1", "one");
        categories.add(category);

        Category category1 = new Category("1", "two");
        categories.add(category1);

        Category category2 = new Category("1", "three");
        categories.add(category2);

        Category category3 = new Category("1", "four");
        categories.add(category3);

        Category category4 = new Category("1", "five");
        categories.add(category4);

        Category category5 = new Category("1", "six");
        categories.add(category5);

        Category category6 = new Category("1", "seven");
        categories.add(category6);


        init(categories);


    }


    private void init(List<Category> categories) {

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), categories);
        ViewPager mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        mViewPager.setCurrentItem(initPos);
    }

}
