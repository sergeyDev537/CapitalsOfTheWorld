package com.most4dev.capitalsoftheworld.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.most4dev.capitalsoftheworld.R
import com.most4dev.capitalsoftheworld.ui.theme.CapitalsOfTheWorldTheme

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun DefaultTopBar() {
    return TopAppBar(
        title = { Text(stringResource(R.string.app_name)) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = colorScheme.primary,
            titleContentColor = Color.White
        )
    )
}
