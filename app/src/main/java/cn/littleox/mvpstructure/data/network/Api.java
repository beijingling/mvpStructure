package cn.littleox.mvpstructure.data.network;


import cn.littleox.mvpstructure.base.Constant;

public class Api {

    private String baseUrl = Constant.WebSiteApi;

    private volatile static ApiService apiService;

    public static ApiService getApiService(){
        if(apiService == null){
            synchronized (Api.class){
                if(apiService == null){
                    new Api();
                }
            }
        }
        return apiService;
    }

    private Api(){
        BaseApi baseApi = new BaseApi();
        apiService = baseApi.getRetrofit(baseUrl).create(ApiService.class);
    }

}
