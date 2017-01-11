package com.honliv.template.helper;

import android.content.Context;

import com.honliv.template.R;
import com.honliv.template.activity.MainActivity;
import com.honliv.template.utils.NetUtils;

import rx.Subscriber;

/**
 * Created by Rodin on 2016/12/6.
 */

public class BaseSubscriber<T> extends Subscriber<T>  {
    private Context mContext = null;

    public BaseSubscriber() {
        mContext = MainActivity.mContext;
//        mContext = MyApplication.getInstance().getAppContext();
    }

    public BaseSubscriber(Context context) {
        mContext = context;
    }

    @Override
    public void onStart() {
        //请求开始之前，检查是否有网络。无网络直接抛出异常
        //另外，在你无法确定当前代码运行在什么线程的时候，不要将UI的相关操作放在这里。
        if (!NetUtils.isConnected(mContext)) {
            this.onError(new ApiException(600, mContext.getString(R.string.error_net_disconn)));
            unsubscribe();
            return;
        }
    }


    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        ApiErrorHelper.handleCommonError(mContext, e);
    }

    @Override
    public void onNext(T t) {

    }
}
