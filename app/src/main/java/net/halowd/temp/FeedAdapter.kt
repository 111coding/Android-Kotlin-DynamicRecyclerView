package net.halowd.temp

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.content.Context
import android.view.LayoutInflater
import android.view.View

class FeedAdapter(feeds : List<Feed>) : RecyclerView.Adapter<FeedViewHolder>() {

    private val feedItems : List<Feed> = feeds

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        val inflater : LayoutInflater = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        /*
         * attachToRoot -> 바로 parent에 붙힐지 여부
         *
         * inflater.inflate(R.layout.feed_item, parent, false)
         * parent.addView(view)
         * ===== 위 아래 동일
         * inflater.inflate(R.layout.feed_item ,parent ,true)
         */
        val view : View = inflater.inflate(R.layout.feed_item, parent, false)

        return FeedViewHolder(view)
    }

    override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
        holder.setItem(feedItems[position])
    }

    override fun getItemCount(): Int {
        return feedItems.size
    }

}