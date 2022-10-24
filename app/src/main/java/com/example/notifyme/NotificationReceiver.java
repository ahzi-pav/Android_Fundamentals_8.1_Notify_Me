package com.example.notifyme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NotificationReceiver extends BroadcastReceiver {

    public NotificationReceiver() {

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        ((MainActivity)context).updateNotification();
    }
}
