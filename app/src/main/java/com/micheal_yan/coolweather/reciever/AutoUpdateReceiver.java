package com.micheal_yan.coolweather.reciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.micheal_yan.coolweather.service.AutoUpdateService;

public class AutoUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }

}
