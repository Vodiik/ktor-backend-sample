package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Data(
    var dataID: String,
    var price: Int,
    var owner: String,
    var image: String
)

val dataStorage = listOf(
    Data(
        "0",
        1,
        "user1",
        "https://www.business2community.com/wp-content/uploads/2017/08/blank-profile-picture-973460_640.png"
    ),
    Data(
        "1",
        2,
        "user1",
        "https://www.business2community.com/wp-content/uploads/2017/08/blank-profile-picture-973460_640.png"
    ),
    Data(
        "2",
        3,
        "user2",
        "https://www.business2community.com/wp-content/uploads/2017/08/blank-profile-picture-973460_640.png"
    ),
    Data(
        "3",
        4,
        "user2",
        "https://www.business2community.com/wp-content/uploads/2017/08/blank-profile-picture-973460_640.png"
    ),
    Data(
        "4",
        4,
        "user1",
        "https://www.business2community.com/wp-content/uploads/2017/08/blank-profile-picture-973460_640.png"
    )
)