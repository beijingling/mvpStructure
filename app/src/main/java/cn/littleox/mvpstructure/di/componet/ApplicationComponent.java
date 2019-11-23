package cn.littleox.mvpstructure.di.componet;

import cn.littleox.mvpstructure.MVPApplication;
import cn.littleox.mvpstructure.di.module.ApplicationModule;
import dagger.Component;

@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MVPApplication application);
}
