package com.pawga.oauthdemo01.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by sivannikov on 26.04.2023 20:31
 */

@RestController
class HomeController {

    @GetMapping("/public")
    fun publicResource(): String {
        return "public Resource "
    }

    @GetMapping("/protected")
    fun protectedResource(): String {
        return "protected Resource "
    }
}
