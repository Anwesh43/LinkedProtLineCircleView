package com.example.protlinecircleview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF

val colors : Array<Int> = arrayOf(
    "#F44336",
    "#009688",
    "#4CAF50",
    "#795548",
    "#03A9F4"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 4
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val cFactor : Float = 5.9f
val l1Factor : Float = 13.2f
val l2Factor : Float = 2.9f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
