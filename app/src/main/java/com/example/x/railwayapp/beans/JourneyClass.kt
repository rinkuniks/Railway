package com.example.x.railwayapp.beans

import com.google.gson.annotations.SerializedName

data class JourneyClass(@SerializedName("code")
                        val code: String = "",
                        @SerializedName("name")
                        val name: String = null.toString())