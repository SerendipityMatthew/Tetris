package me.xuwanjin.tetris.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun Tetris() {
    Canvas(
        modifier = Modifier
            .size(18.dp),
        onDraw = {
            drawRect(
                color = Color.Black,
                topLeft = Offset(0.dp.toPx(), 0.dp.toPx()),
                size = Size(height = 16.dp.toPx(), width = 16.dp.toPx()),
                style = Stroke(width = 2.dp.toPx())
            )
            drawRect(
                color = Color.Black,
                topLeft = Offset(3.dp.toPx(), 3.dp.toPx()),
                size = Size(height = 10.dp.toPx(), width = 10.dp.toPx()),
            )
        }
    )
}

@Composable
fun Wide4(isVertical: Boolean) {

    if (isVertical) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(1.dp),
            contentPadding = PaddingValues(top = 2.dp),
            modifier = Modifier.background(Color.White)
        ) {
            items(4) {
                Tetris()
            }
        }
    } else {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(1.dp),
            contentPadding = PaddingValues(start = 2.dp),
            modifier = Modifier.background(Color.White)
        ) {
            items(4) {
                Tetris()
            }
        }

    }
}

@Preview
@Composable
fun Square() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(1.dp),
        modifier = Modifier.background(Color.White)
    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(1.dp),
            contentPadding = PaddingValues(top = 2.dp),
            modifier = Modifier.background(Color.White)
        ) {
            items(2) {
                Tetris()
            }
        }
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(1.dp),
            contentPadding = PaddingValues(top = 2.dp),
            modifier = Modifier.background(Color.White)
        ) {
            items(2) {
                Tetris()
            }
        }

    }

}

@Preview
@Composable
fun PreviewSquare() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Square()
    }
}


@Preview
@Composable
fun PreviewTetris() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Tetris()
    }
}

@Preview
@Composable
fun PreviewWide4() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Wide4(true)
    }
}
