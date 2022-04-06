package thao.com.bewebblog.controller;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thao.com.bewebblog.model.PostCategory;
import thao.com.bewebblog.service.impl.IPostCategoryService;

import java.util.Optional;

@Aspect
@RestController
@RequestMapping("/blog/categories")
@CrossOrigin("*")
public class PostCategoryController {
    @Autowired
    IPostCategoryService iPostCategoryService;

    @PostMapping
    public ResponseEntity<PostCategory> add(@RequestBody PostCategory postCategory) {
        return ResponseEntity.ok(iPostCategoryService.savePostCategory(postCategory));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(iPostCategoryService.findAllPostCategory());
    }

    @GetMapping("/{id}")
    public PostCategory getCategory(@PathVariable("id") int id) {
        return iPostCategoryService.findByIdPostCategory(id).get();
    }


    @PutMapping("/{id}")
    public ResponseEntity<PostCategory> updateCategory(@PathVariable int id, @RequestBody PostCategory postCategory) {
        Optional productOptional = Optional.ofNullable(iPostCategoryService.findByIdPostCategory(id));
        if (!productOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(iPostCategoryService.savePostCategory(postCategory), HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") int id) {
        iPostCategoryService.removePostCategory(id);
    }
}
