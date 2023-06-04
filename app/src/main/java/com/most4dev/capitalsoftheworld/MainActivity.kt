package com.most4dev.capitalsoftheworld

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.most4dev.capitalsoftheworld.models.Country
import com.most4dev.capitalsoftheworld.ui.components.CustomList
import com.most4dev.capitalsoftheworld.ui.components.DefaultTopBar
import com.most4dev.capitalsoftheworld.ui.theme.CapitalsOfTheWorldTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CapitalsOfTheWorldTheme{
                Scaffold(
                    topBar = {
                        DefaultTopBar()
                    }) {paddingValues ->
                    CustomList(
                        modifier = Modifier.padding(top = paddingValues.calculateTopPadding()),
                        countries = listOf(
                            Country("Name", "Image 1", "Capital", "lang", "cur")
                        )
                    )

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    CapitalsOfTheWorldTheme{
        Scaffold(
            topBar = {
                DefaultTopBar()
            }) {paddingValues ->
            CustomList(
                modifier = Modifier.padding(top = paddingValues.calculateTopPadding()),
                countries = listOf(
                    Country("Name123456", "Image 1", "Capital", "lang", "cur"),
                    Country("Name12346", "Image ", "Capital", "lang", "cur")
                )
            )

        }
    }
}