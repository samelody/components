package com.samelody.components.core

import android.app.*
import android.app.Application.*
import android.os.*

/**
 * This class provides empty implementations of the methods from [ActivityLifecycleCallbacks].
 * Any custom callback that cares only about a subset of the methods of this callback can
 * simply subclass this class instead of implementing the interface directly.
 *
 * @author Belin Wu <belinwu@qq.com>
 */
class DefaultActivityLifecycleCallback : ActivityLifecycleCallbacks {

    override fun onActivityPaused(activity: Activity?) {
        // empty impl
    }

    override fun onActivityResumed(activity: Activity?) {
        // empty impl
    }

    override fun onActivityStarted(activity: Activity?) {
        // empty impl
    }

    override fun onActivityDestroyed(activity: Activity?) {
        // empty impl
    }

    override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
        // empty impl
    }

    override fun onActivityStopped(activity: Activity?) {
        // empty impl
    }

    override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
        // empty impl
    }
}