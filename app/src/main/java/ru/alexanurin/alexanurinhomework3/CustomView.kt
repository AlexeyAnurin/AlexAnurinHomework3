package ru.alexanurin.alexanurinhomework3

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

//  кастомный красный круг/кнопка
class CustomView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var size = 80
    private var borderColor = Color.BLACK
    private var borderWidth = 4.0f // в пикселях

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paint.color = resources.getColor(R.color.design_default_color_error)
        paint.style = Paint.Style.FILL

        val radius = size / 2f

        canvas.drawCircle(size / 2f, size / 2f, radius, paint)

        paint.color = borderColor
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawCircle(size / 2f, size / 2f, radius - borderWidth / 2f, paint)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        size = Math.min(measuredWidth, measuredHeight)

        setMeasuredDimension(size, size)
    }

}