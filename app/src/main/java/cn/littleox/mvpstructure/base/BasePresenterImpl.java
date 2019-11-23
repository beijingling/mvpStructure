package cn.littleox.mvpstructure.base;

import android.content.Context;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import cn.littleox.mvpstructure.data.DataManager;
import cn.littleox.mvpstructure.data.DataManagerImpl;
import cn.littleox.mvpstructure.di.ActivityContext;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class BasePresenterImpl<V extends BaseView> implements BasePresenter<V> {
    protected Context mContext;
    protected V mView;
    protected DataManager mDataManager;

    @Inject
    public BasePresenterImpl(@ActivityContext Context ctx, DataManager manager){
        mDataManager = manager;
        mContext = ctx;
    }

    public Map<String, Object> getBaseRequestParam() {
        Map<String, Object> params = new HashMap<>();
        params.put("device_id", mDataManager.getDeviceID());
        params.put("os", mDataManager.getOSType());
        params.put("uid", mDataManager.getCurrentUserId() + "");
        //params.put("osv", mDataManager.getAppVersion());
        params.put("token", mDataManager.getToken());
        return params;
    }

    public RequestBody createRequestBody(Map<String, Object> params){
        return RequestBody.create(MediaType.parse("Content-Type, application/json"),
                new JSONObject(params).toString());
    }

    @Override
    public void loadDate() {

    }

    @Override
    public void onDetach() {
        mView = null;
    }

    @Override
    public void onAttach(V view) {
        mView = view;
    }
}
