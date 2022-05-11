package com.example.assignment.model

import com.example.assignment.R
import java.util.*
import kotlin.random.Random

object PostDataProvider {
    val post = Post(
      id = 1,
        profilePictureId = R.drawable.profile_picture_1,
        profileName = "Vignesh",
        questionType = "QUESTION",
        question = "How are you?",
        postImageID = "https://cdn.pixabay.com/photo/2022/04/11/16/29/coffee-beans-7126154__340.jpg",
        likes = (1..1000).random(),
        comments = (1..100).random()
    )
    val postList = listOf<Post>(
        Post(
            id = 2,
            profilePictureId = R.drawable.profile_picture_1,
            profileName = "Swetha Ravichandran",
            questionType = "QUESTION",
            question = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 2,
            profilePictureId = R.drawable.profile_picture_2,
            profileName = "Guhan",
            questionType = "QUESTION",
            question = "I am Batman",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 3,
            profilePictureId = R.drawable.profile_picture_3,
            profileName = "Surenthiran",
            questionType = "MARKETING",
            question = "Free Writing Service",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 4,
            profilePictureId = R.drawable.profile_picture_4,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = null,
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 5,
            profilePictureId = R.drawable.profile_picture_5,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 6,
            profilePictureId = R.drawable.profile_picture_6,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 7,
            profilePictureId = R.drawable.profile_picture_7,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 8,
            profilePictureId = R.drawable.profile_picture_8,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 9,
            profilePictureId = R.drawable.profile_picture_9,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 10,
            profilePictureId = R.drawable.profile_picture_10,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 11,
            profilePictureId = R.drawable.profile_picture_11,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 12,
            profilePictureId = R.drawable.profile_picture_12,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 13,
            profilePictureId = R.drawable.profile_picture_13,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 14,
            profilePictureId = R.drawable.profile_picture_14,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 15,
            profilePictureId = R.drawable.profile_picture_15,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 16,
            profilePictureId = R.drawable.profile_picture_16,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 17,
            profilePictureId = R.drawable.profile_picture_17,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 18,
            profilePictureId = R.drawable.profile_picture_18,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 19,
            profilePictureId = R.drawable.profile_picture_19,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = null,
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 20,
            profilePictureId = R.drawable.profile_picture_20,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 21,
            profilePictureId = R.drawable.profile_picture_21,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 22,
            profilePictureId = R.drawable.profile_picture_22,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 23,
            profilePictureId = R.drawable.profile_picture_23,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 24,
            profilePictureId = R.drawable.profile_picture_24,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 25,
            profilePictureId = R.drawable.profile_picture_25,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 26,
            profilePictureId = R.drawable.profile_picture_26,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 27,
            profilePictureId = R.drawable.profile_picture_27,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 28,
            profilePictureId = R.drawable.profile_picture_28,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 29,
            profilePictureId = R.drawable.profile_picture_29,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        ),
        Post(
            id = 30,
            profilePictureId = R.drawable.profile_picture_30,
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..100).random()
        )
    )
}