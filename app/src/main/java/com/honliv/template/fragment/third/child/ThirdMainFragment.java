package com.honliv.template.fragment.third.child;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.honliv.template.R;
import com.honliv.template.activity.MainActivity;
import com.honliv.template.base.BaseFragment;
import com.honliv.template.contract.ThirdContract;
import com.honliv.template.model.third.child.ThirdMainModel;
import com.honliv.template.presenter.third.child.ThirdMainPresenter;


/**
 * Created by Rodin on 2016/10/26.
 */
public class ThirdMainFragment extends BaseFragment<ThirdMainPresenter, ThirdMainModel> implements ThirdContract.ThirdMainView {
    public static ThirdMainFragment newInstance() {

        Bundle args = new Bundle();

        ThirdMainFragment fragment = new ThirdMainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public boolean onBackPressedSupport() {
        ((MainActivity) getActivity()).onBackToFirstFragment();
        return true;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_third_main;
    }

    @Override
    public void initUI(View view, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public void showError(String msg) {

    }
}
