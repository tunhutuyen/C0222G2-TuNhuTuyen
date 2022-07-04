package com.myself.tao_blog.controller;

import com.myself.tao_blog.model.Blog;
import com.myself.tao_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/blog-rest")
public class BlogRestController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/list")
    public ResponseEntity<List<Blog>> getListBlog(){
        List<Blog> blogList = iBlogService.findAllBlog();
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
    @GetMapping("/list-blog")
    public ResponseEntity<Page<Blog>> getListBlog(@RequestParam("name") Optional<String> search,@PageableDefault(value = 5) Pageable pageable){
        String searchName = search.orElse("");
        Page<Blog> bloggerPage = iBlogService.getAllBlog(searchName,pageable);
        if(!bloggerPage.hasContent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bloggerPage,HttpStatus.OK);

    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Optional<Blog>> findBlogById(@PathVariable Integer id){
        Optional<Blog> blogOptional = iBlogService.findByIdBlogRest(id);
        if (!blogOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogOptional,HttpStatus.OK);
    }
    @GetMapping("/list-id/{id}")
    public ResponseEntity<List<Blog>> getBlogByIdCategory(@PathVariable Integer id){
        List<Blog> blogList = iBlogService.getBlogByIdCategory(id);
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }

}
