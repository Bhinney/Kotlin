package kotlin_project.board.service

import kotlin_project.board.dto.BoardDto
import kotlin_project.board.repository.BoardRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BoardService (
    private val boardRepository: BoardRepository
){
    /* 게시글 등록 */
    @Transactional
    fun post(post: BoardDto.Post) : Long? = boardRepository.save(post.toBoard()).boardId

    /* 게시글 수정 */
    @Transactional
    fun update(id: Long, update: BoardDto.Update) : Long? {
        val board = boardRepository.findByIdOrNull(id) ?:
        throw IllegalArgumentException("id = $id, 해당하는 글이 존재하지 않습니다.")

        board.title = update.title
        board.content = update.content

        return id
    }

    /* 게시글 찾기 */
    @Transactional
    fun find(id: Long) : BoardDto.Response {
        val board = boardRepository.findByIdOrNull(id) ?:
        throw IllegalArgumentException("id = $id, 해당하는 글이 존재하지 않습니다.")
        return BoardDto.Response(board)
    }
}