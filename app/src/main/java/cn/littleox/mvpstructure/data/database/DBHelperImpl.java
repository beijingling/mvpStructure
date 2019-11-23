package cn.littleox.mvpstructure.data.database;

import javax.inject.Inject;
import javax.inject.Singleton;

import cn.littleox.mvpstructure.data.bean.DaoMaster;
import cn.littleox.mvpstructure.data.bean.DaoSession;

@Singleton
public class DBHelperImpl implements DBHelper {

    private DaoSession mSession;

    @Inject
    public DBHelperImpl(DbOpenHelper openHelper){
        mSession = new DaoMaster(openHelper.getWritableDb()).newSession();
    }
}
