package com.udacity.example.quizexample;

import android.util.Log;

public class LogUtil {

    private static String TAG = LogUtil.class.getSimpleName();

    public static void logStuff(String inputString) {
        Log.d(TAG, inputString);
    }

}
