package dev.classic.emerald.u.convert.core

import dev.classic.emerald.u.file.UFile
import dev.classic.emerald.u.convert.core.constants.ConvertFinalStatus
import dev.classic.emerald.u.convert.core.constants.CoreExtension
import dev.classic.emerald.u.convert.core.highlevel.ContentExtension
import dev.classic.emerald.u.convert.core.highlevel.ConvertResult
import dev.classic.emerald.u.convert.core.highlevel.ConvertResultContent

class UConvertResult(
    override val status: ConvertFinalStatus,
    override val content: ConvertResultContent<UFile>) : ConvertResult {
    override val from: ContentExtension
        get() = TODO("Not yet implemented")
    override val to: ContentExtension
        get() = CoreExtension.U


}