package com.example.assignment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.assignment.model.CommentDataProvider
import com.example.assignment.model.PostDataProvider

@Composable
fun CommentPageContent(){
    val comments = remember { CommentDataProvider.commentList}
    LazyColumn(
        Modifier.background(MaterialTheme.colors.background),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        items(items = comments,
            itemContent = {
                CommentListItem(it)
                drawLine1()

            })

    }
}
@Composable
fun drawLine1(){
    Divider(color = MaterialTheme.colors.secondary, thickness = 0.3.dp,
        modifier = Modifier
            .padding(bottom = 10.dp)
            .fillMaxWidth())

}