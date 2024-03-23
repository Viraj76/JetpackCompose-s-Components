package com.example.jcpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.example.jcpractice.components.ExpandableCard
import com.example.jcpractice.components.LoadingButton
import com.example.jcpractice.components.PTextFields
import com.example.jcpractice.components.PracticeCoil
import com.example.jcpractice.components.PracticePasswordText
import com.example.jcpractice.ui.theme.JCPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            JCPracticeTheme {
                // A surface container using the 'background' color from the theme
                // first background and then padding
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    PracticePasswordText()
                }
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