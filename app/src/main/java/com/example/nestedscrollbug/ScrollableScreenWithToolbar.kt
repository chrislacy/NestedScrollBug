package com.example.nestedscrollbug

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TallText(text: String) {
    Text(
        text = text,
        fontSize = 22.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .height(64.dp)
            .fillMaxWidth(1f),
    )
}

@OptIn(ExperimentalComposeUiApi::class)
@Preview(showBackground = true)
@Composable
fun ScrollableScreenWithToolbar() {
    Surface(
        shape = RoundedCornerShape(16.dp),
    ) {
        Row {
            Box(
                modifier = Modifier.fillMaxWidth()
                    .height(72.dp)
                    .background(Color.Green)
            )
        }

        LazyColumn(
            Modifier
                .padding(top = 72.dp)
                .nestedScroll(rememberNestedScrollInteropConnection()),
        ) {
            items(50) { index ->
                TallText(text = "Item: $index")
            }
        }
    }
}