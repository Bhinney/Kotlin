package kotlin_project.board

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping("/api/hello")
    fun Hello(): String {
        return "HELLO WORLD!"
    }
}