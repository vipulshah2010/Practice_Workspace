package vipshah.dagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {
    MainActivityComponent plus(MainActivityModule module);
}
