package com.example.x.railwayapp.beans

import com.google.gson.annotations.SerializedName

data class ClassesItem(@SerializedName("code")
                       val code: String = "",
                       @SerializedName("name")
                       val name: String = "",
                       @SerializedName("available")
                       val available: String = "")