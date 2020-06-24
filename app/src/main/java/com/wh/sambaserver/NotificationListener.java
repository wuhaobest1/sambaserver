package com.wh.sambaserver;

import android.content.Intent;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.util.Log;

public class NotificationListener extends NotificationListenerService {

    private static final String TAG = NotificationListener.class.getName();

    public NotificationListener() {
        Log.i(TAG, "NotificationListener");
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onListenerConnected() {
        super.onListenerConnected();
        Log.i(TAG, "onListenerConnected.");
    }

    @Override
    public void onListenerDisconnected() {
        super.onListenerDisconnected();
        Log.i(TAG, "onListenerDisconnected");
    }
}
