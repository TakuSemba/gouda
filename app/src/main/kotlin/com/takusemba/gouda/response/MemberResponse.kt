package com.takusemba.gouda.response

import com.google.gson.annotations.SerializedName
import com.takusemba.gouda.model.Member

/**
 * Created by takusemba on 2017/05/07.
 */

class MemberResponse {
    @SerializedName("members") var members: List<Member> = ArrayList()
}
