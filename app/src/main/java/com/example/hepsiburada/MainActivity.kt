package com.example.hepsiburada

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.hepsiburada.adapter.ImageCardAdapter
import com.example.hepsiburada.data.entity.ImageCard
import com.example.hepsiburada.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var imageList: ArrayList<ImageCard>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ✅ binding'i initialize et
        binding = ActivityMainBinding.inflate(layoutInflater)

        // ✅ önce initialize, sonra kullan!
        setContentView(binding.root)

        imageList = arrayListOf(
            ImageCard("image1"),
            ImageCard("image2"),
            ImageCard("image3"),
            ImageCard("image4"),
            ImageCard("image5"),
            ImageCard("image6"),
            ImageCard("image7"),
            ImageCard("image8")
        )

        val imageCardAdapter = ImageCardAdapter(this, imageList)

        binding.recyclerImageCard.adapter = imageCardAdapter
        binding.recyclerImageCard.layoutManager = StaggeredGridLayoutManager(
            4,
            StaggeredGridLayoutManager.VERTICAL
        )
    }
}
