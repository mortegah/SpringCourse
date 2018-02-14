package com.guru.springframework.springwebapp.repositories;

import com.guru.springframework.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Long> {
}
