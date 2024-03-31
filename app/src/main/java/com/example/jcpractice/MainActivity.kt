package com.example.jcpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.jcpractice.practicenavigation.navgraph.SetupNavGraph
import com.example.jcpractice.ui.theme.JCPracticeTheme

class MainActivity : ComponentActivity() {
    private lateinit var navHostController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JCPracticeTheme {
                // A surface container using the 'background' color from the theme
                // first background and then padding
//                val personRepository = PersonRepository()
//                val allPersonData = personRepository.getAllPersonDetail()
//                LazyColumn(
//                    contentPadding = PaddingValues(all = 12.dp),
//                    verticalArrangement = Arrangement.spacedBy(12.dp)
//                ){
//                    itemsIndexed(
//                        items = allPersonData,
//
//                    ){itemIndex,person->
//                        Log.d("Viraj"  , itemIndex.toString())
//                        CustomItem(person = person)
//                    }
//                }
                navHostController = rememberNavController()
                SetupNavGraph(navHostController = navHostController)
            }
        }
    }
}





/*
@Composable
fun RowScope.CustomSurface(weight : Float , color : Color){
    Surface(
        modifier = Modifier
            .width(100.dp)
            .weight(weight)
            .height(40.dp),
        color = color
    ) {
    }
}
 */
/*
@Composable
fun PracticeBox() {
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(MaterialTheme.colorScheme.error)
        ) {
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .background(MaterialTheme.colorScheme.primary)
            ){}
            Column(
                modifier = Modifier.fillMaxSize(),    // after putting this text were aligned
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Viraj")
                Text(text = "Viraj")
            }

        }
    }
}
 */

/*
@Composable
fun PracticeText(){
    SelectionContainer {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {

            Text(
                text = "Viraj Gupta".repeat(4),maxLines= 1,overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.error)
                    .padding(30.dp)
                    .width(300.dp),
                fontSize = 25.sp,
                color = Color.White,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
            )
            DisableSelection {
                Text(
                    text = "Viraj Gupta".repeat(4),maxLines= 1,overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.error)
                        .padding(30.dp)
                        .width(300.dp),
                    fontSize = 25.sp,
                    color = Color.White,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold,
                )
            }


        }
    }



}

 */

/*
@Composable
fun PracticeAnnotatedString(){
    Text(
        buildAnnotatedString {
            withStyle(style = ParagraphStyle(
                textAlign = TextAlign.Center
            )){
                withStyle(style = SpanStyle(
                    color = Color.Blue,
                    fontSize =  25.sp,
                    fontWeight = FontWeight.Bold
                )){
                    append("V")
                }
                append("i")
                append("r")
                append("a")
                append("j")
            }
        },
        modifier = Modifier.width(200.dp)
    )
}
 */



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        AsyncImage(
            model = "https://example.com/image.jpg"
            ,contentDescription = "Image",
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JCPracticeTheme {
//        val imageUrl = "https://example.com/image.jpg"
//
//        val painter = rememberImagePainter(imageUrl)
//
//        Image(
//            painter = painter,
//            contentDescription = "Image",
//        )
    }
}