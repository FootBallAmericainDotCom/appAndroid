package com.footballamericain.footballamericain.Repository

import android.os.Handler
import com.footballamericain.footballamericain.dummy.MatchDummyContent
import java.util.*

/**
 * Created by Jc on 19/02/2018.
 */
class WeekRepository {

    companion object {

        fun getWeekList(onDataReadyCallback: WeekRepository.OnDataReadyCallback) {
            val calendar = MatchDummyContent.CALENDAR
            Handler().postDelayed({
                onDataReadyCallback.onDataReady(calendar)
            }, 2000)
        }
    }

    interface OnDataReadyCallback {
        fun onDataReady(calendar: ArrayList<ArrayList<MatchDummyContent.Match>>)
    }
}