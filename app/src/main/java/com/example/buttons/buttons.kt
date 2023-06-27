package com.example.buttons

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun ButtonLayout() {

    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        Column() {


            Button(
                onClick = {
                    Toast.makeText(context, "Simple Button", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 0.dp
                ),
                shape = CutCornerShape(20.dp),
                //shape = RectangleShape
                //shape = CircleShape
                border = BorderStroke(5.dp, Color.Red),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                ),
                contentPadding = PaddingValues(
                    vertical = 15.dp
                )
            ) {
                Text(text = "Simple Button")
            }

            OutlinedButton(onClick = { }) {
                Text(text = "Outlined Button")
            }

            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Text Button")

            }
        }
    }
}