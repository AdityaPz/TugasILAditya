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
            name = "Just Rowan",
            nickname = "Rowan",
            role = "Aktor",
            photo = R.drawable.justrowan
        ),
        Mentor(
            id = 2,
            name = "Tom Holland",
            nickname = "Tom",
            role = "Aktor",
            photo = R.drawable.tomhollad
        ),
        Mentor(
            id = 3,
            name = "Jefri Nichol",
            nickname = "Nichol",
            role = "Aktor",
            photo = R.drawable.jefrinichol
        ),
        Mentor(
            id = 4,
            name = "Hwang In Yoep",
            nickname = "Hwang",
            role = "Aktor",
            photo = R.drawable.hwanginyeop
        ),
        Mentor(
            id = 5,
            name = "Iko Uwais",
            nickname = "uwais",
            role = "Aktor",
            photo = R.drawable.ikouwais
        ),
        Mentor(
            id = 6,
            name = "Harry Potter",
            nickname = "Potter",
            role = "Aktor",
            photo = R.drawable.harrypotter
        ),
        Mentor(
            id = 7,
            name = "Murphy",
            nickname = "Murphy",
            role = "Aktor",
            photo = R.drawable.murphy
        ),
        Mentor(
            id = 8,
            name = "Leonardoo",
            nickname = "Leonardo",
            role = "Aktor",
            photo = R.drawable.leonardo
        ),
        Mentor(
            id = 9,
            name = "Just Rowan",
            nickname = "Rowan",
            role = "Aktor",
            photo = R.drawable.justrowan
        ),
        Mentor(
            id = 10,
            name = "Aditya Putranto",
            nickname = "Adit",
            role = "Aktor",
            photo = R.drawable.founder
        )

    )

    val mobileMentees = listOf(
        Mentee(
            id = 1,
            name = "Just Rowan",
            photo = R.drawable.justrowan,
            batch = "Film",
            role = "Aktor",
        ),
        Mentee(
            id = 2,
            name = "Tom Holland",
            photo = R.drawable.tomhollad,
            batch = "Film",
            role = "Aktor",
        ),
        Mentee(
            id = 3,
            name = "Jefri Nichol" ,
            photo = R.drawable.jefrinichol,
            batch = "Film",
            role = "Aktor",
        ),
        Mentee(
            id = 4,
            name = "Hwang in Yeop",
            photo = R.drawable.hwanginyeop,
            batch = "Film",
            role = "Aktor",
        ),
        Mentee(
            id = 5,
            name = "Harry Potter",
            photo = R.drawable.harrypotter,
            batch = "Film",
            role = "Aktor",
        ),
        Mentee(
            id = 6,
            name = "Herjunot Ali",
            photo = R.drawable.herjunotali,
            batch = "Film",
            role = "Aktor",
        ),
        Mentee(
            id = 7,
            name = "Jacky Chan",
            photo = R.drawable.jackychan,
            batch = "Film",
            role = "Aktor",
        ),
        Mentee(
            id = 8,
            name = "Leonardo",
            photo = R.drawable.leonardo,
            batch = "Film",
            role = "Aktor",
        ),
        Mentee(
            id = 9,
            name = "Murphy",
            photo = R.drawable.murphy,
            batch = "Film",
            role = "Aktor",
        ),
        Mentee(
            id = 10,
            name = "Iko Uwais" ,
            photo = R.drawable.ikouwais,
            batch = "Film",
            role = "Aktor",
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
        ),
        Gallery(
            id = 7,
            name = "Pikachu",
            photo = R.drawable.pikachu
        ),
        Gallery(
            id = 8,
            name = "Avatar",
            photo = R.drawable.avatar
        ),
        Gallery(
            id = 9,
            name = "Wall",
            photo = R.drawable.wall
        ),
        Gallery(
            id = 10,
            name = "Ratatui",
            photo = R.drawable.ratatui
        )



    )
    val BiodataMentee = listOf(
        Biodata(
            id = 1,
            photo = R.drawable.ppadit,
            name = "Aditya Putranto",
            email = "adityaputranto.acp4@gmail.com",
            instansi = "Universitas 17 Agustus 1945 Surabaya",
            prodi = "Informatika"
        )
    )

}