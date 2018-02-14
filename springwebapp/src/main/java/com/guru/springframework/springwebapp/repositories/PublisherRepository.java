package com.guru.springframework.springwebapp.repositories;

import com.guru.springframework.springwebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
