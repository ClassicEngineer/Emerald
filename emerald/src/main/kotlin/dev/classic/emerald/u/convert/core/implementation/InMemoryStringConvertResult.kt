package dev.classic.emerald.u.convert.core.implementation

import dev.classic.emerald.u.convert.core.constants.ConvertFinalStatus
import dev.classic.emerald.u.convert.core.constants.SupportedExtension
import dev.classic.emerald.u.convert.core.highlevel.ContentExtension
import dev.classic.emerald.u.convert.core.highlevel.ConvertResult
import dev.classic.emerald.u.convert.core.highlevel.ConvertResultContent

class InMemoryStringConvertResult(override val status: ConvertFinalStatus,
                                  override val content: ConvertResultContent<String>
) : ConvertResult {
    override val from: ContentExtension
        get() = TODO("Not yet implemented")
    override val to: ContentExtension
        get() = SupportedExtension.UTF8_STRING
}