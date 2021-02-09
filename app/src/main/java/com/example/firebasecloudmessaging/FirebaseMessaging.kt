package com.example.firebasecloudmessaging

import android.util.Log

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


private const val TAG = "FirebaseMessaging"

class FirebaseMessaging : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        Log.e(TAG, "onMessageReceived: ${remoteMessage.notification?.body}")
    }

    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
        Log.e(TAG, "onNewToken: $p0")

    }
}