package dev.sayem.blog.posts.controllers

import dev.sayem.blog.posts.models.dtos.PostDto
import dev.sayem.blog.posts.models.entities.Post
import dev.sayem.blog.posts.models.mappers.PostMapper
import dev.sayem.blog.posts.repositories.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/blog/posts")
class PostContoller @Autowired constructor(
        private val postRepository: PostRepository,
        private val postMapper: PostMapper
) {

    @GetMapping("")
    fun index(): ResponseEntity<List<PostDto>> {
        val dtos = this.postRepository.findAll().map { this.postMapper.map(it) }
        return ResponseEntity.ok(dtos)
    }

    @GetMapping("/create")
    fun create(): ResponseEntity<PostDto> {
        var post = Post()
        post.title = "Title: ${System.currentTimeMillis()}"
        post.content = "Description: ${System.currentTimeMillis()}"
        post = this.postRepository.save(post)
        return ResponseEntity.ok(this.postMapper.map(post))
    }

}