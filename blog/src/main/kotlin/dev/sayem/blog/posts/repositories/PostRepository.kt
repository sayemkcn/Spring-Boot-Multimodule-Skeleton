package dev.sayem.blog.posts.repositories

import dev.sayem.blog.posts.models.entities.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : JpaRepository<Post, Long> {
}