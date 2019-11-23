package cn.littleox.mvpstructure.model;

import android.content.Context;

import cn.littleox.mvpstructure.base.BaseModel;
import cn.littleox.mvpstructure.data.bean.BlogResp;
import cn.littleox.mvpstructure.data.network.ObserverResponseListener;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import okhttp3.RequestBody;

public class BlogModel<T> extends BaseModel {

    public void getBlog(Context ctx, RequestBody request, ObservableTransformer<T, T> transformer,
                        final ObserverResponseListener<BlogResp> listener){
        Observable observable = api.getBlogs(request);
        subscribe(ctx,observable,transformer,listener,true,false);
    }
}
