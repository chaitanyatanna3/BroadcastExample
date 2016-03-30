package com.example.chaitanya.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by chaitanyatanna on 3/11/16.
 */
public class AirplaneReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Airplane mode Changed", Toast.LENGTH_LONG).show();

    }
}
