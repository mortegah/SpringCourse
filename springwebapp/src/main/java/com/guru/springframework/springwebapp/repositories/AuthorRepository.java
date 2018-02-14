package com.guru.springframework.springwebapp.repositories;

import com.guru.springframework.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author, Long>{
}
