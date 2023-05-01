package com.example.gradesystem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gradesystem.ui.theme.GradeSystemTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GradeSystemTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(90, 113, 106, 255)
                ) {
                    BuildHomeScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuildHomeScreen(){

    Column(modifier = Modifier.padding(all = 16.dp)) {

        Row {
            Surface(color = Color.White) {
                Image(
                    painter = painterResource(id = R.drawable.ac_school_of_media_and_design_logo),
                    contentDescription = "The AC logo"
                )
            }
            
            Spacer(modifier = Modifier.padding(horizontal = 32.dp))
          
            Text(text = "Grade System", color = Color.White)
        }
        Spacer(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp))
        Surface(color = Color.White) {
            Image(
                painterResource(id = R.drawable.madlogo),
                contentDescription = "The Madd logo",
                modifier = Modifier.padding(all = 16.dp)
            )
        }
        Spacer(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp))
        TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Enter the Mark")},
                modifier = Modifier.fillMaxWidth()
                )
        Spacer(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp))
       Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
           Text(text = "Submit")
       }
        Spacer(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp))
        Text("That will be the Final Grade", color = Color.White)
    }

}

