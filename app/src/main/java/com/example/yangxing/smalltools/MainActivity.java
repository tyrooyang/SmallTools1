package com.example.yangxing.smalltools;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yangxing.smalltools.fragment.butlerFragment;
import com.example.yangxing.smalltools.fragment.girlFragment;
import com.example.yangxing.smalltools.fragment.userFragment;
import com.example.yangxing.smalltools.fragment.wechatFragment;
import com.example.yangxing.smalltools.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private List<String> mTitle;
    private List<Fragment> mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //去掉viewpager下划线
        getSupportActionBar().setElevation(0);

        initData();

        initView();
    }

    private void initData() {
        mTitle = new ArrayList<>();
        mTitle.add("服务管家");
        mTitle.add("微信精选");
        mTitle.add("美女图片");
        mTitle.add("个人中心");

        mFragment = new ArrayList<>();
        mFragment.add(new butlerFragment());
        mFragment.add(new wechatFragment());
        mFragment.add(new girlFragment());
        mFragment.add(new userFragment());

    }
    private void initView() {

        mTabLayout = findViewById(R.id.mTabLayout);
        mViewPager = findViewById(R.id.mViewPager);
        //预加载
        mViewPager.setOffscreenPageLimit(mFragment.size());

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }

            @Override
            public int getCount() {
                return mFragment.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });
        //绑定
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
