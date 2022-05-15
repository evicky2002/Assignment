package com.example.assignment

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.assignment.model.Comment

@Composable
fun CommentListItem(comment: Comment){

    var liked by remember { mutableStateOf(comment.liked) }
    var likeButtonColor by remember { mutableStateOf(Color.Gray) }

    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.Start
            ){

                AsyncImage(
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp)
                        .clip(CircleShape),
                    model = comment.profilePictureId,
                    contentDescription = "Profile Picture")

            }
            Column(
                modifier = Modifier.weight(3f),
                horizontalAlignment = Alignment.Start

            ) {
                ProfileName(profileName = comment.profileName)
                Text(
                    text = "Public",
                    color = MaterialTheme.colors.onPrimary,
                    fontSize = 10.sp
                )

            }
            IconButton(
                onClick = { /*TODO*/
                    Toast.makeText(context,"More Options", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.Top),
            ) {
                Icon(
                    imageVector = Icons.Default.MoreVert, contentDescription = "more options",
                    tint = MaterialTheme.colors.onPrimary
                )
            }


        }
        Text(
            modifier = Modifier.padding(bottom = 10.dp),
            text = comment.comment,
            overflow = TextOverflow.Ellipsis,
            maxLines = 4,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = MaterialTheme.colors.onPrimary
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(painterResource(id = R.drawable.heart_solid), contentDescription = "",
                    modifier = Modifier
                        .padding(end = 5.dp)
                        .width(20.dp)
                        .clickable {
                            if (liked) {
                                liked = !liked
                                likeButtonColor = Color(0xFFFF0000)
                            } else {
                                liked = !liked

                                likeButtonColor = Color.Gray
                            }
                        },
                    tint = likeButtonColor,
                )
            }


        }
    }}