package com.takusemba.gouda.model

import com.google.gson.annotations.SerializedName

/**
 * Created by takusemba on 2017/05/07.
 */

class Prefecture {

    @SerializedName("id")
    var id: Long = 0

    @SerializedName("name")
    var name: String = ""

    @SerializedName("romaji")
    var romaji: String = ""
}

