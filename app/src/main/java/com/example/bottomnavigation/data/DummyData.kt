package com.example.bottomnavigation.data

import com.example.bottomnavigation.model.Mentor
import com.example.bottomnavigation.R
import com.example.bottomnavigation.model.Biodata
import com.example.bottomnavigation.model.Gallery
import com.example.bottomnavigation.model.Mentee

object DummyData {
    val mobileMentors = listOf(
        Mentor(
            id = 1,
            name = "Aditya Putranto",
            nickname = "Adit",
            role = "Technical Mobile",
            photo = R.drawable.founder
        ),
        Mentor(
            id = 2,
            name = "Aditya Putranto",
            nickname = "Adit",
            role = "Technical Mobile",
            photo = R.drawable.founder
        ),
        Mentor(
            id = 3,
            name = "Aditya Putranto",
            nickname = "Adit",
            role = "Technical Mobile",
            photo = R.drawable.founder
        )

    )

    val mobileMentees = listOf(
        Mentee(
            id = 1,
            name = "Nama Mentee",
            photo = R.drawable.no_profile,
            batch = "Batch 6",
            role = "Mentee Mobile",
        ),
        Mentee(
            id = 2,
            name = "Nama Mentee",
            photo = R.drawable.no_profile,
            batch = "Batch 6",
            role = "Mentee Mobile",
        ),
        Mentee(
            id = 3,
            name = "Nama Mentee",
            photo = R.drawable.no_profile,
            batch = "Batch 6",
            role = "Mentee Mobile",
        ),
    )
    val PhotoGalleries = listOf(
        Gallery(
            id = 1,
            name = "Toy Story",
            photo = R.drawable.toystory
        ),
        Gallery(
            id = 2,
            name = "up",
            photo = R.drawable.up
        ),
        Gallery(
            id = 3,
            name = "Se7en",
            photo = R.drawable.se7en
        ),
        Gallery(
            id = 4,
            name = "We Bare Bares",
            photo = R.drawable.webarebares
        ),
        Gallery(
            id = 5,
            name = "Ponyo",
            photo = R.drawable.ponyo
        ),
        Gallery(
            id = 6,
            name = "Coco",
            photo = R.drawable.coco
        )

    )
    val BiodataMentee = listOf(
        Biodata(
            id = 1,
            photo = R.drawable.founder,
            name = "Aditya Putranto",
            email = "adityaputranto.acp4@gmail.com",
            instansi = "Universitas 17 Agustus 1945 Surabaya",
            prodi = "Informatika"
        )
    )

}