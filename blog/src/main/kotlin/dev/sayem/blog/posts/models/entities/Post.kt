package dev.sayem.blog.posts.models.entities

import javax.persistence.*

@Entity
@Table(name = "posts")
class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    lateinit var title: String
    lateinit var content: String
}