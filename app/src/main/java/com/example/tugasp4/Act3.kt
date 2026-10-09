
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasPrak3(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 50.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
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

        // Mahasiswa 1
        KartuMahasiswa(
            nama = stringResource(R.string.mhs1),
            alamat = stringResource(R.string.almt1),
            warna = colorResource(R.color.grey1),
            tinggiKolom = 100.dp,
            fontNama = FontFamily.Cursive,
            warnaAlamat = colorResource(R.color.yellow)
        )

        // Mahasiswa 2
        KartuMahasiswa(
            nama = stringResource(R.string.mhs2),
            nomor = stringResource(R.string.nohp),
            alamat = stringResource(R.string.almt2),
            warna = colorResource(R.color.purple1),
            tinggiKolom = 130.dp,
            tebalNama = FontWeight.Bold,
            warnaNomor = colorResource(R.color.teal_200),
            warnaAlamat = colorResource(R.color.yellow)
        )

        // Mahasiswa 3
        KartuMahasiswa(
            nama = stringResource(R.string.mhs3),
            nomor = stringResource(R.string.nohp),
            alamat = stringResource(R.string.almt3),
            warna = colorResource(R.color.blue1),
            tinggiKolom = 130.dp,
            warnaNomor = colorResource(R.color.teal_200),
            warnaAlamat = colorResource(R.color.white)
        )

        // Mahasiswa 4
        KartuMahasiswa(
            nama = stringResource(R.string.mhs4),
            nomor = stringResource(R.string.nohp),
            alamat = stringResource(R.string.almt4),
            warna = colorResource(R.color.green1),
            tinggiKolom = 130.dp,
            tebalNama = FontWeight.Bold,
            warnaNomor = colorResource(R.color.teal_200),
            warnaAlamat = colorResource(R.color.white)
        )

        // Copyright
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ) {
            Text(
                text = stringResource(R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 1.dp)
            )
        }
    }
}


@Composable
fun KartuMahasiswa(
    nama: String,
    alamat: String,
    warna: Color,
    tinggiKolom: Dp,
    nomor: String? = null,
    fontNama: FontFamily = FontFamily.Default,
    tebalNama: FontWeight = FontWeight.Normal,
    warnaNomor: Color = colorResource(R.color.white),
    warnaAlamat: Color = colorResource(R.color.white)
) {
    Card(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(horizontal = 12.dp, vertical = 4.dp),
        colors = CardDefaults.cardColors(
            containerColor = warna
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val gambar = painterResource(R.drawable.logo_umy)

            // Logo kiri
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .padding(5.dp)
            )

            // Informasi mahasiswa
            Column(
                modifier = Modifier
                    .width(200.dp)
                    .height(tinggiKolom)
            ) {
                Text(
                    text = nama,
                    fontSize = 30.sp,
                    fontFamily = fontNama,
                    fontWeight = tebalNama,
                    color = colorResource(R.color.white),
                    modifier = Modifier.padding(top = 15.dp)
                )

                if (nomor != null) {
                    Text(
                        text = nomor,
                        fontSize = 20.sp,
                        color = warnaNomor,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }

                Text(
                    text = alamat,
                    fontSize = 20.sp,
                    color = warnaAlamat,
                    modifier = Modifier.padding(top = 10.dp)
                )
            }

            // Logo kanan
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .padding(5.dp)
            )
        }
    }
}