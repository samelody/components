package com.samelody.components.core.app

import android.app.*
import android.content.*
import android.os.*
import androidx.core.app.*

inline fun Activity.startActivityForResult(
        intent: Intent,
        requestCode: Int,
        options: Bundle? = null
) {
    ActivityCompat.startActivityForResult(this, intent, requestCode, options)
}

inline fun Activity.startIntentSenderForResult(
        intent: IntentSender,
        requestCode: Int,
        fillInIntent: Intent?,
        flagsMask: Int,
        flagsValues: Int,
        extraFlags: Int,
        options: Bundle? = null
) {
    ActivityCompat.startIntentSenderForResult(this, intent, requestCode, fillInIntent,
            flagsMask, flagsValues, extraFlags, options)
}

inline fun Activity.finishAffinity() = ActivityCompat.finishAffinity(this)

inline fun Activity.finishAfterTransition() = ActivityCompat.finishAfterTransition(this)

