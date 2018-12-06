package com.example.kunlinlee.traffickeeper.BroadcastReciver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class BootBroadcastReciver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent!!.action.equals(Intent.ACTION_BOOT_COMPLETED)){
            val bootservice = Intent(context,BootBroadcastReciver::class.java)
            context!!.startService(bootservice)
        }
    }
}