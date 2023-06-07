package dev.classic.emerald.note.api.get

import dev.classic.emerald.note.core.NoteService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


@RestController("/emerald/api")
class GetNoteApiController(private val noteService: NoteService) {



    @GetMapping("note")
    fun getNoteById(@PathVariable id: Long) : Mono<GetPlainNoteResponseBody> {
        return noteService.getNoteById(id)
    }

}