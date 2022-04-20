package com.idn.newsapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    val title : String,
    val content : String,
    val date : String,
    val author :String,
    val time : String,
    val category : String,
    val photo : Int

):Parcelable
