package cn.littleox.mvpstructure.data.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class TabDraftBean {
    @Id(autoincrement = true)
    private Long _id = null;

    private String title;

    @Generated(hash = 1174990033)
    public TabDraftBean(Long _id, String title) {
        this._id = _id;
        this.title = title;
    }

    @Generated(hash = 197988984)
    public TabDraftBean() {
    }

    public Long get_id() {
        return this._id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
