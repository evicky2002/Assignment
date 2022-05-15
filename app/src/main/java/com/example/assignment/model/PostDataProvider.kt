package com.example.assignment.model

import com.example.assignment.R
import java.util.*
import kotlin.random.Random

object PostDataProvider {
    val post = Post(
      id = 1,
        profilePictureId = "https://randomuser.me/api/portraits/women/82.jpg",
        profileName = "Vignesh",
        questionType = "QUESTION",
        question = "How are you?",
        postImageID = "https://cdn.pixabay.com/photo/2022/04/11/16/29/coffee-beans-7126154__340.jpg",
        likes = (1..1000).random(),
        comments = (1..50).random()
    )
    val postList = listOf<Post>(
        Post(
            id = 2,
            profilePictureId = "https://randomuser.me/api/portraits/women/57.jpg",
            profileName = "Swetha Ravichandran",
            questionType = "QUESTION",
            question = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 2,
            profilePictureId = "https://randomuser.me/api/portraits/men/20.jpg",
            profileName = "Guhan",
            questionType = "QUESTION",
            question = "I am Batman",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 3,
            profilePictureId = "https://randomuser.me/api/portraits/men/39.jpg",
            profileName = "Surenthiran",
            questionType = "MARKETING",
            question = "Free Writing Service",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 4,
            profilePictureId = "https://randomuser.me/api/portraits/men/1.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = null,
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 5,
            profilePictureId = "https://randomuser.me/api/portraits/men/2.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 6,
            profilePictureId = "https://randomuser.me/api/portraits/women/3.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 7,
            profilePictureId = "https://randomuser.me/api/portraits/women/9.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 8,
            profilePictureId = "https://randomuser.me/api/portraits/women/4.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 9,
            profilePictureId = "https://randomuser.me/api/portraits/women/5.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 10,
            profilePictureId = "https://randomuser.me/api/portraits/women/6.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 11,
            profilePictureId = "https://randomuser.me/api/portraits/women/7.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 12,
            profilePictureId = "https://randomuser.me/api/portraits/women/11.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 13,
            profilePictureId = "https://randomuser.me/api/portraits/women/12.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 14,
            profilePictureId = "https://randomuser.me/api/portraits/women/15.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 15,
            profilePictureId = "https://randomuser.me/api/portraits/women/16.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 16,
            profilePictureId = "https://randomuser.me/api/portraits/women/17.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 17,
            profilePictureId = "https://randomuser.me/api/portraits/women/19.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 18,
            profilePictureId = "https://randomuser.me/api/portraits/women/40.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 19,
            profilePictureId = "https://randomuser.me/api/portraits/women/39.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = null,
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 20,
            profilePictureId = "https://randomuser.me/api/portraits/women/38.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 21,
            profilePictureId = "https://randomuser.me/api/portraits/women/37.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 22,
            profilePictureId = "https://randomuser.me/api/portraits/women/36.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 23,
            profilePictureId = "https://randomuser.me/api/portraits/women/35.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 24,
            profilePictureId = "https://randomuser.me/api/portraits/women/34.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 25,
            profilePictureId = "https://randomuser.me/api/portraits/women/33.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 26,
            profilePictureId = "https://randomuser.me/api/portraits/women/32.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 27,
            profilePictureId = "https://randomuser.me/api/portraits/women/31.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 28,
            profilePictureId = "https://randomuser.me/api/portraits/women/17.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 29,
            profilePictureId = "https://randomuser.me/api/portraits/women/19.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        ),
        Post(
            id = 30,
            profilePictureId = "https://randomuser.me/api/portraits/women/18.jpg",
            profileName = "Swetha",
            questionType = "QUESTION",
            question = "How are you doin?",
            postImageID = "https://www.pcclean.io/wp-content/uploads/2020/4/A3ENbe.jpg",
            likes = (1..1000).random(),
            comments = (1..50).random()
        )
    )
}