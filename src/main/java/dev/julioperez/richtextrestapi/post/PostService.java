package dev.julioperez.richtextrestapi.post;

import java.util.List;

public interface PostService {

    Post createPost(Post post);

    Post getPostByNumberClass(int numberClass);

    List<Post> getAllPost();
}
