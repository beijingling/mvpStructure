package cn.littleox.mvpstructure.base;

public interface BasePresenter<V extends BaseView> {

    void loadDate();

    void onDetach();

    void onAttach(V view);
}
