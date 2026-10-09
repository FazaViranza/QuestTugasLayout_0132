package com.example.tugasp4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TugasPrak3(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 50.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 15.sp
        )
        Card(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.grey1)
            )
        ) {
            Row (
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                val gambar = painterResource(R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(60.dp).padding(5.dp)
                )
                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .height(100.dp)
                ) {
                    Text(
                        text = stringResource(R.string.mhs1),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = colorResource(R.color.white),
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        text = stringResource(R.string.almt1),
                        fontSize = 20.sp,
                        color = colorResource(R.color.yellow),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(60.dp).padding(5.dp)
                )

            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.purple1)
            )
        ) {
            Row (
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                val gambar = painterResource(R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(60.dp).padding(5.dp)
                )
                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .height(130.dp)
                ) {
                    Text(
                        text = stringResource(R.string.mhs2),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(R.color.white),
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        text = stringResource(R.string.nohp),
                        fontSize = 20.sp,
                        color = colorResource(R.color.teal_200),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Text(
                        text = stringResource(R.string.almt2),
                        fontSize = 20.sp,
                        color = colorResource(R.color.yellow),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(60.dp).padding(5.dp)
                )

            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.blue1)
            )
        ) {
            Row (
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                val gambar = painterResource(R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(60.dp).padding(5.dp)
                )
                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .height(130.dp)
                ) {
                    Text(
                        text = stringResource(R.string.mhs3),
                        fontSize = 30.sp,
                        color = colorResource(R.color.white),
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        text = stringResource(R.string.nohp),
                        fontSize = 20.sp,
                        color = colorResource(R.color.teal_200),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Text(
                        text = stringResource(R.string.almt3),
                        fontSize = 20.sp,
                        color = colorResource(R.color.white),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(60.dp).padding(5.dp)
                )

            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.green1)
            )
        ) {
            Row (
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                val gambar = painterResource(R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(60.dp).padding(5.dp)
                )
                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .height(130.dp)
                ) {
                    Text(
                        text = stringResource(R.string.mhs4),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(R.color.white),
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        text = stringResource(R.string.nohp),
                        fontSize = 20.sp,
                        color = colorResource(R.color.teal_200),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Text(
                        text = stringResource(R.string.almt4),
                        fontSize = 20.sp,
                        color = colorResource(R.color.white),
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(60.dp).padding(5.dp)
                )

            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = stringResource(R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}