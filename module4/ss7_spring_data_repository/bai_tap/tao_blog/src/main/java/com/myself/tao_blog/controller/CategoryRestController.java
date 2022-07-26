package com.myself.tao_blog.controller;

import com.myself.tao_blog.model.Blog;
import com.myself.tao_blog.model.Category;
import com.myself.tao_blog.service.IBlogService;
import com.myself.tao_blog.service.ICatrgoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/category-rest")
public class CategoryRestController {
    @Autowired
    private ICatrgoryService iCatrgoryService;
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/list")
    public ResponseEntity<List<Category>> getAllCategory(){
        List<Category> categoryList = iCatrgoryService.findAllCategory();
        if (categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(categoryList,HttpStatus.OK);
    }

}
