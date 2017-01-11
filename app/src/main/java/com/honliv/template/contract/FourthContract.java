package com.honliv.template.contract;


import com.honliv.template.base.CoreBaseModel;
import com.honliv.template.base.CoreBasePresenter;
import com.honliv.template.base.CoreBaseView;

/**
 * Created by Rodin on 2016/11/15.
 */
public interface FourthContract {
    interface FourthModel extends CoreBaseModel {
    }

    interface FourthView extends CoreBaseView {
    }

    interface FourthMainView extends CoreBaseView {
    }


    interface FourthMainModel extends CoreBaseModel {
    }


    abstract class FourthPresenter extends CoreBasePresenter<FourthModel, FourthView> {
    }

    abstract class FourthMainPresenter extends CoreBasePresenter<FourthMainModel, FourthMainView> {
    }


}
