package com.dxbwf.wasif.wasif_dx_ball;


import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Helper {
    private static final String TAG = "Helper";

    public static float getConfigValue(Context context, String name) {
        Resources resources = context.getResources();

        try {
            InputStream rawResource = resources.openRawResource(R.raw.level1);
            Properties properties = new Properties();
            properties.load(rawResource);
              return Float.parseFloat(properties.getProperty(name));

        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "Unable to find the config file: " + e.getMessage());
        } catch (IOException e) {
            Log.e(TAG, "Failed to open config file.");
        }

        return 0;
    }
}
