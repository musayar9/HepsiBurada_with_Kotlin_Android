package com.example.hepsiburada.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburada.data.entity.ProductCard
import com.example.hepsiburada.databinding.CardProductListBinding

class ProductCardAdapter(var mContext: Context, var productList:List<ProductCard>)
    :RecyclerView.Adapter<ProductCardAdapter.ProductCardDesignHolder>()

{
    inner class ProductCardDesignHolder(var binding: CardProductListBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductCardDesignHolder {
        val binding = CardProductListBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ProductCardDesignHolder(binding)
    }

    override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ProductCardDesignHolder, position: Int) {
        val product = productList.get(position)
        val design = holder.binding
       design.productImage.setImageResource(mContext.resources.getIdentifier(product.productImage,"drawable",
           mContext.packageName)
       )
        design.textProductName.text = product.productName
        design.productPrice.text= product.price
        design.productRating.text= product.rate
        design.productComment.text= "(${product.evaluation.toString()})"
        design.productInstallment.text= product.installment

    }
}