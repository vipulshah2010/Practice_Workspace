package vipshah.dagger_simple;

import javax.inject.Singleton;

import dagger.Component;
import vipshah.dagger_simple.ui.DemoActivity;
import vipshah.dagger_simple.ui.HomeActivity;

@Singleton
@Component(modules = AndroidModule.class)
public interface ApplicationComponent {
    void inject(DemoApplication application);

    void inject(HomeActivity homeActivity);

    void inject(DemoActivity demoActivity);
}
