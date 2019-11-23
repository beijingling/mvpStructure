package cn.littleox.mvpstructure.data.bean;

public class AppUpdateBean extends BaseResponseBean {

    String version;
    String download;
    String remark;
    int force_update;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDowload() {
        return download;
    }

    public void setDowload(String dowload) {
        this.download = dowload;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getForce_update() {
        return force_update;
    }

    public void setForce_update(int force_update) {
        this.force_update = force_update;
    }

    @Override
    public String toString() {
        return getVersion()+"\n"
                +getSuccess()+"\n"
                +getDowload()+"\n"
                +getRemark()+"\n"
                +getForce_update()+"\n";
    }
}
