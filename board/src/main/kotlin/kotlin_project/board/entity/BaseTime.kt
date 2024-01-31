package kotlin_project.board.entity

import java.time.LocalDateTime

open class BaseTime(
    var createdAt : LocalDateTime,
    var modifiedAt : LocalDateTime
) {
}