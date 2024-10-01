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
import android.widget.RadioGroup
import android.widget.Toast
import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
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
import androidx.compose.material3.RadioButton
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role
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

}

@Composable
fun MyRadio(){
    val clickRadio = LocalContext.current

    Row(verticalAlignment = Alignment.CenterVertically){
        RadioButton(
            selected = false,
            onClick = {
                Toast.makeText(
                    clickRadio,
                    "I am a Youth for Jesus",
                    Toast.LENGTH_LONG
                ).show()
            })
        Text(text = "Youth")
    }
}

@Composable
fun RadioGroup(){
    val ctx = LocalContext.current

    val optionsForRadio = listOf("Rice", "Beans", "Yam")

    var selectedItem by remember{
        mutableStateOf(optionsForRadio[0])
    }

    Column(modifier = Modifier.selectableGroup()) {

        optionsForRadio.forEach{ label ->
            Row( modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .selectable(
                    selected = (selectedItem == label),
                    onClick = { selectedItem == label },
                    role = Role.RadioButton
                )
                .padding(horizontal = 16.dp)
            ) {

                RadioButton(
                    modifier = Modifier.padding(end = 16.dp),
                    onClick = null,
                    selected = (selectedItem == label)
                )
                Text(text = label)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeJoshuaTheme {
//        MyRadio()
        RadioGroup()
    }
}