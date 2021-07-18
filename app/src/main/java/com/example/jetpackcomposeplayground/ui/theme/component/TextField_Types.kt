package com.example.jetpackcomposeplayground.ui.theme.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeplayground.ui.theme.Purple200
import com.example.jetpackcomposeplayground.ui.theme.Purple500
import com.example.jetpackcomposeplayground.ui.theme.Purple700
import com.example.jetpackcomposeplayground.ui.theme.VectorIcon
import com.example.jetpackcomposeplayground.ui.theme.reusable_component.HeaderTitle


@Preview
@Composable
fun TextFieldTypes() {
    val (text, setText) = remember { mutableStateOf("") }
    val onValueChange: (String) -> Unit = { setText(it) }
    val inputModifier = Modifier.fillMaxWidth()

    val inputTextStyle = TextStyle(color = Color.Black, fontSize = 20.sp)
    LazyColumn(contentPadding = PaddingValues(10.dp), modifier = Modifier.fillMaxSize(), content = {
        item {
            HeaderTitle(text = "Basic TextField")
            TextField(
                value = text,
                modifier = inputModifier,
                textStyle = inputTextStyle,
                onValueChange = {
                    onValueChange(it)
                }
            )
        }
        item {
            HeaderTitle(text = "Outline TextField")
            OutlinedTextField(
                value = text,
                modifier = inputModifier,
                textStyle = inputTextStyle,
                onValueChange = {
                    onValueChange(it)
                }
            )
        }
        item {
            HeaderTitle(text = "Outline TextField with single line")
            OutlinedTextField(
                value = text,
                modifier = inputModifier,
                textStyle = inputTextStyle,
                onValueChange = {
                    onValueChange(it)
                },
                singleLine = true
            )
        }
        item {
            HeaderTitle(text = "Password TextField")
            var showPassword by remember { mutableStateOf(false) }
            OutlinedTextField(
                value = text,
                modifier = inputModifier,
                textStyle = inputTextStyle,
                onValueChange = {
                    onValueChange(it)
                },
                visualTransformation = if (showPassword) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                }, trailingIcon = {
                    if (showPassword) {
                        IconButton(onClick = { showPassword = false }) {
                            VectorIcon(imageVector = Icons.Filled.Visibility)
                        }
                    } else {
                        IconButton(onClick = { showPassword = true }) {
                            VectorIcon(imageVector = Icons.Filled.VisibilityOff)
                        }
                    }
                }
            )
        }
        item {
            HeaderTitle(text = "Underline TextField")
            TextField(
                value = text,
                modifier = inputModifier,
                onValueChange = {
                    onValueChange(it)
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                ),
                textStyle = inputTextStyle
            )


        }
        item {
            HeaderTitle(text = "TextField with no underline")
            TextField(
                value = text,
                onValueChange = {
                    onValueChange(it)
                },
                modifier = inputModifier,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Purple200,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                textStyle = inputTextStyle
            )
        }
        item {
            HeaderTitle(text = "Border TextField")
            TextField(
                value = text,
                onValueChange = {
                    onValueChange(it)
                },
                modifier = inputModifier.border(BorderStroke(width = 2.dp, color = Purple500)),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                textStyle = inputTextStyle
            )

        }

        item {
            HeaderTitle(text = "Border TextField with background")
            TextField(
                value = text,
                onValueChange = {
                    onValueChange(it)
                },
                modifier = inputModifier.border(BorderStroke(width = 2.dp, color = Purple500)),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Purple200.copy(alpha = 0.5f),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                textStyle = inputTextStyle
            )

        }
        item {
            HeaderTitle(text = "Border TextField with gradient background")
            TextField(
                value = text,
                onValueChange = {
                    onValueChange(it)
                },
                modifier = inputModifier
                    .border(
                        BorderStroke(
                            width = 2.dp,
                            color = Purple500
                        )
                    )
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(Purple200, Purple700)
                        )
                    ),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Purple200.copy(alpha = 0.5f),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                textStyle = inputTextStyle
            )
        }
        item {
            HeaderTitle(text = "Rounded TextField")
            TextField(
                value = text,
                onValueChange = {
                    onValueChange(it)
                },
                modifier = inputModifier.border(
                    BorderStroke(width = 2.dp, color = Purple500),
                    shape = RoundedCornerShape(50)
                ),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                textStyle = inputTextStyle
            )

        }

        item {
            HeaderTitle(text = "Rounded TextField with Gradient Border")
            TextField(
                value = text,
                onValueChange = {
                    onValueChange(it)
                },
                modifier = inputModifier.border(
                    BorderStroke(
                        width = 4.dp,
                        brush = Brush.horizontalGradient(listOf(Purple200, Purple500))
                    ),
                    shape = RoundedCornerShape(50)
                ),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                textStyle = inputTextStyle
            )
        }
        item {
            HeaderTitle(text = "Trailing icon TextField with Gradient Border")
            TextField(
                value = text,
                onValueChange = {
                    onValueChange(it)
                },
                trailingIcon = {
                    VectorIcon(imageVector = Icons.Default.Clear)
                },
                modifier = inputModifier.border(
                    BorderStroke(
                        width = 4.dp,
                        brush = Brush.horizontalGradient(listOf(Purple200, Purple500))
                    ),
                    shape = RoundedCornerShape(50)
                ),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                textStyle = inputTextStyle
            )
        }


        item {
            HeaderTitle(text = "Leading icon TextField with Gradient Border")
            TextField(
                value = text,
                onValueChange = {
                    onValueChange(it)
                },
                leadingIcon = {
                    VectorIcon(imageVector = Icons.Default.Email)
                },
                modifier = inputModifier.border(
                    BorderStroke(
                        width = 4.dp,
                        brush = Brush.horizontalGradient(listOf(Purple200, Purple500))
                    ),
                    shape = RoundedCornerShape(50)
                ),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                textStyle = inputTextStyle
            )
        }
        item {
            HeaderTitle(text = "CutCornerShape TextField")
            TextField(
                value = text,
                onValueChange = {
                    onValueChange(it)
                },
                modifier = inputModifier.border(
                    BorderStroke(
                        width = 4.dp,
                        brush = Brush.horizontalGradient(listOf(Purple200, Purple500))
                    ),
                    shape = CutCornerShape(10)
                ),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                textStyle = inputTextStyle
            )
        }
    })
}


