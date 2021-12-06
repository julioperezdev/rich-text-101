package dev.julioperez.richtextrestapi.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }


    @GetMapping("/getall")
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }

    @GetMapping("/getby/class/{numberClass}")
    public Post getPostByNumberClass(@PathVariable("numberClass") int numberClass){
        return postService.getPostByNumberClass(numberClass);
    }

    @PutMapping("/generate")
    public Post createPost(@RequestBody Post post){
        Post generationResponse = postService.createPost(post);
        return generationResponse;
    }
}
