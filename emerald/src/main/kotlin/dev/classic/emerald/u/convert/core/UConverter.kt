package dev.classic.emerald.u.convert.core

interface UConverter {

    fun convert(subject: ConvertSubject, settings: ConvertSettings) : ConvertResult

}