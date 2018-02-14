package com.guru.springframework.springwebapp.bootstrap;

import com.guru.springframework.springwebapp.model.Author;
import com.guru.springframework.springwebapp.model.Book;
import com.guru.springframework.springwebapp.model.Publisher;
import com.guru.springframework.springwebapp.repositories.AuthorRepository;
import com.guru.springframework.springwebapp.repositories.BookRepository;
import com.guru.springframework.springwebapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        Author eric = new Author("Eric", "Evans");
        Publisher harper = new Publisher("Harper Collins", "tralara");
        Book ddd = new Book("Doma Dri De", "1234", harper);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        publisherRepository.save(harper);
        authorRepository.save(eric);
        bookRepository.save(ddd);



        Author rod = new Author("Rod", "Johnson");
        Publisher worx = new Publisher("Worx", "trelere");
        Book noEJB = new Book("J2EE Development without EJB", "23444", worx);
        rod.getBooks().add(noEJB);
        publisherRepository.save(worx);
        authorRepository.save(rod);
        bookRepository.save(noEJB);


    }


}
