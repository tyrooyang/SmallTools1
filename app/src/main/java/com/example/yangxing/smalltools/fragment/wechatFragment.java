package com.example.yangxing.smalltools.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yangxing.smalltools.R;


/**
 * Created by yangxing on 2018/3/1.
 * 项目名：SmallTools.
 * 包名：com.example.yangxing.smalltools.fragment.
 * 文件名：wechatFragment.
 * 描述：TODO
 */

public class wechatFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wechat,null);
        return view;
    }
}
