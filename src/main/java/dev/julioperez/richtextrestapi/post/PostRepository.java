package dev.julioperez.richtextrestapi.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query(value = "SELECT * FROM POST", nativeQuery = true)
    List<Post> getAllPost();

    @Query(value = "SELECT * FROM POST WHERE id = :id", nativeQuery = true)
    Optional<Post> getPostByIdOptional(Long id);

    @Query(value = "EXEC createPost @Text = :text", nativeQuery = true)
    String savePost(@Param("text") String text);
}
