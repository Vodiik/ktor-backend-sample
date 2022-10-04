package com.example.services

import com.example.models.Block
import org.bson.types.ObjectId
import org.litote.kmongo.*
import org.litote.kmongo.id.toId

class BlockService {
    private val client = KMongo.createClient()
    private val database = client.getDatabase("qubee")
    private val blockCollection = database.getCollection<Block>()

    fun create(block: Block): Id<Block>? {
        blockCollection.insertOne(block)
        return block.id
    }

    fun findAll(): List<Block> = blockCollection
        .find()
        .toList()

    fun findById(id: String): Block? {
        val bsonId: Id<Block> = ObjectId(id).toId()
        return blockCollection
            .findOne(Block::id eq bsonId)
    }

}


