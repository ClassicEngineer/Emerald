package dev.classic.emerald.u.convert.api

import dev.classic.emerald.u.convert.core.highlevel.ConvertSettings
import java.io.File

data class ConvertRequest(val file: File, val settings: ConvertSettings)
