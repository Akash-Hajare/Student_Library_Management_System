package com.accio.Student_Library_Management_System.Controller;


import com.accio.Student_Library_Management_System.DTOs.BookRequestDto;
import com.accio.Student_Library_Management_System.Models.Book;
import com.accio.Student_Library_Management_System.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody BookRequestDto bookRequestDto){

       try{
           String response= bookService.addBook(bookRequestDto);
           return response;
       }catch (Exception e ){
           return "Exception occured";
       }


    }


}
