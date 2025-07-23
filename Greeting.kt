package eu.tutorial.gittutorials

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import eu.tutorial.gittutorials.ui.theme.GitTutorialsTheme

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GitTutorialsTheme {
        Greeting("Android")
    }
}