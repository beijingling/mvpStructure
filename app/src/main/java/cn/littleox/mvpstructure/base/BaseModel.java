package cn.littleox.mvpstructure.base;

import android.content.Context;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import cn.littleox.mvpstructure.data.network.Api;
import cn.littleox.mvpstructure.data.network.ApiService;
import cn.littleox.mvpstructure.data.network.ObserverResponseListener;
import cn.littleox.mvpstructure.data.network.ProgressObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by PC-xiaoming on 2019/5/15.
 */

public class BaseModel<T> {

    /**
     * 封装线程管理和订阅的过程
     */
    public void subscribe(Context context, final Observable observable, ObservableTransformer<T,T> transformer,
                          ObserverResponseListener<T> listener, boolean isDialog, boolean cancelable){
        final Observer observer = new ProgressObserver(context,listener,isDialog,cancelable);
        observable
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
    public void subscribe(Context context, final Observable observable, ObservableTransformer<T,T> transformer ,
                          ObserverResponseListener<T> listener) {
        subscribe(context,observable,transformer,listener,true,true);
    }
    protected ApiService api = Api.getApiService();

    /*protected DBHelper getDataBase (Context ctx){
        return DataManagerImpl.getInstance(ctx).getDBHelper();
    }*/

    /*public ListBean<T> getListBean(Context context, Call<ListBean<T>> call) {
        try {
            ListBean listBean = call.execute().body();
            if (listBean.getList() == null) {
                listBean.setList(new ArrayList<>());
            }
            return listBean;
        } catch (IOException e) {
            e.printStackTrace();
            int errorCode = ExceptionHandle.getErrorCode(e);
            return getErrorResult(context, errorCode);
        }
    }

    private ListBean<T> getErrorResult(Context context, int errorCode) {
        ListBean listBean = new ListBean();
        listBean.setSuccess(errorCode);
        if (errorCode == BasePresenter.RESPONSE_CODE_SUCCESS_FAIL) {
            listBean.setMsg(context.getString(R.string.get_data_error));
        }
        listBean.setList(Collections.emptyList());
        return listBean;
    }*/


    public void  downloadFile(String url , Callback<ResponseBody> callback){
        Call<ResponseBody> call = api.downloadFileWithUrl(url);
        call.enqueue(callback);
    }
}
