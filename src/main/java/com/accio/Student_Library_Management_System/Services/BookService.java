package com.accio.Student_Library_Management_System.Services;


import com.accio.Student_Library_Management_System.Models.Author;
import com.accio.Student_Library_Management_System.Models.Book;
import com.accio.Student_Library_Management_System.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;
    public String addBook(Book book){

        //I want to get author entity
        int authorId=book.getAuthor().getId();
        Author author=authorRepository.findById(authorId).get();

        book.setAuthor(author);

        List<Book> currentBooksWritten=author.getBookWritten();
        currentBooksWritten.add(book);

        author.setBookWritten(currentBooksWritten);


        authorRepository.save(author);

        return "Book added successfully";
    }
}
