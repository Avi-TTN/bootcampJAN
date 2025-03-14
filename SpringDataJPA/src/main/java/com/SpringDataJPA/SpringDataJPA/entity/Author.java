package com.SpringDataJPA.SpringDataJPA.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Embedded
    Address address;
    @ElementCollection
    List<String> subjects;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "author_books",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> books;

//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
//    private List<Book> books;


//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "author_books",
//            joinColumns = @JoinColumn(name = "author_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id")
//    )
//    private List<Book> books;

//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
//    private List<Book> books;



    public Author(){

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
