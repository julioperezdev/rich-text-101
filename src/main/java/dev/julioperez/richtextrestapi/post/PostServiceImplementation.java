package dev.julioperez.richtextrestapi.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImplementation implements PostService{

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImplementation(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post createPost(Post post) {
        return Optional.of(postRepository.savePost(
                post.getTitle(),
                post.getNumberClass(),
                post.getText())).orElseThrow(IllegalStateException::new);
    }

    @Override
    public List<Post> getAllPost() {
        return postRepository.getAllPost();
    }
}
