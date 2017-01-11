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


    interface FourthChangePwdView extends CoreBaseView {
    }


    interface FourthBookView extends CoreBaseView {
    }

    interface FourthPhoneView extends CoreBaseView {
    }


    interface FourthSettingView extends CoreBaseView {
    }
    interface FourthVerifyPhoneView extends CoreBaseView {
    }

    interface FourthCardDetailView extends CoreBaseView {
        void updateUnbindView(String data);
    }

    interface FourthMainModel extends CoreBaseModel {
    }


    interface FourthDetailModel extends CoreBaseModel {
    }


    interface FourthChangePwdModel extends CoreBaseModel {
    }
    interface FourthVerifyPhoneModel extends CoreBaseModel {
    }


    interface FourthSettingModel extends CoreBaseModel {
    }

    interface FourthBookModel extends CoreBaseModel {
    }

    interface FourthPhoneModel extends CoreBaseModel {
    }

    abstract class FourthPresenter extends CoreBasePresenter<FourthModel, FourthView> {
    }

    abstract class FourthMainPresenter extends CoreBasePresenter<FourthMainModel, FourthMainView> {
    }



    abstract class FourthChangePwdPresenter extends CoreBasePresenter<FourthChangePwdModel, FourthChangePwdView> {
    }

    abstract class FourthBookPresenter extends CoreBasePresenter<FourthBookModel, FourthBookView> {
    }


    abstract class FourthSettingPresenter extends CoreBasePresenter<FourthSettingModel, FourthSettingView> {
    }


    abstract class FourthPhonePresenter extends CoreBasePresenter<FourthPhoneModel, FourthPhoneView> {
    }

    abstract class FourthVerifyPhonePresenter extends CoreBasePresenter<FourthVerifyPhoneModel, FourthVerifyPhoneView> {
    }
}
