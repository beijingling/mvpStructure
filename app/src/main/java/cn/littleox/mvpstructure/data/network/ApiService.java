package cn.littleox.mvpstructure.data.network;

import cn.littleox.mvpstructure.data.bean.AppUpdateBean;
import cn.littleox.mvpstructure.data.bean.BlogResp;
import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface ApiService {

    /**
     * 获取更新版本信息
     */
    @POST("version")
    Observable<AppUpdateBean> getUpdateInfo(@Body RequestBody body);

    /**
     *
     * @param fileUrl
     * @return
     */
    @GET
    Call<ResponseBody> downloadFileWithUrl(@Url String fileUrl);

    /**
     * get mindock blogs
     */
    @POST("5926ce9d11000096006ccb30")
    Observable<BlogResp> getBlogs(@Body RequestBody body);
}
