package com.example.netflix_clone.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.netflix_clone.R

@Composable
fun FavoriteScreen(navController: NavHostController) {
    val selectedIcon = remember { mutableStateOf(IconType.Home) }
    Scaffold(
        modifier = Modifier.background(color = Color.Gray),
        bottomBar = {
            BottomBar(
                selectedIcon = IconType.Favorite,
                onClickHome = { navController.navigate("home");navController.navigate("TrendingScreen") },
                onClickSearch = { navController.navigate("search") },
                onClickFavorite = { selectedIcon.value = IconType.Favorite },
                onClickPerson = { navController.navigate("Profile") }
            )
        }
    ) { innerpadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(innerpadding)
                .background(color = Color.Black)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(70.dp)
                    .background(color = Color.Black),
                horizontalArrangement = Arrangement.Absolute.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.netflix_logo2),
                    contentDescription = "Image",
                    modifier = Modifier
                        .size(width = 200.dp, height = 65.dp)
                        .background(color = Color.Black)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {Spacer(modifier = Modifier.weight(0.5f))
                val onClickTrending = {navController.navigate("TrendingScreen")}
                val onClickMovies = {navController.navigate("MovieScreen")}
                val onClickSeries = {navController.navigate("SeriesScreen")}
                TextButton(onClick = onClickTrending) {
                    Text("Trending", color = Color.White,fontSize = 18.sp, style = MaterialTheme.typography.bodyMedium)
                }
                Spacer(modifier = Modifier.weight(1f))
                TextButton(onClick = onClickMovies) {
                    Text("Movies", color = Color.White,fontSize = 18.sp, style = MaterialTheme.typography.bodyMedium)
                }
                Spacer(modifier = Modifier.weight(1f))
                TextButton(onClick = onClickSeries) {
                    Text("Series", color = Color.White,fontSize = 18.sp, style = MaterialTheme.typography.bodyMedium)
                }
                Spacer(modifier = Modifier.weight(0.5f))
            }
            JokerScreen(navController)
        }
    }
}
@Composable
fun JokerScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://th.bing.com/th/id/OIP.Rp8Lh9A2BeUe9wPMycm-ggHaLG?rs=1&pid=ImgDetMain")
                .allowHardware(false) // disable hardware acceleration to reduce memory usage
                .build(),
            contentDescription = "Vadh",
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp),
            contentScale = ContentScale.Fit
        )
        IconButton(onClick = { navController.navigate("youtube/Yui0K2nOLg8") },
            modifier = Modifier.clip(RoundedCornerShape(30.dp)).background(color = Color.Red)
                    )
        {
            Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "Play Buttom")
        }
        Text(
            text = "Vadh",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Text(
            text = "Crime | Drama | Thriller",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Year",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Text(
                text = "2022",
                fontSize = 14.sp,
                color = Color.White
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Rating",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Text(
                text = "7.2/10",
                fontSize = 14.sp,
                color = Color.White
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Length",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Text(
                text = "110 min",
                fontSize = 14.sp,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Shambhunath Mishra, a retired middle school teacher lives with his wife Manju " +
                    "Mishra in the old by-lanes of the city Gwalior. They were satisfied with their " +
                    "mundane middle class life, till their son decides to go for higher studies to USA.",
            fontSize = 14.sp,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.border(width = 1.dp, color = Color.White))
    }
}