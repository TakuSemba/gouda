package com.takusemba.gouda.response

import com.google.gson.annotations.SerializedName
import com.takusemba.gouda.model.Prefecture

/**
 * Created by takusemba on 2017/05/07.
 */

class PrefectureResponse {

    @SerializedName("prefectures") var prefectures: List<Prefecture> = ArrayList()
}
