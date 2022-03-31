package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array <JSONObject> = arrayOf(
            JSONObject("{\"title\": \"An awesome video title\", \"channel\": \"ChannelName\", \"view\": \"6k views\", \"datePosted\": \"5 days ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"view\": \"8k views\", \"datePosted\": \"5 days ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"view\": \"10k views\", \"datePosted\": \"5 days ago\", \"duration\": \"05:25\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"view\": \"150k views\", \"datePosted\": \"A month ago\", \"duration\": \"05:02\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"view\": \"254k views\", \"datePosted\": \"2 years ago\", \"duration\": \"05:00\"}")
        )

        binding.rcVideosEntries.adapter = MainAdapter(fakeVideoData)
    }
}