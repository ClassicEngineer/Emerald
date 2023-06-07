package dev.classic.emerald.u.convert.api

import dev.classic.emerald.u.convert.api.post.PostConvertRequestBody
import dev.classic.emerald.u.convert.api.post.PostConvertResponseBody
import dev.classic.emerald.u.convert.service.ApiConverterService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class ConverterApiController(
    private val service: ApiConverterService,
    private val processor: ConvertResultProcessor) {

    @PostMapping("/convert")
    fun convert(@RequestBody body: PostConvertRequestBody) : Mono<PostConvertResponseBody>
    {
       return service.convert(body.file, body.settings)
            .map(processor::process)
    }


}