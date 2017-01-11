package com.honliv.template.fragment.second.child;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.honliv.template.R;
import com.honliv.template.activity.MainActivity;
import com.honliv.template.base.BaseFragment;
import com.honliv.template.contract.SecondContract;
import com.honliv.template.model.second.child.SecondMainModel;
import com.honliv.template.presenter.second.child.SecondMainPresenter;


/**
 * Created by Rodin on 2016/10/26.
 */
public class SecondMainFragment extends BaseFragment<SecondMainPresenter, SecondMainModel> implements SecondContract.SecondMainView {
    public static SecondMainFragment newInstance() {

        Bundle args = new Bundle();

        SecondMainFragment fragment = new SecondMainFragment();
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
        return R.layout.fragment_second_main;
    }

    @Override
    public void initUI(View view, @Nullable Bundle savedInstanceState) {

    }

//    private void getSign() {
//        if (GloableParams.signtoke == null && GloableParams.UserInfo != null && GloableParams.UserInfo.getId() != null) {
//            HashMap<String, String> map = new HashMap<String, String>();
//            map.put("UserId", GloableParams.UserInfo.getId());
//            String value = GloableParams.UserInfo.getPhoneNumber() + GloableParams.UserInfo.getPassword();
//            map.put("Key", value);
//            MyApplication.getInstance().mRxManager.add(RxService.createApi(MainApi.class).token(map)
//                    .compose(RxUtil.rxSchedulerHelper()).subscribe(result -> {
//                        GloableParams.signtoke = result.getData().getSignToken();
//                    }, e -> ToastUtils.showToast(mContext, e.toString())));
//        }
//    }

    @Override
    public void showError(String msg) {

    }
}
