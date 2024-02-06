package kotlin_project.board.controller

import kotlin_project.board.dto.BoardDto
import kotlin_project.board.service.BoardService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class BoardController (
    private val boardService: BoardService
) {

    @PostMapping("/board")
    fun post (@RequestBody post: BoardDto.Post): Long?= boardService.post(post)

    @PutMapping("/board/{boardId}")
    fun update(@PathVariable boardId: Long, @RequestBody update: BoardDto.Update): Long?= boardService.update(boardId, update)

    @GetMapping("/board/{boardId}")
    fun find(@PathVariable boardId: Long): BoardDto.Response = boardService.find(boardId)
}