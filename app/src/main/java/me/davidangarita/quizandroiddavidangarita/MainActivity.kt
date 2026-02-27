package me.davidangarita.quizandroiddavidangarita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.davidangarita.quizandroiddavidangarita.ui.theme.QuizAndroidDavidAngaritaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            primeraPantalla()



        }
    }
}


@Preview(showBackground = true)
@Composable
fun primeraPantalla() {
    Column(modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround) {


        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Text(
                text = "Hello David",
                modifier = Modifier
                    .background(Color.Blue)
                    .padding(10.dp)

            )

        }
        




        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
            .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
            ) {
            Text(
                text = "item 1",
                modifier = Modifier
                    .background(Color.Gray)
                    .padding(10.dp)

            )

            Text(
                text = "item 2",
                modifier = Modifier
                    .background(Color.Gray)
                    .padding(10.dp)

            )
            Text(
                text = "item 3",
                modifier = Modifier
                    .background(Color.Gray)
                    .padding(10.dp)


            )

        }







        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Text(
                text = "Pie de pagina",
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(10.dp)

            )

        }



    }


}
