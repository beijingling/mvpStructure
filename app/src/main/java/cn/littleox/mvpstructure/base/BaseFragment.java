package cn.littleox.mvpstructure.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trello.rxlifecycle2.components.support.RxFragment;

import butterknife.ButterKnife;

public abstract class BaseFragment<P extends BasePresenter> extends RxFragment implements BaseView {

    protected Context mContext;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        mContext = getContext();
        setUp(view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @javax.annotation.Nullable ViewGroup container,
                             @javax.annotation.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayout(), container, false);
        return view;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hiddenLoading() {

    }

    @Override
    public void onNetWorkError() {

    }


    protected abstract void setUp(View view);

    public abstract int getLayout();
}
