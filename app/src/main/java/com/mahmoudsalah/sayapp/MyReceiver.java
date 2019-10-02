package com.mahmoudsalah.sayapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
         if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
             NewMessageNotification.notify(context,"Do Not Forget To Say","استغفر الله");
         }
         else if (Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())){
             NewMessageNotification2.notify(context,"Do Not Forget To Say","لا حول ولا قوة إلا بالله");
         }
         else if (Intent.ACTION_POWER_DISCONNECTED.equals(intent.getAction())){
             NewMessageNotification.notify(context,"Do Not Forget To Say","سبحان الله");
         }
         else if (Intent.ACTION_USER_UNLOCKED.equals(intent.getAction())){
             NewMessageNotification.notify(context,"Do Not Forget To Say","الحمد لله");
         }
    }
}
