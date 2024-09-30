package android.example.composejoshua

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.example.composejoshua.ui.theme.ComposeJoshuaTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.runtime.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeJoshuaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
    var enteredValue by remember {
        mutableStateOf("")
    }

    var isUserBelow18 by remember {
      mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        TextField(
            value = enteredValue,
            onValueChange = { newText -> enteredValue = newText},
            label = { Text ( text =  "Name" )},
            placeholder = { Text(text = "Enter your name")},
            leadingIcon  =  { Icon (imageVector = Icons.Default.Email, contentDescription = "Email Icon") },

            isError =  isUserBelow18,

            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone =  {
                    isUserBelow18 = validateAge(inputText = enteredValue)
                }
            )

        )

        if (isUserBelow18) {
//            Text(text = "Input Text: $enteredValue")
            Text(
                text = "Hello, you are not upto 18, you should be 18 and above",
//                color = MaterialTheme.colors.error,
                color = Color(0xFFFF0000) ,
                modifier = Modifier.padding(start = 16.dp)
                )
        }
    }

}

private fun validateAge(inputText: String):Boolean{
    return inputText.toInt() < 18
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeJoshuaTheme {
        Greeting("Android")
    }
}