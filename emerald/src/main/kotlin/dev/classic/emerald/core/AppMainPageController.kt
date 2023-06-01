package dev.classic.emerald.core

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class AppMainPageController {


    @GetMapping("/emerald")
    fun emerald(): Mono<String> = Mono.just("Hello, emerald collector")
}