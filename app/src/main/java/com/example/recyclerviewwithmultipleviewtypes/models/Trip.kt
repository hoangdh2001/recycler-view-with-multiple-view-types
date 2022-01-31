package com.example.recyclerviewwithmultipleviewtypes.models

import androidx.annotation.DrawableRes

data class Trip(
    @DrawableRes val tripImage: Int,
    val tripTitle: String,
    val trip: String
)