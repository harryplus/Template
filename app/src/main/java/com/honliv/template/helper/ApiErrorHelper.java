package com.honliv.template.helper;

import android.content.Context;


import com.honliv.template.utils.ToastUtils;

import java.io.IOException;

/**
 * Created by Rodin on 2016/12/6.
 */

public class ApiErrorHelper {

    public static void handleCommonError(Context context, Throwable e) {
        if (e instanceof IOException) {
            ToastUtils.showToast(context, "连接失败");
        } else if (e instanceof ApiException) {
            //ApiException处理
            ToastUtils.showToast(context, e.getMessage());
        } else {
            ToastUtils.showToast(context, e.getMessage());
        }
    }
//    if (e instanceof HttpException) {
//        Toast.makeText(context, "服务暂不可用", Toast.LENGTH_SHORT).show();
//    } else
}
