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
import android.widget.ProgressBar
import android.widget.RadioGroup
import android.widget.Toast
import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


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

                    var osList = listOf("Android", "IOS", "Windows", "Linux", "Parrot",  "Android", "iOS", "Windows",
                        "Linux", "iOS", "Windows",
                        "Linux", "iOS", "Windows",
                        "Linux", "iOS", "Windows", "Linux",
                        "iOS", "Windows", "Linux",
                        "iOS", "Windows",
                        "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS",)
                    PopulateItems(osList)

                }
            }
        }
    }
}

@Composable
fun PopulateItems(osList: List<String>) {
//    Column() {
//        osList.forEach{
//            CreateRowItem(osNmae = it)
//        }
//    }

    LazyColumn(){
        item {
            Text(text = "Joshua first item")
        }

        items(8){ index ->
            Text(text = "item: $index")
        }

        items(osList){
            Text(text = "Name of OS: $it")
        }
    }
}

@Composable
fun CreateRowItem(osNmae: String) {
    Row() {
        Text(text = osNmae, fontSize = 32.sp)
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeJoshuaTheme {
        // Sample list of operating systems for preview
        val osList = listOf(
            "Android", "iOS", "Windows",
            "Linux", "iOS", "Windows",
            "Linux", "iOS", "Windows",
            "Linux", "iOS", "Windows", "Linux",
            "iOS", "Windows", "Linux",
            "iOS", "Windows",
            "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux", "iOS", "Windows", "Linux")

        ComposeJoshuaTheme {
            PopulateItems(osList = osList)
        }
    }
}