package hello.world

import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloController {

    @Get("/")
    fun index(): HttpStatus = HttpStatus.OK
}
