package com.honliv.template.fragment.first;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.honliv.template.R;
import com.honliv.template.base.BaseLazyMainFragment;
import com.honliv.template.contract.FirstContract;
import com.honliv.template.fragment.first.child.FirstHomeFragment;
import com.honliv.template.model.first.FirstModel;
import com.honliv.template.presenter.first.FirstPresenter;


/**
 * Created by YoKeyword on 16/6/3.
 */
public class FirstFragment extends BaseLazyMainFragment<FirstPresenter, FirstModel> implements FirstContract.FirstView {

    public static FirstFragment newInstance() {
        Bundle args = new Bundle();

        FirstFragment fragment = new FirstFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_first;
    }

    @Override
    public void initUI(View view, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public void showError(String msg) {

    }

    @Override
    protected void initLazyView(@Nullable Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            loadRootFragment(R.id.fl_first_container, FirstHomeFragment.newInstance());
        }
    }
}
