package kotlin_project.board.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var boardId : Long ?= null,

    @Column(length = 100, nullable = false)
    var title : String,

    @Column(columnDefinition = "TEXT", nullable = false)
    var content : String
) : BaseTime() {
}