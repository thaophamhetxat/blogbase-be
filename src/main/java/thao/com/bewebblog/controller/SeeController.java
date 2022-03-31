package thao.com.bewebblog.controller;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thao.com.bewebblog.model.PostCategory;
import thao.com.bewebblog.model.See;
import thao.com.bewebblog.service.impl.IPostCategoryService;
import thao.com.bewebblog.service.impl.ISeeService;

import java.util.Optional;

@Aspect
@RestController
@RequestMapping("/blog/sees")
@CrossOrigin("*")
public class SeeController {
    @Autowired
    ISeeService iSeeService;

    @PostMapping
    public ResponseEntity<See> add(@RequestBody See see) {
        return ResponseEntity.ok(iSeeService.saveSee(see));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(iSeeService.findAllSee());
    }

    @GetMapping("/{id}")
    public See getCategory(@PathVariable("id") int id) {
        return iSeeService.findByIdSee(id).get();
    }


    @PutMapping("/{id}")
    public ResponseEntity<See> updateCategory(@PathVariable int id, @RequestBody See see) {
        Optional productOptional = Optional.ofNullable(iSeeService.findByIdSee(id));
        if (!productOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(iSeeService.saveSee(see), HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") int id) {
        iSeeService.removeSee(id);
    }
}
