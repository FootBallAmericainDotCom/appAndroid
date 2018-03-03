package com.footballamericain.footballamericain.Repository

import android.graphics.Color
import android.os.Build
import android.view.WindowManager
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.fetcher.ApolloResponseFetchers.NETWORK_ONLY
import com.apollographql.apollo.rx2.Rx2Apollo
import com.footballamericain.footballamericain.Activities.Team.TeamActivityViewModel
import com.footballamericain.footballamericain.App.GqlClient
import com.footballamericain.footballamericain.dummy.PlayerDummyContent
import com.footballamericain.footballamericain.dummy.TeamDummyContent
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import team.GetNFLFranchisesQuery

import java.util.*


/**
 * Created by Jc on 14/01/2018.
 */
class TeamsRepository {

    companion object {

        fun getTeams(): ArrayList<TeamDummyContent.Team> {
            Logger.addLogAdapter(AndroidLogAdapter())

            Logger.d(GqlClient.getClient())

            val query = GetNFLFranchisesQuery.builder()
                    .franchise(1)
                    .ligue(1)
                    .build()

//            val logging = HttpLoggingInterceptor()
//            logging.level = HttpLoggingInterceptor.Level.BODY


            val call = GqlClient.getClient()
                    .query(query)
                    .responseFetcher(NETWORK_ONLY)

            Logger.d(call)

            call.let {
                Rx2Apollo.from(call)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(object : Observer<Response<GetNFLFranchisesQuery.Data>> {
                            override fun onComplete() {
                            }

                            override fun onSubscribe(d: Disposable) {
                            }

                            override fun onNext(t: Response<GetNFLFranchisesQuery.Data>) {
                                Logger.d("onNext : ${t.data()}")
                            }

                            override fun onError(e: Throwable) {
                                Logger.d("Message : ${e.message}")
                                Logger.d("Localized Message : ${e.localizedMessage}")
                                Logger.d("Cause : ${e.cause}")
                                Logger.d("StackTrace : ${e.stackTrace}")
                            }
                        })

            }

            return TeamDummyContent.TEAMS
        }

        fun getTeamById(id: Int, model: TeamActivityViewModel) {
            val team = TeamDummyContent.TEAMS[id]

            model.logo.set(team.logo)
            model.name.set(team.fullName)
            model.colorPrimary.set(team.colorPrimary)
            model.colorSecondary.set(team.colorSecondary)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                model.window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                model.window?.statusBarColor = Color.parseColor(team.colorSecondary)
            }

        }

        fun getTeamById(id: Int): TeamDummyContent.Team {
            return TeamDummyContent.TEAMS[id]
        }

        fun getDepthChart(): ArrayList<ArrayList<PlayerDummyContent.Player>> {
            return PlayerDummyContent.getDepthChart()
        }
    }
}