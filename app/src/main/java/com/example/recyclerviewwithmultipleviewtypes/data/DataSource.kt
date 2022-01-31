package com.example.recyclerviewwithmultipleviewtypes.data

import com.example.recyclerviewwithmultipleviewtypes.R
import com.example.recyclerviewwithmultipleviewtypes.const.Type
import com.example.recyclerviewwithmultipleviewtypes.models.Ads
import com.example.recyclerviewwithmultipleviewtypes.models.Item
import com.example.recyclerviewwithmultipleviewtypes.models.News
import com.example.recyclerviewwithmultipleviewtypes.models.Trip

object DataSource {
    val items: List<Item> = listOf(
        Item(
            Type.TRIP,
            Trip(
                R.drawable.croatia, "Croatia", "Summer 2020 - 20 days"
            )
        ),
        Item(
            Type.ADS,
            Ads(
                "Ad: Christmas Holiday", "70% OFF on christmas sale"
            )
        ),
        Item(
            Type.NEWS,
            News(
                "Bali, Indonesia",
                "You'll find beaches, volcanoes, Komodo dragons and jungles sheltering elephants, oragutans and tigers. Basically it's paradise."
            )
        ),
        Item(
            Type.TRIP,
            Trip(R.drawable.bora_bora, "Bora Bora", "Monsoon 2020 - 10 Days")
        ),
        Item(
            Type.NEWS,
            News(
                "Kerry, Ireland",
                "All the way in Ireland is one of the country's most scenic countries. Kerry's moutains, lakes and coasts are postcard-perfect, and that's before you add in Killarney National Park."
            )
        ),
        Item(
            Type.TRIP,
            Trip(R.drawable.bali, "Bali", "Winter 2020 - 12 Days")
        ),
        Item(
            Type.ADS,
            Ads("Ad: Summer Holiday", "50% OFF on your first trip")
        )
    )
}