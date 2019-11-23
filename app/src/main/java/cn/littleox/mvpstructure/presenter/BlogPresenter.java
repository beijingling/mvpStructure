package cn.littleox.mvpstructure.presenter;

import android.content.Context;

import javax.inject.Inject;

import cn.littleox.mvpstructure.base.BasePresenterImpl;
import cn.littleox.mvpstructure.contractor.BlogContract;
import cn.littleox.mvpstructure.data.DataManager;
import cn.littleox.mvpstructure.data.bean.BlogResp;
import cn.littleox.mvpstructure.data.network.ExceptionHandle;
import cn.littleox.mvpstructure.data.network.ObserverResponseListener;
import cn.littleox.mvpstructure.di.ActivityContext;
import cn.littleox.mvpstructure.model.BlogModel;

public class BlogPresenter<V extends BlogContract.View > extends BasePresenterImpl<V> implements BlogContract.Presenter<V> {

    private BlogModel mModel;

    @Inject
    public BlogPresenter(@ActivityContext Context ctx, DataManager manager) {
        super(ctx, manager);
        mModel = new BlogModel();
    }

    @Override
    public void getBlog() {
        mModel.getBlog(mContext, createRequestBody(getBaseRequestParam()), mView.bindLifecycle(), new ObserverResponseListener<BlogResp>() {
            @Override
            public void onNext(BlogResp blogResp) {
                mView.onGetBlog(blogResp);
            }

            @Override
            public void onError(ExceptionHandle.ResponeThrowable e) {

            }
        });
    }
}
