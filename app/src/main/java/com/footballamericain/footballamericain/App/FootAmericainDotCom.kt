package com.footballamericain.footballamericain.App

import android.app.Application
import com.apollographql.apollo.ApolloClient
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import okhttp3.Interceptor
import okhttp3.OkHttpClient


/**
 * Created by Jc on 24/02/2018.
 */
class FootAmericainDotCom : Application() {
    private val BASE_URL = "https://api.githunt.com/graphql"
    private var apolloClient: ApolloClient? = null

    override fun onCreate() {
        super.onCreate()
        Logger.addLogAdapter(AndroidLogAdapter())

        val okHttpClient = OkHttpClient.Builder()
                .build()

        apolloClient = ApolloClient.builder()
                .serverUrl(BASE_URL)
                .okHttpClient(okHttpClient)
                .build()

        Logger.d(apolloClient)
    }

    fun apolloClient(): ApolloClient? {
        return apolloClient
    }

}