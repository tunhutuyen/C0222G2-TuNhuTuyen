package com.example.exam_back_end.controller;

import com.example.exam_back_end.model.Block;
import com.example.exam_back_end.service.IBlockService;
import com.example.exam_back_end.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/rest")
public class BlockRestController {
    @Autowired
    private IProductService iProductService;
    @Autowired
    private IBlockService iBlockService;

    @GetMapping("/block-list")
    public ResponseEntity<Page<Block>> getAllBlock(@PageableDefault(value=2)Pageable pageable, Optional<String> name) {
        String productName = name.orElse("");
        if (productName.equals("null")){
            productName = "";
        }
        Page<Block> blockPage = this.iBlockService.getAllBlock(pageable,productName);
        System.out.println(blockPage);
        if (blockPage.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blockPage, HttpStatus.OK);

    }

    @GetMapping("/block-find-by-id/{id}")
    public ResponseEntity<Block> findBlockById(@PathVariable Integer id){
        Block block= this.iBlockService.findById(id);
        return new ResponseEntity<>(block,HttpStatus.OK);
    }

    @PostMapping("/block-create")
    public ResponseEntity<Block> saveBlock(@RequestBody Block block){
        this.iBlockService.saveBlock(block);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/block-delete/{idDelete}")
    public ResponseEntity<Void> deleteBlock(@PathVariable Integer idDelete){
        System.out.println(idDelete);
        this.iBlockService.delete(idDelete);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PatchMapping("/block-edit/{id}")
    public ResponseEntity<Void> editBlock(@RequestBody Block block){
        System.out.println(block);
        this.iBlockService.save(block);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
