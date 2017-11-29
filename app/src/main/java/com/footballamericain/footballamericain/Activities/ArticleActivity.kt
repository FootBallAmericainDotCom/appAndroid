package com.footballamericain.footballamericain.Activities

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.databinding.ActivityArticleBinding

class ArticleActivity : AppCompatActivity() {

    var title: String = "Case Keenum mène les Vikings vers une 7e victoire"
    var text: String = getTextSample()
    var url: String = "http://www.footballamericain.com/images/images/matchs/matchup/WASvsMIN.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityArticleBinding = DataBindingUtil.setContentView(this, R.layout.activity_article)
        binding.activity = this

    }

    fun getTextSample(): String {
        return "C'est derrière un très bon Case Keenum que les Minnesota Vikings (7-2) remportent leur 7e match de la saison, chez les Washington Redskins (4-5) 38-30. Les Lions et les Packers ayant gagné, les Violets maintiennent donc leur précieux matelas de 2 victoires sur ses poursuivants.\n" +
                "Keenum a lancé 4 touchdowns en moins de 15 minutes (11:45 du QT2 et 12:22 du QT3) pour donner à son équipe un avantage de 18 points (35-17) en début de 3e QT. Les efforts de Kirk Cousins n'ont pas permis aux Redskins de revenir dans le match. Le QB de Minnesota termine avec un 21/29 pour 304 yards, 4 TD mais 2 Int et un pick-6 de D.J. Swearinger en 2e mi-temps. Son rating demeure excellent avec 117. Il a trouvé Adam Thielen à 8 reprises pour 166 yards et un TD. Les 3 autres passes de TD ont été réceptionnées par Stefon Diggs, David Morgan II et Jarius Wright.\n" +
                "Les Vikings sont ex-aequos avec les Saints à la 2e place de la NFC, derrière les Eagles (8-1). Dans une conférence très relevée avec plusieurs équipes à déjà 6 victoires, les Redskins viennent peut-être de perdre le match de trop."
    }
}
