package com.example.basiccomposable.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccomposable.R

@Preview(showBackground = true)
@Composable
fun BasicComposable(ira: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login",
            modifier = ira,
            fontSize = 50.sp,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            text = "Ini adalah halaman Login",
            style = TextStyle(
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic
            )
        )

        Image(
            painter = painterResource(id = R.drawable.logoumy),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
                .padding(30.dp)
        )

        Text(
            text = "Nama: ",
            style = TextStyle(
                fontSize = 25.sp,
                fontStyle = FontStyle.Italic
            )
        )

        Text(
            text = "Ira Jesica Januari S",
            style = TextStyle(
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Magenta
            )
        )

        Text(
            text = "20220140050",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Image(
            painter = painterResource(id = R.drawable.iraa),
            contentDescription = null,
            modifier = Modifier.size(500.dp)
                .padding(20.dp).clip(RoundedCornerShape(200.dp))
        )
    }
}

