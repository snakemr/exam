import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

/*
    Классы данных для API описываются в файле DataModel.kt
    Интерфейс API описывается в файле API.kt
*/

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {
    val api = remember { Api.getApi() }
    // ваше решение здесь

}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Экзамен по программированию") {
        MaterialTheme {
            App()
        }
    }
}
