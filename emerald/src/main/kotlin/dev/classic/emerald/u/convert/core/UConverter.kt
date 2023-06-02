package dev.classic.emerald.u.convert.core

import dev.classic.emerald.u.convert.core.highlevel.ConvertResult
import dev.classic.emerald.u.convert.core.highlevel.ConvertSettings
import dev.classic.emerald.u.convert.core.highlevel.ConvertSubject

interface UConverter {

    fun convert(subject: ConvertSubject, settings: ConvertSettings) : ConvertResult

}