package eu.tutorial.gittutorials

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import eu.tutorial.gittutorials.ui.theme.GitTutorialsTheme

@Composable
fun Greeting(name: String, name2: String, name3: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    Text(
        text = "Vinsmoke $name2",
        modifier = modifier
    )
    Text(
        text = "Tony Tony $name3",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GitTutorialsTheme {
        Greeting("Zoro","Sanji","Chopper")
    }
}