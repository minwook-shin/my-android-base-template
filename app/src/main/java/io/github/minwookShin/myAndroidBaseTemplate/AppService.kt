package io.github.minwookShin.myAndroidBaseTemplate

import android.app.Service
import android.content.Intent
import android.os.IBinder

class AppService : Service() {
    override fun onBind(p0: Intent?): IBinder {
        throw UnsupportedOperationException("Not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return Service.START_STICKY
    }

}