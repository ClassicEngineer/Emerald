package dev.classic.emerald.u.convert.api

import dev.classic.emerald.u.convert.api.post.PostConvertResponseBody
import dev.classic.emerald.u.convert.core.ConvertContent
import dev.classic.emerald.u.convert.core.highlevel.ConvertResult
import org.springframework.stereotype.Component

@Component
class ConvertResultProcessor {


    fun <T : ConvertResult> process(result: T) : PostConvertResponseBody
    {
        return toResponse(result)
    }

    fun toResponse(result: ConvertResult): PostConvertResponseBody {
        return PostConvertResponseBody(result.content.getByteContent<ConvertContent>(), result.status)
    }


}