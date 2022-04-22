package net.halowd.temp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerViewInit()
    }

    private fun recyclerViewInit(){
        val recyclerView: RecyclerView = findViewById(R.id.rv_feed)
        recyclerView.setHasFixedSize(false)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = FeedAdapter(DummyData.getInstance().feeds)

        // divider
        val customDecoration = RecyclerViewDivider(20f, 0f, Color.LTGRAY)
        recyclerView.addItemDecoration(customDecoration)

    }

}