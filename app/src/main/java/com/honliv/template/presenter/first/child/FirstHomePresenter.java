package com.honliv.template.presenter.first.child;


import com.honliv.template.contract.FirstContract;
import com.honliv.template.utils.RxUtil;

import java.util.concurrent.TimeUnit;

import rx.Observable;

/**
 * Created by Rodin on 2016/11/15.
 */
public class FirstHomePresenter  extends  FirstContract.FirstHomePresenter {
    private int currentTopCount=0;
    private int topCount=5;

    @Override
    public void onStart() {

    }

}
