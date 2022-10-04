package com.example.routes

import com.example.exceptions.ErrorResponse
import com.example.models.*
import com.example.services.BlockService
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

val service = BlockService()

fun Route.getBlockListRoute() {
    get("/block") {
        val blockList = service
            .findAll()
            .map(Block::toDto)
        call.respond(blockList)
    }
}

fun Route.getBlockByIdRoute() {
    get("/id/{id}") {
        val id = call.parameters["id"].toString()
        service.findById(id)
            ?.let { foundBlock -> call.respond(foundBlock.toDto()) }
            ?: call.respond(HttpStatusCode.NotFound, ErrorResponse.NOT_FOUND_RESPONSE)
    }
}

fun Route.postBlockRoute() {
    post("/block") {
        val request = call.receive<BlockDto>()
        val block = request.toBlock()
        service.create(block)
            ?.let { userId ->
                call.response.headers.append("My-User-Id-Header", userId.toString())
                call.respond(HttpStatusCode.Created)
            } ?: call.respond(HttpStatusCode.BadRequest, ErrorResponse.BAD_REQUEST_RESPONSE)
    }
}
