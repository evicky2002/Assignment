package com.example.assignment.model

data class Comment(
    val id: Int,
    val profilePictureId: String,
    val profileName: String,
    val comment: String,
    val liked: Boolean
    )
