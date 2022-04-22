package net.halowd.temp

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FeedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val imageView : AppCompatImageView = itemView.findViewById(R.id.iv_img)
    private val textView : AppCompatTextView = itemView.findViewById(R.id.tv_content)

    fun setItem(feed: Feed){
//        imageView.layout(0, 0, 0, 0) // x, y, w, h
        Glide.with(itemView)
            .load(feed.imgSrc)
//            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(imageView)
        textView.text = "${feed.imgSrc}\n${feed.content}"
    }
}