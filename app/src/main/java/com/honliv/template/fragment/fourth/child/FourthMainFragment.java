package com.honliv.template.fragment.fourth.child;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.honliv.template.R;
import com.honliv.template.activity.MainActivity;
import com.honliv.template.base.BaseFragment;
import com.honliv.template.contract.FourthContract;
import com.honliv.template.model.fourth.child.FourthMainModel;
import com.honliv.template.presenter.fourth.child.FourthMainPresenter;

/**
 * Created by Rodin on 2016/10/26.
 */
public class FourthMainFragment extends BaseFragment<FourthMainPresenter, FourthMainModel> implements View.OnClickListener, FourthContract.FourthMainView {

    public static FourthMainFragment newInstance() {

        Bundle args = new Bundle();

        FourthMainFragment fragment = new FourthMainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_fourth_main;
    }

    @Override
    public void initUI(View view, @Nullable Bundle savedInstanceState) {
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public boolean onBackPressedSupport() {
        ((MainActivity) getActivity()).onBackToFirstFragment();
        return true;
    }
}
