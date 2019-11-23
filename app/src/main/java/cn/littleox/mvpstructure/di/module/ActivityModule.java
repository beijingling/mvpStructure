package cn.littleox.mvpstructure.di.module;

import android.support.v7.app.AppCompatActivity;

import cn.littleox.mvpstructure.contractor.BlogContract;
import cn.littleox.mvpstructure.presenter.BlogPresenter;
import cn.littleox.mvpstructure.ui.home.BlogFragment;
import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity){
        mActivity = activity;
    }

    @Provides
    BlogPresenter provideBlogPresenter(BlogPresenter<BlogContract.View> presenter){
        return presenter;
    }
}
