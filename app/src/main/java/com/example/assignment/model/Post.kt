package com.example.assignment.model


data class Post(
    val id : Int,
    val profilePictureId: String,
    val profileName: String,
    val questionType: String,
    val question: String,
    val postImageID: String?,
    val likes: Int,
    val comments: Int
)