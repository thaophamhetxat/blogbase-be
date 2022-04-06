package thao.com.bewebblog.controller;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thao.com.bewebblog.model.Post;
import thao.com.bewebblog.model.PostCategory;
import thao.com.bewebblog.service.impl.IPostService;

import java.util.Date;
import java.util.Optional;

@Aspect
@RestController
@RequestMapping("/blog/posts")
@CrossOrigin("*")
public class PostController {
    @Autowired
    IPostService iPostService;

    @PostMapping
    public ResponseEntity<Post> add(@RequestBody Post post) {
        return ResponseEntity.ok(iPostService.savePost(post));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(iPostService.findAllPost());
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable("id") int id) {
        return iPostService.findByIdPost(id).get();
    }


    @PutMapping("/{id}")
    public ResponseEntity<PostCategory> updatePost(@PathVariable int id, @RequestBody Post post) {
        Optional productOptional = Optional.ofNullable(iPostService.findByIdPost(id));
        if (!productOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity(iPostService.savePost(post), HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") int id) {
        iPostService.removePost(id);
    }
}
