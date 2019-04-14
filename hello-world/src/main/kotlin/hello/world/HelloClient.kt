package hello.world

import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("hello")
interface HelloClient {

    @Get("/")
    fun index(): HttpStatus
}
