package com.footballamericain.footballamericain.Repository

import com.footballamericain.footballamericain.dummy.RankingDummyContent

/**
 * Created by Jc on 06/01/2018.
 */
class RankingRepository {

    companion object {
        fun getConference() : MutableList<RankingDummyContent.Rank> {
            return RankingDummyContent.RANKING
        }
    }
}