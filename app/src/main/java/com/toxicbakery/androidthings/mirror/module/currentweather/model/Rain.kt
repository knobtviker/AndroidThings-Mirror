package com.toxicbakery.androidthings.mirror.module.currentweather.model

import com.google.gson.annotations.SerializedName

data class Rain(
        @SerializedName("3h")
        val threeHours: Int
)