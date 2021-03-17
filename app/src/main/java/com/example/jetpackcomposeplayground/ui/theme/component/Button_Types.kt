package com.example.jetpackcomposeplayground.ui.theme

import android.widget.Scroller
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeplayground.ui.theme.reusable_component.HeaderTitle
import java.util.*


@Preview
@Composable
fun ButtonTypes_lazy() {
    LazyColumn(contentPadding = PaddingValues(10.dp),modifier = Modifier.fillMaxSize(),content = {

        item {
            HeaderTitle(text = "Normal Button")
            Button(onClick = { }) {
                Text(text = "Normal button")
            }
            HeaderTitle(text = "Normal Button with full width")
            Button(modifier = Modifier.fillMaxWidth(), onClick = { }) {
                Text(text = "Full width Button")
            }

            HeaderTitle(text = "Outlined Button")
            OutlinedButton(onClick = { }) {
                Text(text = "Outlined Button")
            }


            HeaderTitle(text = "Rounded Button")
            Button(shape = RoundedCornerShape(15.dp), onClick = { /*TODO*/ }) {
                Text(text = "Rounded Button")
            }


            HeaderTitle(text = "Rounded edge at top start")
            Button(
                onClick = { }, shape = RoundedCornerShape(
                    topStartPercent = 30
                )
            ) {
                Text(text = "Top start Rounded")
            }
            HeaderTitle(text = "Cut Corner Button")
            Button(onClick = { }, shape = CutCornerShape(8.dp)) {
                Text(text = "Cut Corner Shape")
            }


            HeaderTitle(text = "Text Button")
            TextButton(onClick = { }) {
                Text(text = "Text Button")
            }


            HeaderTitle(text = "Outlined Button with Border stroke")
            OutlinedButton(
                onClick = { },
                border = BorderStroke(1.dp, brush = SolidColor(Color.Red))
            ) {
                Text(text = "Outlined button with border")
            }

            HeaderTitle(text = "Icon button")
            Button(onClick = { }) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(imageVector = Icons.Default.Delete, contentDescription = null)
                    Text(text = "Icon Button")
                }
            }


            val horizontalBrush = Brush.horizontalGradient(
                colors = listOf(
                    Color.Red, Color.Yellow, Color.Green
                )
            )

            val verticalBrush = Brush.verticalGradient(
                colors = listOf(
                    Color.Red, Color.Yellow, Color.Green
                )
            )

            HeaderTitle(text = "Horizontal gradient button")
            TextButton(onClick = { }, modifier = Modifier.background(brush = horizontalBrush)) {
                Text(text = "Horizontal Gradient")
            }


            HeaderTitle(text = "Vertical gradient button")
            TextButton(onClick = { }, modifier = Modifier.background(brush = verticalBrush)) {
                Text(text = "Vertical Gradient")
            }

            HeaderTitle(text = "Icon button")
            IconButton(onClick = { }) {
                VectorIcon(imageVector = Icons.Default.Favorite)
            }
            HeaderTitle(text = "Icon button with tint color")
            IconButton(onClick = { }) {
                VectorIcon(imageVector = Icons.Default.Favorite, tint = Color.Red)
            }

            HeaderTitle(text = "Floating action button")
            FloatingActionButton(onClick = { }, backgroundColor = Color.Green) {
                VectorIcon(imageVector = Icons.Default.Done)
            }


            HeaderTitle(text = "Floating action (Text + Icon)")
            ExtendedFloatingActionButton(
                icon = {
                    VectorIcon(imageVector = Icons.Default.ShoppingCart, tint = Color.DarkGray)

                },
                text = { Text("Add to cart", color = Color.Black) },
                backgroundColor = Color.Cyan,
                onClick = {},
            )
            HeaderTitle(text = "Floating action (Text)")
            ExtendedFloatingActionButton(
                text = { Text("Extended") },
                onClick = {}
            )
        }
    })
}