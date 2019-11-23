package cn.littleox.mvpstructure.ui.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.annotation.Nullable;
import javax.inject.Inject;

import butterknife.BindView;
import cn.littleox.mvpstructure.R;
import cn.littleox.mvpstructure.base.BaseFragment;
import cn.littleox.mvpstructure.contractor.BlogContract;
import cn.littleox.mvpstructure.data.bean.BlogResp;
import cn.littleox.mvpstructure.presenter.BlogPresenter;
import io.reactivex.ObservableTransformer;

public class BlogFragment<P extends BlogContract.Presenter> extends BaseFragment<P> implements BlogContract.View {

    @Inject
    BlogContract.Presenter mBlogPresenter;

    @BindView(R.id.rc_blog)
    RecyclerView RCBlog;


    @Override
    protected void setUp(View view) {
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_blog;
    }

    @Override
    public void onGetBlog(BlogResp blogResp) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public <T> ObservableTransformer<T, T> bindLifecycle() {
        return bindToLifecycle();
    }
}
