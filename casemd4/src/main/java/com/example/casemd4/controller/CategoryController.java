package com.example.casemd4.controller;

import com.example.casemd4.model.Category;
import com.example.casemd4.model.Movie;
import com.example.casemd4.service.CategoryService;
import com.example.casemd4.service.CommentService;
import com.example.casemd4.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    MovieService movieService;

    @Autowired
    CommentService commentService;

    @Autowired
    CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> category(){
        return new ResponseEntity(categoryService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Category> createCate(@RequestBody Category category){
        categoryService.save(category);
        return new ResponseEntity(category, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findByIdcate(@PathVariable int id){
        return new ResponseEntity(categoryService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCate(@PathVariable int id){
        categoryService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> editCate(@RequestBody Category category){
        categoryService.save(category);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @GetMapping("/search/{nameCategory}")
    public ResponseEntity<List<Category>> search(@PathVariable String nameCategory) {
        return new ResponseEntity(categoryService.findByName(nameCategory), HttpStatus.OK);
    }

}
