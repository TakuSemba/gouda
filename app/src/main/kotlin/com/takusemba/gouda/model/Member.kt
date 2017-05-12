package com.takusemba.gouda.model

import com.google.gson.annotations.SerializedName

/**
 * Created by takusemba on 2017/05/08.
 */
class Member {

    @SerializedName("id")
    var id: Long = 0

    @SerializedName("age")
    var age: Long = 0

    @SerializedName("eye_color")
    var eyeColor: String = ""

    @SerializedName("name")
    var name: String = ""

    @SerializedName("gender")
    var gender: String = ""

    @SerializedName("company")
    var company: String = ""

    @SerializedName("email")
    var email: String = ""

    @SerializedName("phone")
    var phone: String = ""

    @SerializedName("address")
    var address: String = ""

    @SerializedName("about")
    var about: String = ""

    @SerializedName("greeting")
    var greeting: String = ""
}
