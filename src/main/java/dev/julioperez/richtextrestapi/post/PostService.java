package dev.julioperez.richtextrestapi.post;

import java.util.List;

public interface PostService {

    Post createPost(Post post);

    List<Post> getAllPost();
}
