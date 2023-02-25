package com.accio.Student_Library_Management_System.Models;

import com.accio.Student_Library_Management_System.Enums.Genre;
import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int pages;

    private double rating;

    private boolean issued;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    //Book is child wrt author
    //setting here the foreign key : standard 3 steps

    @ManyToOne
    @JoinColumn
    private Author author;



    //Book is child wrt author
    //setting here the foreign key : standard 3 steps
    @ManyToOne
    @JoinColumn
    private Card card;



    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book() {
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}