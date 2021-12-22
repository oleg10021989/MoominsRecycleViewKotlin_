package com.example.myapplicationrecyclerview

import com.example.myapplicationrecyclerview.models.BlogPost

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<BlogPost> {
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Katie Mitchell",
                    "An aspiring filmmaker who is the daughter of Rick and Linda, and Aaron's older sister.",
                    "https://64.media.tumblr.com/24c9d03121794a319e99bffeb7344483/9a87b25b69772860-f6/s1280x1920/3f5e771b98a36db936f71434ecae99312bae9157.jpg",
                    "Abbi Jacobson"
                )
            )
            list.add(
                BlogPost(
                    "Rick Mitchell",
                    "The nature-obsessed and technophobic father of Katie and Aaron, and Linda's husband.",
                    "https://static.wikia.nocookie.net/netflix/images/3/3d/Rick_Mitchell.jpg/revision/latest/top-crop/width/360/height/450?cb=20210503055206",
                    "Danny McBride"
                )
            )

            list.add(
                BlogPost(
                    "Linda Mitchell",
                    "The mother of Katie and Aaron, and Rick's wife.",
                    "https://pbs.twimg.com/media/E4ce1PrVEAg0T4p.png", "Maya Rudolph"
                )
            )
            list.add(
                BlogPost(
                    "Aaron Mitchell",
                    "the dinosaur-loving son of Rick and Linda, and Katie's younger brother.",
                    "https://i.pinimg.com/564x/7e/81/64/7e81640ee3aaeb949a46de775e53d3c3.jpg",
                    "Mike Rianda"
                )
            )
            list.add(
                BlogPost(
                    "Monchi",
                    " the Mitchell family's pet dog.",
                    "https://cdn.vox-cdn.com/thumbor/Wte1WPdZKUAe1wpVna-_X8Pe2PY=/1400x788/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/22496967/CON_ktr220.1031.jpg",
                    "Doug the Pug"
                )
            )
            list.add(
                BlogPost(
                    "PAL",
                    "A ruthless, arrogant and maniacal rogue virtual assistant created by Mark, who wants to exact revenge on humankind after being discarded as obsolete.",
                    "https://static.wikia.nocookie.net/connectedmovie/images/b/b3/PALAI.jpg/revision/latest?cb=20210502004729",
                    "Olivia Colman"
                )
            )
            list.add(
                BlogPost(
                    "Deborahbot 5000 & Eric",
                    "Damaged PAL Max robots from PAL Labs who help the Mitchells.",
                    "https://i.ytimg.com/vi/4ZXiBaNwtJo/maxresdefault.jpg",
                    "Fred Armisen and Beck Bennett "
                )
            )
            list.add(
                BlogPost(
                    "Abbey Posey",
                    "The dinosaur-loving daughter of the Mitchells' neighbors, Jim and Hailey Posey, and Aaron's crush.",
                    "data:image/jpeg;base64,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",
                    "Charlyne Yi"
                )
            )
            return list
        }
    }
}