package dev.classic.emerald.u.convert.subject

import dev.classic.emerald.u.convert.core.highlevel.ContentExtension
import dev.classic.emerald.u.convert.core.highlevel.ConvertSubject
import dev.classic.emerald.u.convert.core.constants.CoreExtension
import dev.classic.emerald.u.convert.core.constants.SupportedExtension
import java.io.File

class TextFileSubject(textFile: File) : ConvertSubject {
    override val from: ContentExtension
        get() = SupportedExtension.TXT
    override val to: ContentExtension
        get() = CoreExtension.U

}