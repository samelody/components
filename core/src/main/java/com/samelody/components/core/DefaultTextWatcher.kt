package com.samelody.components.core

import android.text.*

/**
 * This class provides empty implementations of the methods from [TextWatcher].
 * Any custom watcher that cares only about a subset of the methods of this watcher can
 * simply subclass this class instead of implementing the interface directly.
 *
 * @author Belin Wu <belinwu@qq.com>
 */
class DefaultTextWatcher : TextWatcher {

    override fun afterTextChanged(s: Editable?) {
        // empty impl
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        // empty impl
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        // empty impl
    }
}