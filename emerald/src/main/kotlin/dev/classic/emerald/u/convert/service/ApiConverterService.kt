package dev.classic.emerald.u.convert.service

import dev.classic.emerald.u.convert.api.post.UserConvertSettings
import dev.classic.emerald.u.convert.core.highlevel.ConvertResult
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import reactor.core.publisher.Mono

@Service
class ApiConverterService(private val service: ConverterService) {

    fun convert(file: MultipartFile, settings: UserConvertSettings): Mono<ConvertResult>{
        return service.convert()
    }
}