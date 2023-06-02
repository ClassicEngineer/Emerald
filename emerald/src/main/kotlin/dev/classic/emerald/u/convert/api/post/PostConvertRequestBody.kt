package dev.classic.emerald.u.convert.api.post

import org.springframework.web.multipart.MultipartFile

data class PostConvertRequestBody(val file: MultipartFile, val settings: UserConvertSettings) {


}