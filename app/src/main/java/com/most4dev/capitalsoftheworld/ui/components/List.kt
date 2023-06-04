package com.most4dev.capitalsoftheworld.ui.components

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.most4dev.capitalsoftheworld.models.Country
import androidx.compose.foundation.lazy.items

@Composable
fun CustomList(
    modifier: Modifier = Modifier,
    countries: List<Country>,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize().padding(vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(items = countries,
            key = { listItem ->
                listItem.name
            })
        { country ->
            CustomCard(
                country
            )
        }
    }
}