package com.samelody.components.ratioimageview

import android.content.*
import android.util.*
import androidx.appcompat.widget.*

/**
 * A ImageView widget maintains an aspect ratio based on either width or height.
 *
 * @author Belin Wu <belinwu@qq.com>
 */
class RatioImageView : AppCompatImageView {

    companion object {
        /**
         * The default ratio is `1:1`.
         */
        const val DEFAULT_RATIO = 1f

        /**
         * The default enabled state is `true`.
         */
        const val DEFAULT_ENABLED_STATE = true

        /**
         * The ratio type: width/height.
         */
        const val TYPE_WIDTH_HEIGHT = 0

        /**
         * The aspect ratio type: height/width.
         */
        const val TYPE_HEIGHT_WIDTH = 1
    }

    /**
     * The ratio of width/height or height/width.
     */
    private var _ratio = DEFAULT_RATIO

    /**
     * The enabled state.
     */
    private var _ratioEnabled = DEFAULT_ENABLED_STATE

    /**
     * The ratio type.
     */
    private var _ratioType = TYPE_WIDTH_HEIGHT

    /**
     * The ratio.
     */
    var ratio
        get() = _ratio
        set(value) {
            if (value == _ratio) return
            _ratio = value
            requestLayout()
        }

    /**
     * The ratio enabled state.
     */
    var isRatioEnabled
        get() = _ratioEnabled
        set(value) {
            if (value == _ratioEnabled) return
            _ratioEnabled = value
            requestLayout()
        }

    /**
     * The ratio type.
     */
    var ratioType
        get() = _ratioType
        set(type) {
            if (type == _ratioType) return
            when (type) {
                TYPE_HEIGHT_WIDTH, TYPE_WIDTH_HEIGHT -> {
                    _ratioType = type
                    requestLayout()
                }
                else -> throw IllegalStateException("Invalid ratio type")
            }
        }

    constructor(context: Context) : super(context) {
        init(null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init(attrs, defStyle)
    }

    private fun init(attrs: AttributeSet?, defStyle: Int) {
        val array = context.obtainStyledAttributes(attrs, R.styleable.RatioImageView, defStyle, 0)
        _ratio = array.getFloat(R.styleable.RatioImageView_ratio, DEFAULT_RATIO)
        _ratioEnabled = array.getBoolean(R.styleable.RatioImageView_ratioEnabled, DEFAULT_ENABLED_STATE)
        _ratioType = array.getInt(R.styleable.RatioImageView_ratioType, TYPE_WIDTH_HEIGHT)
        array.recycle()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        if (!_ratioEnabled) return

        var newWidth = measuredWidth
        var newHeight = measuredHeight
        when (_ratioType) {
            TYPE_WIDTH_HEIGHT -> newHeight = (newWidth / _ratio).toInt()
            TYPE_HEIGHT_WIDTH -> newWidth = (newHeight / _ratio).toInt()
            else -> return
        }
        setMeasuredDimension(newWidth, newHeight)
    }
}
