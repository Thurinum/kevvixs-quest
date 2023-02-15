import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.thurinum.kevvixsquest.AppRoot

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        AppRoot()
    }
}
