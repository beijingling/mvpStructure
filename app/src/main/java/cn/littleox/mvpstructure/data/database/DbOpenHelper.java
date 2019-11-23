package cn.littleox.mvpstructure.data.database;

import android.content.Context;

import javax.inject.Inject;

import cn.littleox.mvpstructure.data.bean.DaoMaster;
import cn.littleox.mvpstructure.di.ApplicationContext;
import cn.littleox.mvpstructure.di.DBInfo;

public class DbOpenHelper extends DaoMaster.DevOpenHelper {


    @Inject
    public DbOpenHelper(@ApplicationContext Context context,
                        @DBInfo String name) {
        super(context, name);
    }


}
