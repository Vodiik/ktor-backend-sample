package com.example.plugins

import com.example.exceptions.ErrorResponse
import com.example.models.BlockDto
import com.example.models.toBlock
import com.example.routes.*
import com.example.services.BlockService
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respondText("Backend is up!!")
        }
    }
    routing {
        getBlockListRoute()
        getBlockByIdRoute()
        postBlockRoute()
    }
}
