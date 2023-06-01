package dev.classic.emerald.u.convert.api

import dev.classic.emerald.u.convert.api.post.PostConvertRequestBody
import dev.classic.emerald.u.convert.api.post.PostConvertResponseBody
import dev.classic.emerald.u.convert.service.ConverterService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class ConverterApiController(
    private val service: ConverterService) {

    @PostMapping("/convert")
    fun convert(@RequestBody body: PostConvertRequestBody) : Mono<PostConvertResponseBody>
    {
        return service.convert()
            .map(::toResponse)
    }

    private fun toResponse(any: Any?): PostConvertResponseBody? {
        TODO("Not yet implemented")
    }


}