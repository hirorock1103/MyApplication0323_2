package com.example.amb01.myapplication0323;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by amb01 on 2018/03/25.
 */

public class AlarmReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int notificationId = intent.getIntExtra("notificationId", 0);
        NotificationManager manager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        Intent bootIntent = new Intent(context, NotificationActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(context,0,bootIntent,0);
        Notification.Builder builder = new Notification.Builder(context);

        builder.setSmallIcon(android.R.drawable.ic_dialog_info);
        builder.setContentTitle("時間ですよ");
        builder.setContentText(intent.getCharSequenceExtra("todo"));
        builder.setWhen(System.currentTimeMillis());
        builder.setPriority(Notification.PRIORITY_DEFAULT);
        builder.setAutoCancel(true);
        builder.setDefaults(Notification.DEFAULT_SOUND);
        builder.setContentIntent(pendingIntent);

        manager.notify(notificationId, builder.build());


    }
}
