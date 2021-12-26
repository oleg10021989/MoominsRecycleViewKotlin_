package com.example.myapplicationrecyclerview.models

import java.io.Serializable


data class BlogPost  (
    var id:Long,
    var title: String,
    var body: String,
    var image: String,
    var userName: String

) :Serializable{

}