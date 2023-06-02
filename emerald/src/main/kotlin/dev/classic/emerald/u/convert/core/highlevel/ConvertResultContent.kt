package dev.classic.emerald.u.convert.core.highlevel

import dev.classic.emerald.u.convert.core.ConvertContent

interface ConvertResultContent<T> {

    fun <T : ConvertContent> getContent() : T

    fun <T : ConvertContent> getByteContent() : ByteArray = getContent<ConvertContent>().content
}