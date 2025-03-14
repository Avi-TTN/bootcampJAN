package com.SpringDataJPA.SpringDataJPA.service;

import com.SpringDataJPA.SpringDataJPA.entity.Author;
import com.SpringDataJPA.SpringDataJPA.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public void add(Author author){
        authorRepository.save(author);
    }
}
