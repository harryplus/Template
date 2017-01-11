package com.honliv.template.contract;


import com.honliv.template.base.CoreBaseModel;
import com.honliv.template.base.CoreBasePresenter;
import com.honliv.template.base.CoreBaseView;

/**
 * Created by Rodin on 2016/11/15.
 */
public interface ThirdContract {

    interface ThirdView extends CoreBaseView {
    }

    interface ThirdMainView extends CoreBaseView {
    }

    interface ThirdModel extends CoreBaseModel {
    }

    public interface ThirdMainModel extends CoreBaseModel {
    }

    abstract class ThirdPresenter extends CoreBasePresenter<ThirdModel, ThirdView> {
    }

    abstract class ThirdMainPresenter extends CoreBasePresenter<ThirdMainModel, ThirdMainView> {
    }
}
