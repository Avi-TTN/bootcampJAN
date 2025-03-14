package com.SpringDataJPA.SpringDataJPA.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String bookName;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

//    @ManyToOne
//    @JoinColumn(name = "author_id")
//    private Author author;

//    @OneToOne(mappedBy = "book")
//    private Author author;

//    @ManyToOne
//    @JoinTable(
//            name = "author_books",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "author_id")
//    )
//    private Author author;

}
