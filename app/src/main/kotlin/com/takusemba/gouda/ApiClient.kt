package com.takusemba.gouda

import com.takusemba.gouda.model.Member
import com.takusemba.gouda.model.Prefecture
import com.takusemba.gouda.protos.GetMembersResponse
import com.takusemba.gouda.protos.GetPrefecturesResponse
import com.takusemba.gouda.response.MemberResponse
import com.takusemba.gouda.response.PrefectureResponse
import io.reactivex.Single
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.wire.WireConverterFactory
import retrofit2.http.GET
import timber.log.Timber
import java.util.concurrent.TimeUnit

/**
 * Created by takusemba on 2017/05/07.
 */

class ApiClient {

    private val endpoint = "http://ec2-34-203-223-134.compute-1.amazonaws.com/"

    private val okHttpClient: OkHttpClient = OkHttpClient
            .Builder()
            .addNetworkInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.HEADERS))
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()

    private val jsonRetrofit: Retrofit = Retrofit
            .Builder()
            .baseUrl(endpoint)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    private val protoRetrofit: Retrofit = Retrofit
            .Builder()
            .baseUrl(endpoint)
            .client(okHttpClient)
            .addConverterFactory(WireConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    interface Service {

        @GET("v1/prefectures") fun getJsonPrefectures(): Single<PrefectureResponse>

        @GET("v1/members") fun getJsonMembers(): Single<MemberResponse>

        @GET("v2/prefectures") fun getProtoPrefectures(): Single<GetPrefecturesResponse>

        @GET("v2/members") fun getProtoMembers(): Single<GetMembersResponse>
    }


    fun getJsonPrefectures(): Single<List<Prefecture>> {
        return jsonRetrofit
                .create(Service::class.java)
                .getJsonPrefectures()
                .map(PrefectureResponse::prefectures)
    }

    fun getJsonMembers(): Single<List<Member>> {
        return jsonRetrofit
                .create(Service::class.java)
                .getJsonMembers()
                .map(MemberResponse::members)
    }

    fun getProtoPrefectures(): Single<List<Prefecture>> {
        return protoRetrofit
                .create(Service::class.java)
                .getProtoPrefectures()
                .map(GetPrefecturesResponse::prefectures)
                .map {
                    Timber.d("about to map")
                    val prefectures: ArrayList<Prefecture> = ArrayList()
                    it.mapTo(prefectures) { value ->
                        Prefecture().apply {
                            id = value.id
                            name = value.name
                            romaji = value.romaji
                        }
                    }
                    prefectures.toList()
                }
    }

    fun getProtoMembers(): Single<List<Member>> {
        return protoRetrofit
                .create(Service::class.java)
                .getProtoMembers()
                .map(GetMembersResponse::members)
                .map {
                    val members: ArrayList<Member> = ArrayList()
                    it.mapTo(members) { value ->
                        Member().apply {
                            id = value.id
                            age = value.age
                            eyeColor = value.eyeColor
                            name = value.name
                            gender = value.gender
                            company = value.company
                            email = value.email
                            phone = value.phone
                            address = value.address
                            about = value.about
                            greeting = value.greeting
                        }
                    }
                    members.toList()
                }
    }

}