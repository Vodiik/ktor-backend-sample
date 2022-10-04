package com.example.exceptions

import kotlinx.serialization.Serializable

@Serializable
data class ErrorResponse(val message: String) {
    companion object {
        val NOT_FOUND_RESPONSE = ErrorResponse("Block was not found")
        val BAD_REQUEST_RESPONSE = ErrorResponse("Invalid request")
    }
}
