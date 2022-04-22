package net.halowd.temp

import com.thedeanda.lorem.LoremIpsum
import kotlin.collections.ArrayList

class DummyData{

    val feeds : ArrayList<Feed> = arrayListOf()

    init {
        for (i in 0..80){
            val imgSize = 200 + i * 10
            feeds.add(Feed(i, lorem(), img(imgSize)))
        }
        feeds.shuffle()
    }

    companion object {
        @Volatile private var instance: DummyData? = null

        @JvmStatic fun getInstance(): DummyData =
            instance ?: synchronized(this) {
                instance ?: DummyData().also {
                    instance = it
                }
            }
    }
}


fun lorem() : String{
    return LoremIpsum.getInstance().getWords(5,30);
}

fun img(height : Int) : String{
    return "https://placeimg.com/320/$height/tech"
}

