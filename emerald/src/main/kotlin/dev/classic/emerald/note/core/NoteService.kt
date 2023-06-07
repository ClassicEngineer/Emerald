package dev.classic.emerald.note.core

import dev.classic.emerald.note.api.get.GetPlainNoteResponseBody

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.concurrent.CompletableFuture

@Service
class NoteService {

    // TODO: correct future with mono and kotlin
    fun getNoteById(id: Long) : Mono<GetPlainNoteResponseBody> {
        val future = CompletableFuture<>()
        return Mono.fromCallable(future)
    }

}