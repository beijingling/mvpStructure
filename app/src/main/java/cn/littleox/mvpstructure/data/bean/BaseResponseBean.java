package cn.littleox.mvpstructure.data.bean;

/*
 * created by lava
 * 2019-06-24
 * @TODO
 */
public abstract class BaseResponseBean {

    public static final int RESPONSE_CODE_SUCCESS_PASS = 1;
    public static final int RESPONSE_CODE_SUCCESS_FAIL = 0;
    public static final int RESPONSE_CODE_NETWORK_ERROR = 10004;
    int success;
    String msg;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
