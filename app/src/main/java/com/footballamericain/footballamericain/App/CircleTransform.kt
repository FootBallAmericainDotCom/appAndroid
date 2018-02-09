package com.footballamericain.footballamericain.App

import android.graphics.*
import com.squareup.picasso.Transformation


/**
 * Created by Jc on 03/02/2018.
 */
class CircleTransform(private val color: Int = 0) : Transformation {

    private val strokeWidth: Int = 40

    override fun transform(source: Bitmap): Bitmap {
        val size = Math.min(source.width, source.height)

        val x = (source.width - size) / 2
        val y = (source.height - size) / 2

        val squaredBitmap = Bitmap.createBitmap(source, x, y, size, size)
        if (squaredBitmap != source) {
            source.recycle()
        }

        val bitmap = Bitmap.createBitmap(size, size, source.config)

        val canvas = Canvas(bitmap)
        val paint = Paint()
        val shader = BitmapShader(squaredBitmap,
                Shader.TileMode.CLAMP, Shader.TileMode.CLAMP)
        paint.shader = shader
        paint.isAntiAlias = true

        val r = size / 2f

        canvas.drawCircle(r, r, r - this.strokeWidth.toFloat() - 1f, paint)

        val stroke = Paint()
        stroke.color = this.color
        stroke.style = Paint.Style.STROKE
        stroke.isAntiAlias = true
        stroke.strokeWidth = this.strokeWidth.toFloat()
        canvas.drawCircle(r, r, r - this.strokeWidth, stroke)

        squaredBitmap.recycle()
        return bitmap
    }

    override fun key(): String {
        return "circle"
    }
}