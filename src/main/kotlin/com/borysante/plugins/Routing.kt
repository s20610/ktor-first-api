package com.borysante.plugins

import com.borysante.routes.customerRouting
import com.borysante.routes.orderRouting
import com.borysante.routes.totalizeOrderRoute
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        customerRouting()
        orderRouting()
        totalizeOrderRoute()
    }
}
