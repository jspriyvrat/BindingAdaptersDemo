package com.example.databindingconcepts

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
@BindingAdapter("imageLoad")
fun  ImageView.loadImg(url:String)
{
    Glide.with(this.context).load(url).into(this)
}