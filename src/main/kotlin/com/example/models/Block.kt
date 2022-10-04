package com.example.models

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.litote.kmongo.Id

@Serializable
data class Block(
    @BsonId
    val id: Id<Block>? = null,
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

@Serializable
data class BlockChild(
    val x: Int,
    val y: Int,
    val width: Int,
    val height: Int,
    val block: Block
)