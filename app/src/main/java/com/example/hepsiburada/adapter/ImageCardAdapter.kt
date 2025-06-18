package com.example.hepsiburada.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburada.data.entity.ImageCard
import com.example.hepsiburada.databinding.CardDesignBinding

class ImageCardAdapter(var mContext:Context, var imageList:List<ImageCard>):RecyclerView.Adapter<ImageCardAdapter.ImageDesignHolder>() {


    inner class ImageDesignHolder(var binding:CardDesignBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageDesignHolder {
       val binding = CardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ImageDesignHolder(binding)
    }

    override fun getItemCount():Int = imageList.size

    override fun onBindViewHolder(holder: ImageDesignHolder, position: Int) {
        val image = imageList.get(position)
        val design = holder.binding
        design.imageCard.setImageResource(mContext.resources.getIdentifier(image.image, "drawable", mContext.packageName))
    }
}