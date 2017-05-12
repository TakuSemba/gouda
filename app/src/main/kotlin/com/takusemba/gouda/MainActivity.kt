package com.takusemba.gouda

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.takusemba.gouda.databinding.ActivityMainBinding
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val disposables = CompositeDisposable()
    private val apiClient = ApiClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bdg: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        bdg.prefApiButton.setOnClickListener {

            val startJsonTime: Long = System.currentTimeMillis()
            apiClient.getJsonPrefectures()
                    .doOnSubscribe {
                        disposables.add(it)
                    }
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            {
                                val endJsonTime = System.currentTimeMillis()
                                Timber.d("json: response time = " + (endJsonTime - startJsonTime))
                                Timber.d("json: " + it.toString())
                                bdg.prefJsonResponseResult.text = ((endJsonTime - startJsonTime).toString()) + "ms"
                            },
                            {
                                Timber.d("json: " + it.message)
                            }
                    )

            val startProtoTime: Long = System.currentTimeMillis()
            apiClient.getProtoPrefectures()
                    .doOnSubscribe({ disposables.add(it) })
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            {
                                val endProtoTime = System.currentTimeMillis()
                                Timber.d("proto: response time = " + (endProtoTime - startProtoTime))
                                Timber.d("proto: " + it.toString())
                                bdg.prefProtoResponseResult.text = (endProtoTime - startProtoTime).toString() + "ms"
                            },
                            {
                                Timber.d("proto: " + it.message)
                            }
                    )
        }

        bdg.memberApiButton.setOnClickListener {
            val startJsonTime: Long = System.currentTimeMillis()
            apiClient.getJsonMembers()
                    .doOnSubscribe {
                        disposables.add(it)
                    }
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            {
                                val endJsonTime = System.currentTimeMillis()
                                Timber.d("json: response time = " + (endJsonTime - startJsonTime))
                                Timber.d("json: " + it.toString())
                                bdg.memberJsonResponseResult.text = (endJsonTime - startJsonTime).toString() + "ms"
                            },
                            {
                                Timber.d("json: " + it.message)
                            }
                    )

            val startProtoTime: Long = System.currentTimeMillis()
            apiClient.getProtoMembers()
                    .doOnSubscribe({ disposables.add(it) })
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            {
                                val endProtoTime = System.currentTimeMillis()
                                Timber.d("proto: response time = " + (endProtoTime - startProtoTime))
                                Timber.d("proto: " + it.toString())
                                bdg.memberProtoResponseResult.text = (endProtoTime - startProtoTime).toString() + "ms"
                            },
                            {
                                Timber.d("proto: " + it.message)
                            }
                    )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        disposables.clear()
    }
}
