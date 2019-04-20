package com.samelody.components.squarelayout

import android.annotation.*
import android.content.*
import android.os.Build.VERSION_CODES.*
import android.util.*
import android.widget.*

/**
 * [FrameLayout] which forces itself to be laid out as square.
 *
 * @author Belin Wu <belinwu@qq.com>
 */
@TargetApi(LOLLIPOP)
class SquareFrameLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)

        if (widthSize == 0 && heightSize == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)

            val minSize = Math.min(measuredWidth, measuredHeight)
            setMeasuredDimension(minSize, minSize)
            return
        }

        val size = when {
            // If one of the dimensions has no restriction on size, set both dimensions to be the
            // on that does
            widthSize == 0 || heightSize == 0 -> Math.max(widthSize, heightSize)

            // Both dimensions have restrictions on size, set both dimensions to be the
            // smallest of the two
            else -> Math.min(widthSize, heightSize)
        }

        val newSpec = MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY)
        super.onMeasure(newSpec, newSpec)
    }
}

/**
 * [LinearLayout] which forces itself to be laid out as square.
 *
 * @author Belin Wu <belinwu@qq.com>
 */
@TargetApi(LOLLIPOP)
class SquareLinearLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)

        if (widthSize == 0 && heightSize == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)

            val minSize = Math.min(measuredWidth, measuredHeight)
            setMeasuredDimension(minSize, minSize)
            return
        }

        val size = when {
            // If one of the dimensions has no restriction on size, set both dimensions to be the
            // on that does
            widthSize == 0 || heightSize == 0 -> Math.max(widthSize, heightSize)

            // Both dimensions have restrictions on size, set both dimensions to be the
            // smallest of the two
            else -> Math.min(widthSize, heightSize)
        }

        val newSpec = MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY)
        super.onMeasure(newSpec, newSpec)
    }
}

/**
 * [RelativeLayout] which forces itself to be laid out as square.
 *
 * @author Belin Wu <belinwu@qq.com>
 */
@TargetApi(LOLLIPOP)
class SquareRelativeLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr, defStyleRes) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)

        if (widthSize == 0 && heightSize == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)

            val minSize = Math.min(measuredWidth, measuredHeight)
            setMeasuredDimension(minSize, minSize)
            return
        }

        val size = when {
            // If one of the dimensions has no restriction on size, set both dimensions to be the
            // on that does
            widthSize == 0 || heightSize == 0 -> Math.max(widthSize, heightSize)

            // Both dimensions have restrictions on size, set both dimensions to be the
            // smallest of the two
            else -> Math.min(widthSize, heightSize)
        }

        val newSpec = MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY)
        super.onMeasure(newSpec, newSpec)
    }
}