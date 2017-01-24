package vipshah.dagger2;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface ParentComponent {

    SharedPreferences sharedPreferences();
}
