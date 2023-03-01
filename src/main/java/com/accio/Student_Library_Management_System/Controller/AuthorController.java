package com.accio.Student_Library_Management_System.Controller;


import com.accio.Student_Library_Management_System.DTOs.AuthorEntryDto;
import com.accio.Student_Library_Management_System.DTOs.AuthorResponseDto;
import com.accio.Student_Library_Management_System.Models.Author;
import com.accio.Student_Library_Management_System.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("author")
public class AuthorController {

    //    / is optional : you want to write you can
    // otherwise not required


    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody AuthorEntryDto authorEntryDto){
        return authorService.createAuthor(authorEntryDto);
    }

    @GetMapping("/getAuthor")
    public AuthorResponseDto getAuthor(@RequestParam("authorId")Integer authorId){
        return authorService.getAuthor(authorId);
    }








}
