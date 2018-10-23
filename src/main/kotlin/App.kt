import io.ktor.application.*
import io.ktor.features.DefaultHeaders
import io.ktor.response.respond
import io.ktor.routing.*
import repositories.PersonRepo

fun Application.main() {
    install(DefaultHeaders)
    routing {
        get("/persons") {
            call.respond(PersonRepo().getAll())
        }
    }
}