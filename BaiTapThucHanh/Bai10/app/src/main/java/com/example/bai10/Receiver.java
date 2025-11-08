package com.example.bai10;

import android.content.*;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        long value = intent.getLongExtra("new value", -10) + 10;

        Toast.makeText(context,
                        "Broadcast Receiver catch Intent\nValue is: " + value,
                        Toast.LENGTH_LONG)
                .show();
    }
}
