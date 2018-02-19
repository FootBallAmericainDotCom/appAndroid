package com.footballamericain.footballamericain.App

import android.content.Context
import com.apollographql.apollo.ApolloClient
import com.footballamericain.footballamericain.BuildConfig
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * Created by Jc on 18/02/2018.
 */
class GqlClient {

    companion object {
        private const val SQL_CACHE_NAME = "footUsGQLCache"
        private const val BASE_URL_DEBUG = ""
        private const val BASE_URL = ""

        fun getClient(context: Context): ApolloClient {
            val apolloClient: ApolloClient

            val builder: OkHttpClient.Builder = OkHttpClient.Builder()
            builder.connectTimeout(45, TimeUnit.SECONDS)
            builder.writeTimeout(45, TimeUnit.SECONDS)
            builder.readTimeout(45, TimeUnit.SECONDS)

            val okHttpClient: OkHttpClient = builder.build()

            val url = when (BuildConfig.DEBUG) {
                true -> BASE_URL_DEBUG
                false -> BASE_URL
            }

            apolloClient = ApolloClient.builder()
                    .serverUrl(url)
                    .okHttpClient(okHttpClient)
                    .build()

            return apolloClient
        }
    }
}