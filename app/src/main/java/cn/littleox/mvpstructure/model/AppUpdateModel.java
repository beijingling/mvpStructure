package cn.littleox.mvpstructure.model;

import android.content.Context;

import cn.littleox.mvpstructure.base.BaseModel;
import cn.littleox.mvpstructure.data.bean.AppUpdateBean;
import cn.littleox.mvpstructure.data.network.ObserverResponseListener;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import okhttp3.RequestBody;

public class AppUpdateModel<T> extends BaseModel {

    public void getUpdateInfo(Context ctx, RequestBody currentInfo, ObservableTransformer<T, T> transformer,
                              final ObserverResponseListener<AppUpdateBean> listener) {
        Observable<AppUpdateBean> obs = api.getUpdateInfo(currentInfo);
        subscribe(ctx,obs,transformer,listener,false,false);
    }
}
