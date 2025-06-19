package com.example.hepsiburada

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.hepsiburada.adapter.ImageCardAdapter
import com.example.hepsiburada.adapter.ProductCardAdapter
import com.example.hepsiburada.data.entity.ImageCard
import com.example.hepsiburada.data.entity.ProductCard
import com.example.hepsiburada.databinding.ActivityMainBinding

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

        // product Card
        val productList = ArrayList<ProductCard>()
        val productCardAdapter = ProductCardAdapter(this, productList)
        val product1= ProductCard(1,
            "stanley1",
            "Stanley The Aerolight Transit Termos Bardak 0.35 Lt",
            "1.084,30 TL",
            "4,6",
            998,
            "Peşin fiyatına 3 taksit"
            )
        val product2= ProductCard(2,
            "vetta1",
            "la & vetta Siyah Kumaş Bol Kesim Spor Şort",
            "499,99 TL",
            "4,1",
            174,
            "3 taksit"
        )

        val product3= ProductCard(3,
            "elart1",
            "Elart Elart pamuk Pike Çift Kişilik Evony",
            "399 TL",
            "4,2",
            19,
            "3 taksit"
        )

        productList.add(product1)
        productList.add(product2)
        productList.add(product3)
        binding.recyclerProductCard.adapter= productCardAdapter
        binding.recyclerProductCard.layoutManager = StaggeredGridLayoutManager(
            1,
            StaggeredGridLayoutManager.HORIZONTAL
        )


    }
}
