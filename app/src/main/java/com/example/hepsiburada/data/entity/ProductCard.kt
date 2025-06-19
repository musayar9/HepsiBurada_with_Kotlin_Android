package com.example.hepsiburada.data.entity

import java.io.Serializable

data class ProductCard(
    var id:Int,
    var productImage:String,
    var productName:String,
    val price:String,
    var rate:String,
    var evaluation:Int,
    var installment:String

):Serializable{}