package cn.littleox.mvpstructure.contractor;

import cn.littleox.mvpstructure.base.BasePresenter;
import cn.littleox.mvpstructure.base.BaseView;
import cn.littleox.mvpstructure.data.bean.BlogResp;

public class BlogContract {
    public interface View extends BaseView {
        void onGetBlog(BlogResp blogResp);
    }

    public interface Presenter<V extends View> extends BasePresenter<V> {
        void getBlog();
    }
}
