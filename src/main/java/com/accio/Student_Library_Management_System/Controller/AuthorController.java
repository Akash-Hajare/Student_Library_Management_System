package com.accio.Student_Library_Management_System.Controller;


import com.accio.Student_Library_Management_System.DTOs.AuthorEntryDto;
import com.accio.Student_Library_Management_System.DTOs.AuthorResponseDto;
import com.accio.Student_Library_Management_System.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("author")
public class AuthorController {


    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody AuthorEntryDto authorEntryDto){
        try {
            return authorService.createAuthor(authorEntryDto);
        }catch (Exception e){
            return "Exception occur";
        }
    }

    @GetMapping("/getAuthor")
    public String getAuthor(@RequestParam("authorId")Integer authorId)throws Exception {
        try{
            return authorService.getAuthor(authorId).toString();
        }catch (Exception e){
            return "Exception found";
        }
    }








}
