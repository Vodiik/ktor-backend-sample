package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class BlockDto(
    val id: String? = null,
    val uid: String,
    val parentUid: String,
    val width: Int,
    val height: Int,
    val imageUri: String?,
    val owner: String?,
    val price: String?,
    val label: String?,
    val children: MutableList<BlockChild>?
)