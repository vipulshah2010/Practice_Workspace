package vipshah.dagger2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    // @formatter:off
    @Inject SharedPreferences preferences;

    @Inject @Named("Activity_Name") String activityName;
    // @formatter:on

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerAppComponent.builder().appModule(new AppModule(this, "user_info")).build().
                plus(new MainActivityModule()).inject(this);

        preferences.edit().putBoolean("passed", true).apply();

        Toast.makeText(this, Boolean.toString(preferences.getBoolean("passed", false)), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Activity Name is " + activityName, Toast.LENGTH_SHORT).show();
    }
}
