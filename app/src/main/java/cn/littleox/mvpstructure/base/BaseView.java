package cn.littleox.mvpstructure.base;


import io.reactivex.ObservableTransformer;

public interface BaseView {

    void showLoading();

    void hiddenLoading();

    void onNetWorkError();

    <T> ObservableTransformer<T,T> bindLifecycle();
}
