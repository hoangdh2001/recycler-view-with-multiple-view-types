package com.example.recyclerviewwithmultipleviewtypes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithmultipleviewtypes.R
import com.example.recyclerviewwithmultipleviewtypes.const.Type
import com.example.recyclerviewwithmultipleviewtypes.models.Ads
import com.example.recyclerviewwithmultipleviewtypes.models.Item
import com.example.recyclerviewwithmultipleviewtypes.models.News
import com.example.recyclerviewwithmultipleviewtypes.models.Trip

class TripAdapter(
    private val items: List<Item>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class TripViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val imageTrip: ImageView = view!!.findViewById(R.id.image_trip)
        val textTripTitle: TextView = view!!.findViewById(R.id.text_trip_title)
        val textTrip: TextView = view!!.findViewById(R.id.text_trip)
    }

    class NewsViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val textNewsTitle: TextView = view!!.findViewById(R.id.text_news_title)
        val textNews: TextView = view!!.findViewById(R.id.text_news)
    }

    class AdsViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val textAdsTitle: TextView = view!!.findViewById(R.id.text_ads_title)
        val textAds: TextView = view!!.findViewById(R.id.text_ads)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == Type.TRIP) {
            return TripViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_container_trip, parent, false))
        } else if (viewType == Type.ADS) {
            return AdsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_container_ads, parent, false))
        } else {
            return NewsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_container_news, parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(getItemViewType(position)) {
            Type.TRIP -> {
                val trip = items[position].obj as Trip
                holder as TripViewHolder
                holder.imageTrip.setImageResource(trip.tripImage)
                holder.textTrip.text = trip.trip
                holder.textTripTitle.text = trip.tripTitle
            }
            Type.ADS -> {
                val ads = items[position].obj as Ads
                holder as AdsViewHolder
                holder.textAds.text = ads.ads
                holder.textAdsTitle.text = ads.adsTitle
            }
            Type.NEWS -> {
                val news = items[position].obj as News
                holder as NewsViewHolder
                holder.textNews.text = news.news
                holder.textNewsTitle.text = news.newsTitle
            }
        }
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int {
        return items.get(position).type
    }

}