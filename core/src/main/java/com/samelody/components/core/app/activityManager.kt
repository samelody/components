package com.samelody.components.core.app

import android.app.*
import androidx.core.app.*

/**
 * Returns true if this is a low-RAM device.  Exactly whether a device is low-RAM
 * is ultimately up to the device configuration, but currently it generally means
 * something in the class of a 512MB device with about a 800x480 or less screen.
 * This is mostly intended to be used by apps to determine whether they should turn
 * off certain features that require more RAM.
 */
inline fun ActivityManager.isLowRamDevice() = ActivityManagerCompat.isLowRamDevice(this)