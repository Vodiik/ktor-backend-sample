package com.example.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.userRouting() {
    route("/user") {
        get {
            /*if (userStorage.isNotEmpty()) {
                call.respond(userStorage)
            } else {
                call.respondText("No customers found", status = HttpStatusCode.OK)
            }*/
        }
        get("{id?}") {

        }
        post {

        }
        delete("{id?}") {

        }
    }
}