package com.example.xiaohehu.fragmentbestpractice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by xiaohehu on 3/21/18.
 */

public class NewsTitleFragment extends Fragment {

    private boolean isTwoPane;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_title_frag, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstaceState) {
        super.onActivityCreated(savedInstaceState);
        if (getActivity().findViewById(R.id.news_content_layout) != null) {
            isTwoPane = true; //可以找到news_content_layout布局时，为双页模式
        } else {
            isTwoPane = false; //找不到news_content_layout布局时，为单页模式
        }
    }
}
