package com.example.models

import kotlinx.serialization.Serializable

private const val BASE_URL = "http://192.168.0.190:8080"

@Serializable
data class Data(
    var dataID: String,
    var price: Int,
    var owner: String,
    var imageUrl: String
)

val dataStorage = listOf(
    Data(
        "1",
        1,
        "user1",
        "$BASE_URL/images/test1.jpg"
    ),
    Data(
        "2",
        2,
        "user1",
        "$BASE_URL/images/test1.jpg"
    ),
    Data(
        "3",
        3,
        "user2",
        "$BASE_URL/images/test1.jpg"
    ),
    Data(
        "4",
        4,
        "user2",
        "$BASE_URL/images/test2.jpeg"
    ),
    Data(
        "5",
        1,
        "user1",
        "$BASE_URL/images/test1.jpg"
    ),
    Data(
        "6",
        2,
        "user1",
        "$BASE_URL/images/test1.jpg"
    ),
    Data(
        "7",
        3,
        "user2",
        "$BASE_URL/images/test1.jpg"
    ),
    Data(
        "8",
        4,
        "user2",
        "$BASE_URL/images/test2.jpeg"
    )

)