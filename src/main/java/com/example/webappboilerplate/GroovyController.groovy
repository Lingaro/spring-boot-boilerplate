
package com.example.webappboilerplate

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GroovyController {
    @RequestMapping("/groovy")
    def groovy() {
        "OK"
    }
}