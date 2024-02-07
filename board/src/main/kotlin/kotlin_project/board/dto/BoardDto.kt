package kotlin_project.board.dto

import kotlin_project.board.entity.Board

class BoardDto {
    data class Post(
        val memberId : Long,
        val title : String,
        val content : String
    ) {
        fun toBoard() : Board = Board(
//            memberId = memberId,
            title = title,
            content = content
        )
    }

    data class Update(
        val title: String,
        val content: String
    ) {

    }

    data class Response(
        var boardId : Long,
//        val writer : String,
        var title : String,
        var content : String
    ) {
        constructor(board : Board) : this (
            boardId = board.boardId!!,
            title = board.title,
            content = board.content
        )
    }
}