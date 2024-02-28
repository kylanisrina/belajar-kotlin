class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Greeting("Kyla Nisrina")
                        Granat("2267051002")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hallo nama saya $name!",
        modifier = modifier

    )
}

@Composable
fun Granat(npm: String, modifier: Modifier = Modifier){
    Text(
        text = "NPM saya $npm",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinTheme {
        Column {
            Greeting("Kyla Nisrina")
            Granat("2267051002")
        }
    }
}
