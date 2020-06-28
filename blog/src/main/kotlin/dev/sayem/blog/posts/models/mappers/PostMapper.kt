package dev.sayem.blog.posts.models.mappers

import dev.sayem.blog.posts.models.dtos.PostDto
import dev.sayem.blog.posts.models.entities.Post
import org.springframework.stereotype.Component

@Component
class PostMapper {

    fun map(entity: Post): PostDto {
        val dto = PostDto()

        dto.id = entity.id
        dto.title = entity.title
        dto.content = entity.content

        return dto
    }

}