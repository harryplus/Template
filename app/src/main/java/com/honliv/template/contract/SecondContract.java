package com.honliv.template.contract;


import com.honliv.template.base.CoreBaseModel;
import com.honliv.template.base.CoreBasePresenter;
import com.honliv.template.base.CoreBaseView;

/**
 * Created by Rodin on 2016/11/15.
 */
public interface SecondContract {
    interface SecondView extends CoreBaseView {
    }
    interface SecondMainView extends CoreBaseView {
    }

    interface SecondModel extends CoreBaseModel {
    }

    public interface SecondMainModel  extends CoreBaseModel {
    }

    abstract class SecondPresenter extends CoreBasePresenter<SecondModel, SecondView> {
    }

    abstract class SecondMainPresenter extends CoreBasePresenter<SecondMainModel, SecondMainView> {
    }
}
