package com.example.assignment

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment.model.Comment
import com.example.assignment.model.CommentDataProvider
import com.example.assignment.ui.theme.AssignmentTheme

class CommentPageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            AssignmentTheme {
                Column {
                    Bar()
                    AddComment()
                    CommentScreen()

                }
            }
        }
    }
}

@Composable
fun CommentScreen(){
    CommentPageContent()
}
@Composable
fun Bar(){
    val activity = (LocalContext.current as? Activity)
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = {
                activity?.finish()
            }) {
                Icon(Icons.Filled.ArrowBack, "backIcon")
            }
        },
        backgroundColor = MaterialTheme.colors.background,
        title = { Text(text = "Comments",
            color = MaterialTheme.colors.onBackground,
            fontSize = 16.sp) },
    )
}
@Composable
fun AddComment(){
    var text by remember { mutableStateOf("") }
    Row(

        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp)
    ){
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = text, onValueChange = {newText->
            text= newText
        },
            label = {
                    Text(text = "Comment")
            },
            placeholder = { Text(text = "Add a comment")},
            trailingIcon = {
                IconButton(
                    onClick = {
//                        var newComment = Comment(20,  R.drawable.profile_picture_1,"New","Hello",true)
//                        CommentDataProvider.commentList.add(30,newComment)
                    }) {
                    Icon(imageVector = Icons.Default.Send, contentDescription = "send")
                }
            }
            )

    }
}
