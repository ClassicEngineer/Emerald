package dev.classic.emerald.u.convert.core.highlevel

import dev.classic.emerald.u.convert.core.constants.ConvertFinalStatus

interface ConvertResult : ConvertEntity {

    val status: ConvertFinalStatus

    val content: ConvertResultContent<*>

}