package vipshah.dagger2;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetModule {
    @Singleton
    @Provides
    public SharedPreferences provideSharedPreference(Context context,
                                                     @Named("pref_name") String preferenceName) {
        return context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
    }
}
