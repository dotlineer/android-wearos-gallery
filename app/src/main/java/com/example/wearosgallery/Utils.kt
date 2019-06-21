package com.example.wearosgallery

const val NUMBER_OF_PICTURES = 10

fun loadData(): IntArray {
    val photos = IntArray(NUMBER_OF_PICTURES)

    photos[0] = R.drawable.picture1
    photos[1] = R.drawable.picture2
    photos[2] = R.drawable.picture3
    photos[3] = R.drawable.picture4
    photos[4] = R.drawable.picture5
    photos[5] = R.drawable.picture6
    photos[6] = R.drawable.picture7
    photos[7] = R.drawable.picture8
    photos[8] = R.drawable.picture9
    photos[9] = R.drawable.picture10

    return photos
}

