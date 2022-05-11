package com.example.assignment

import android.graphics.text.LineBreaker
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.assignment.model.PostDataProvider
import kotlinx.coroutines.delay


@Composable
fun FeedContent(){
    val posts = remember {PostDataProvider.postList}
    LazyColumn(
        modifier = Modifier.padding(top = 10.dp),
        contentPadding = PaddingValues(vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        items(items = posts,
        itemContent = {
            PostListItem(it)
            drawLine()

        })

    }
}
@Composable
fun drawLine(){
    Divider(color = MaterialTheme.colors.secondary, thickness = 0.5.dp,
    modifier = Modifier.padding(bottom = 10.dp).fillMaxWidth())

}