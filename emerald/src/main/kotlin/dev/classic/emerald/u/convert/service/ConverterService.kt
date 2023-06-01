package dev.classic.emerald.u.convert.service

import dev.classic.emerald.u.convert.core.ConvertResult
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ConverterService {

    fun convert() : Mono<in ConvertResult>{
        return Mono.just()
    }
}