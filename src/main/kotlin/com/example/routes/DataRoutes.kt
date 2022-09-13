package com.example.routes

import com.example.models.*
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.listDataRoute() {
    get("/data") {
        if (dataStorage.isNotEmpty()) {
            call.respond(dataStorage)
        }
    }
}

fun Route.getDataRoute() {
    get("/data/{id?}") {
        val id = call.parameters["id"] ?: return@get call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
        val data = dataStorage.find { it.dataID == id } ?: return@get call.respondText(
            "Not Found",
            status = HttpStatusCode.NotFound
        )
        call.respond(data)
    }
}

/*
fun Route.totalizeDataRoute() {
    get("/data/{id?}/total") {
        val id = call.parameters["id"] ?: return@get call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
        val data = dataStorage.find { it.dataID == id } ?: return@get call.respondText(
            "Not Found",
            status = HttpStatusCode.NotFound
        )
        val total = data.contents.sumOf { it.price * it.amount }
        call.respond(total)
    }
}*/
