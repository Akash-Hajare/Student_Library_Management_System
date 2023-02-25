package com.accio.Student_Library_Management_System.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String country;

    private int age;

    //bidirectional mapping
    @OneToMany(mappedBy = "author" ,cascade = CascadeType.ALL)
    private List<Book> bookWritten;


    public Author() {
        bookWritten=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBookWritten() {
        return bookWritten;
    }

    public void setBookWritten(List<Book> bookWritten) {
        this.bookWritten = bookWritten;
    }
}
