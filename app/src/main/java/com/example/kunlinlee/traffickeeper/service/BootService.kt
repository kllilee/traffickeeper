package com.example.kunlinlee.traffickeeper.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class BootService :Service() {
    override fun onBind(intent: Intent?): IBinder? {
        Toast.makeText(this,"test",Toast.LENGTH_SHORT).show()
        return null
    }
}