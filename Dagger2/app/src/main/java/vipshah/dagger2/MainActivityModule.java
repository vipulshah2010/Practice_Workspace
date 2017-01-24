package vipshah.dagger2;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    @Named("Activity_Name")
    public String getActivityName() {
        return MainActivity.class.getSimpleName();
    }
}
