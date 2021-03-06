/*
 * Copyright (C) 2013 The Dagger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package vipshah.dagger_simple.ui;

import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

import vipshah.dagger_simple.DemoApplication;
import vipshah.dagger_simple.R;

public class HomeActivity extends DemoActivity {
    @Inject
    LocationManager locationManager;
    @Inject
    Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((DemoApplication) getApplication()).component().inject(this);

        // TODO do something with the injected dependencies here!
        Log.d("HomeActivity", locationManager.toString());

        Toast.makeText(this, resources.getString(R.string.app_name), Toast.LENGTH_LONG).show();
    }
}
