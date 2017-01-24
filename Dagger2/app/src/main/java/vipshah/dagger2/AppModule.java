package vipshah.dagger2;

import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Context mContext;
    private final String mPreferenceName;

    @Singleton
    public AppModule(Context context, String preferenceName) {
        mContext = context;
        mPreferenceName = preferenceName;
    }

    @Provides
    @Singleton
    public Context provideAppContext() {
        return mContext;
    }

    @Provides
    @Singleton
    @Named("pref_name")
    public String providePreferenceName() {
        return mPreferenceName;
    }
}
