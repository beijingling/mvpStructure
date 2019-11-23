package cn.littleox.mvpstructure.di.componet;

import cn.littleox.mvpstructure.di.module.ActivityModule;
import cn.littleox.mvpstructure.ui.MainActivity;
import cn.littleox.mvpstructure.ui.home.BlogFragment;
import dagger.Component;

@Component(dependencies = ApplicationComponent.class ,modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(BlogFragment fragment);
}
