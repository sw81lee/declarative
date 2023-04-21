package com.test.component.container

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

typealias ComposableType = @Composable () -> Unit
typealias ComposableTypeWithModifier = @Composable (Modifier) -> Unit

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComponentContainer(
    header: ComposableType = {},
    bottomBar: ComposableType = {},
    body: ComposableTypeWithModifier
) {
    Scaffold(Modifier.fillMaxSize(), topBar = header, bottomBar = bottomBar) { padding ->
        body(
            Modifier
                .fillMaxSize()
                .padding(padding)
        )
    }
}


