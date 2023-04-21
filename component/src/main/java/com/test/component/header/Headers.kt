package com.test.component.header

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.component.container.ComponentContainer

@Composable
fun HeaderBarType1(text : String) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Text(text = text, modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "끝끝", modifier = Modifier.align(Alignment.CenterEnd))
    }
}



@Preview
@Composable
fun Test() {
    ComponentContainer(header = {HeaderBarType1(text = "Test")}) {
        Text(text = "흠...", modifier = it.fillMaxSize(), textAlign = TextAlign.Center)
    }
}

@Preview
@Composable
fun Test1() {
    Text(text = "dodododododododo", modifier = Modifier
        .height(40.dp)
        .fillMaxWidth())
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ComponentContainer111(
) {
    Scaffold(Modifier.fillMaxSize(), topBar = {
        HeaderBarType1(text = "dododo")
    }) { padding ->
        Box(modifier = Modifier.fillMaxSize().padding(padding)) {
            Text(text = "dodododododododo", modifier = Modifier
                .align(Alignment.Center),
                textAlign = TextAlign.Center

            )
        }
    }
}