package com.myself.muon_sach.controller;

import com.myself.muon_sach.model.Book;
import com.myself.muon_sach.model.DetailBook;
import com.myself.muon_sach.service.IBookService;
import com.myself.muon_sach.service.IDetailBookService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService iBookService;
    @Autowired
    private IDetailBookService iDetailBookService;

    @GetMapping(value = "")
    public String home(Model model){
        List<Book> bookList = iBookService.findAllBook();
        model.addAttribute("bookList",bookList);
        return "book/index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("bookNew",new Book());
        return "book/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Book bookNew, RedirectAttributes redirectAttributes){
        iBookService.save(bookNew);
        Book book = iBookService.findAllBookMax();
        for (int i = 0; i < book.getAmount(); i++) {
//          DetailBook detailBook = new DetailBook((int) (Math.random()*((99999-10000)+1)+10000),book);
            DetailBook detailBook = new DetailBook(book);
           iDetailBookService.save(detailBook);
        }
        redirectAttributes.addFlashAttribute("message","Create successful");
        return "redirect:/book";
    }
    @GetMapping("{id}/borrow")
    public String borrow(@PathVariable Integer id,RedirectAttributes redirectAttributes){
        List<DetailBook> detailBooks = iDetailBookService.findByIDDetail(id);

        for (DetailBook detailBook:detailBooks) {
            if (detailBook.getStatusBook() == 0){
                detailBook.setStatusBook(1);
                detailBook.setIdCode((int)(Math.random()*((99999-10000)+1)+10000));
                iDetailBookService.save(detailBook);
                Book book=iBookService.findByIDBook(id);
                book.setAmount(book.getAmount()-1);
                iBookService.save(book);
                return "redirect:/book";
            }
        }
        redirectAttributes.addFlashAttribute("message","Not borrow");
        return "redirect:/book";
    }

}
