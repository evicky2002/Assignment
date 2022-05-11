package com.example.assignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Theaters
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.assignment.ui.theme.AssignmentTheme
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            AssignmentTheme {
                MainContent()
            }
        }
    }

}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainContent(){
    val list = listOf(TabItem.Charcha,TabItem.Bazaar,TabItem.Profile)
    val pagerState = rememberPagerState(initialPage = 0)

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Tabs(tabs = list, pagerState = pagerState)
        TabContent(tabs = list, pagerState = pagerState)
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs(tabs: List<TabItem>,pagerState: PagerState){

    val scope = rememberCoroutineScope()
    TabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = MaterialTheme.colors.primary,
        indicator = {tabPositions ->
            Modifier.pagerTabIndicatorOffset(pagerState = pagerState, tabPositions = tabPositions)
        },
        ){
        tabs.forEachIndexed{
            index, tabItem ->
            LeadingIconTab(
            selected = pagerState.currentPage==index,
            onClick = { scope.launch {
                pagerState.animateScrollToPage(index)
            } },
            text = { Text(tabItem.title) },

            selectedContentColor = MaterialTheme.colors.primaryVariant,
                icon = {Icons.Default.Theaters},
            unselectedContentColor = MaterialTheme.colors.onPrimary,
            enabled = true
            )
        }
    }

}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabContent(tabs: List<TabItem>, pagerState: PagerState){
    HorizontalPager(count = tabs.size, state = pagerState) { page ->
        tabs[page].screens()

    }

}


@Composable
fun CharchaScreen() {
    Scaffold(content = {
        FeedContent()
    })
}
@Composable
fun BazaarScreen() {
    Scaffold(content = {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Bazaar Page")
        }
    })
}
@Composable
fun ProfileScreen() {
    Scaffold(content = {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Profile Page")
        }
    })
}


