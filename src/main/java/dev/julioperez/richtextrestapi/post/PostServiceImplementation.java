package dev.julioperez.richtextrestapi.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostServiceImplementation implements PostService{

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImplementation(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public String createPost(Post post) {
        if(post.getText().contains("<br>")){
            return "formato no permitido, no se permite espacios verticales en el texto";
        }
        return Optional.of(postRepository.savePost(post.getText())).orElse("No se guardó");
    }
}
