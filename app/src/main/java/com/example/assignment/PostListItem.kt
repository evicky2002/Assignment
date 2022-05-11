package com.example.assignment

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.assignment.model.Post
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun PostListItem(post: Post){

    val mCustomTextSelectionColors = TextSelectionColors(
        handleColor = Color.Blue,
        backgroundColor = Color(0xFF4C70FF)
    )
    var liked by remember { mutableStateOf(true)}
    var likes by remember { mutableStateOf(post.likes) }
    var question by remember { mutableStateOf(post.question) }
    var likeButtonColor by remember { mutableStateOf(Color(0xff040f16))}
    val sendIntent: Intent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT,question)
        type="text/plain"
    }
    val shareIntent = Intent.createChooser(sendIntent,null)
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 20.dp, start = 20.dp, end = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.Start
                ){
                Image(
                    painter = painterResource(id = post.profilePictureId), contentDescription = "Profile Picture",
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp)
                        .clip(CircleShape)
                )

            }
            Column(
                modifier = Modifier.weight(3f),
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = post.profileName,
                        modifier = Modifier
                            .width(120.dp),
                        overflow = TextOverflow.Ellipsis,
                    fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                        )
                    Text(
                            modifier = Modifier
                                .border(1.dp, Color(0xFF2349FF), RoundedCornerShape(5.dp))
                                .padding(5.dp),
                            text = post.questionType,
                            fontSize = 12.sp,
                            color = Color(0xFF2349FF),
                            )

                }
                Text(
                    text = "2 hours ago",
                    color = Color.Gray,
                    fontSize = 10.sp
                )
            }
            IconButton(
                onClick = { /*TODO*/
                          Toast.makeText(context,"More Options",Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.Top),
            ) {
                    Icon(
                        imageVector = Icons.Default.MoreHoriz, contentDescription = "more options"
                    )
                }


        }
        SelectionContainer(
        ) {
            CompositionLocalProvider(LocalTextSelectionColors provides mCustomTextSelectionColors){
                Text(
                    modifier = Modifier.padding(bottom = 20.dp, start = 10.dp, end = 10.dp),
                    text = post.question,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 4,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                )
            }
        }
        if(post.postImageID!=null){

            AsyncImage(
                modifier = Modifier.width(700.dp).padding(bottom = 20.dp),
                model = post.postImageID,
                contentDescription = "")

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp, start = 20.dp, end = 20.dp),
        ) {
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.heart_solid), contentDescription = "",
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .width(20.dp)
                        .clickable {
                            if (liked) {
                                liked = !liked
                                likes = post.likes + 1
                                likeButtonColor = Color(0xFFFF0000)
                            } else {
                                liked = !liked
                                likes = post.likes
                                likeButtonColor = Color(0xff040f16)

                            }
                        },
                    tint = likeButtonColor
                )
                Text(text = "$likes Likes",

                fontSize = 12.sp
                )
            }
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.Center
            ) {
                IconButton(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .width(20.dp)
                        .height(20.dp),
                    onClick = {
                        context.startActivity(Intent(context, CommentPageActivity::class.java))
                    }) {
                    Icon(imageVector = Icons.Default.Comment,contentDescription = "")

                }

                Text(text = "${post.comments} Comments",
                    fontSize = 12.sp,
                )
            }
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.End
            ) {
                IconButton(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .width(20.dp)
                        .height(20.dp),
                    onClick = {
                        context.startActivity(shareIntent)
                    }) {
                    Icon(
                        painter = painterResource(id = R.drawable.share_solid),contentDescription = "")
                }
                Text(text = "Share",
                    fontSize = 12.sp
                )
            }
        }
    }
}
