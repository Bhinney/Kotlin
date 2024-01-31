package kotlin_project.board.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var memberId : Long,

    @Column(nullable = false)
    var name : String,

    @Column(nullable = false)
    var email : String,

    @Column(nullable = false)
    var password : String
) {
}