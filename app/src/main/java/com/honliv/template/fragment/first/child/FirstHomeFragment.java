package com.honliv.template.fragment.first.child;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.honliv.template.R;
import com.honliv.template.application.MyApplication;
import com.honliv.template.base.BaseFragment;
import com.honliv.template.contract.FirstContract;
import com.honliv.template.model.first.child.FirstHomeModel;
import com.honliv.template.presenter.first.child.FirstHomePresenter;
import com.rd.PageIndicatorView;
import com.rd.animation.AnimationType;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


/**
 * Created by YoKeyword on 16/6/5.
 */
public class FirstHomeFragment extends BaseFragment<FirstHomePresenter, FirstHomeModel> implements View.OnClickListener, FirstContract.FirstHomeView {

    public static FirstHomeFragment newInstance() {
        Bundle args = new Bundle();

        FirstHomeFragment fragment = new FirstHomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_first_home;
    }

    @Override
    public void initUI(View view, @Nullable Bundle savedInstanceState) {
    }

    @Override
    public void initData() {
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public void showError(String msg) {

    }

}
