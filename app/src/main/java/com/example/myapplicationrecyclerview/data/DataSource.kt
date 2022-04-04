package com.example.myapplicationrecyclerview.data

import com.example.myapplicationrecyclerview.R
import com.example.myapplicationrecyclerview.models.BlogPost

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<BlogPost> {
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    0,
                    "Alice",
                    "Alice (also known as Aliisa in the Finnish/Swedish translations, Alicia in the English dub of the 90s anime) is the witch's granddaughter and a witch in training and develops several magic skills ",
                    R.drawable.alica,
                    R.drawable.alice2,
                    "Lars Jansson"
                )
            )
            list.add(
                BlogPost(
                    1,
                    "Sleeky",
                    "Rappu is a dolphin and one of the minor characters in the Moomin anime series from 1990-92. She is known as Sleeky in the English dub.",
                    R.drawable.sleeky,
                    R.drawable.moomintroll_and_rappu,
                    "Lars Jansson"
                )
            )

            list.add(
                BlogPost(
                    2,
                    "The Groke",
                    "The Groke (Finnish: Mörkö, Swedish: Mårran) is a fictional character in the Moomin world created by Tove Jansson. Wherever she stands, the ground below her freezes and plants and grass die. ",
                    R.drawable.groke,
                    R.drawable.groke_3,
                    "Tove Jansson"
                )
            )
            list.add(
                BlogPost(
                    3,
                    "Hemulens",
                    "Hemulens are a species of characters in the Moomin series of books by Swedish-Finnish author Tove Jansson. Hemulens feature in several of the books and almost all other Moomin media.",
                    R.drawable.hemulen,
                    R.drawable.hemulen2,
                    "Tove Jansson"
                )
            )
            list.add(
                BlogPost(
                    4,
                    "Little My",
                    " Little My (Finnish: Pikku Myy, Swedish: Lilla My, Japanese:ちびのミイ(Chibi no Mii)) is a character in the Moomin series of books by Tove Jansson. She first appears in the fourth book, Moominpappa's Memoirs.",
                    R.drawable.littlemy,
                    R.drawable.my1,
                    "Pikku Myy"
                )
            )
            list.add(
                BlogPost(
                    5,
                    "Moominmamma",
                    "Moominmamma (Finnish: Muumimamma, Swedish: Muminmamman) is a Moomin married to Moominpappa, who found her during a storm, and is the mother of Moomintroll.",
                    R.drawable.moominmamma1,
                    R.drawable.finland,
                    "Tove Jansson"
                )
            )
            list.add(
                BlogPost(
                    6,
                    "Moominpappa",
                    "Moominpappa (Finnish: Muumipappa, Swedish: Muminpappan) is a Moomin married to Moominmamma and is the father of Moomintroll. ",
                    R.drawable.moominpappa,
                    R.drawable.moominpa,
                    "Tove Jansson"
                )
            )
            list.add(
                BlogPost(
                    7,
                    "Moomintroll",
                    "Moomintroll (Finnish: Muumipeikko or Muumi, Swedish: Mumintrollet, Japanese:ムーミントロール) is the main character in the Moomin books by Tove Jansson. ",
                    R.drawable.moomintroll,
                    R.drawable.moomintroll_and_rappu,
                    "Tove Jansson"
                )
            )
            list.add(
                BlogPost(
                    8,
                    "Sniff",
                    "Sniff is Moomintroll's friend and later adopted brother. He is the son of the Muddler and the Fuzzy.",
                    R.drawable.sniff,
                    R.drawable.moomintroll,
                    "Tove Jansson"
                )
            )
            list.add(
                BlogPost(
                    9,
                    "Snork",
                    "Snork (Finnish: Niisku; Swedish: Snorken) is a character who first appears in the Moomin books",
                    R.drawable.snork,
                    R.drawable.snork_scorch,
                    "Tove Jansson"
                )
            )
            list.add(
                BlogPost(
                    10,
                    "Snorkmaiden",
                    "Snorkmaiden (Finnish: Niiskuneiti, Swedish: Snorkfröken) is a character in the Moomin series of books by Finnish author Tove Jansson.",
                    R.drawable.snorkmaiden1,
                    R.drawable.snorka,
                    "Tove Jansson"
                )
            )
            list.add(
                BlogPost(
                    11,
                    "Snufkin",
                    "Snufkin (Finnish: Nuuskamuikkunen, Swedish: Snusmumriken, Japanese: スナフキン) is Moomintroll's best friend, who goes south every winter and returns in the spring.",
                    R.drawable.shipwreck,
                    R.drawable.snufkin1,
                    "Tove Jansson"
                )
            )
            list.add(
                BlogPost(
                    12,
                    "Stinky",
                    "Stinky is a small, brown, hairy thing created by Tove Jansson for the Moomin comic strip. He describes the Moomins as too soft. Stinky lives in the wood at the foot of the tree in Moominvalley.",
                    R.drawable.stinky,
                    R.drawable.stinky1,
                    "Tove Jansson"
                )
            )
            return list
        }
    }
}