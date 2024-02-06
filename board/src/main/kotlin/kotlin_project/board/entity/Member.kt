package kotlin_project.board.entity

import javax.persistence.*

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
    var password : String,

    @Enumerated(EnumType.STRING)
    var role: Role
) {
}

enum class Role{
    USER, ADMIN
}