package com.most4dev.capitalsoftheworld.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.most4dev.capitalsoftheworld.R
import com.most4dev.capitalsoftheworld.models.Country

@Composable
fun CustomCard(
    country: Country,
) {
    return Card(
        modifier = Modifier.fillMaxSize().padding(start = 8.dp, end = 8.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(modifier = Modifier.fillMaxSize()
            .height(IntrinsicSize.Min)) {
            Image(
                modifier = Modifier.size(128.dp).align(Alignment.CenterVertically),
                painter = rememberAsyncImagePainter(country.image),
                contentDescription = null
            )
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(stringResource(R.string.country) + country.name)
                Text(stringResource(R.string.capital) + country.capital)
                Text(stringResource(R.string.language) + country.language)
                Text(stringResource(R.string.currency) + country.currency)
            }
        }
    }
}