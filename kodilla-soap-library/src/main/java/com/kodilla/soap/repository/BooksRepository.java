package com.kodilla.soap.repository;

import com.kodilla.courses.soap.library.Book;
import com.kodilla.courses.soap.library.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {
    private static final Map<String, Book> bibliotheca = new HashMap<>();

    @PostConstruct
    public void creatingBibliotheca() {
        Book sciFi = new Book();
        sciFi.setSignature("SCIFI/2018/SB/P");
        sciFi.setAuthor("Stephen Baxter");
        sciFi.setTitle("Proxima");
        sciFi.setPublicationYear(2018);
        sciFi.setGenre(Genre.SCI_FI);

        bibliotheca.put(sciFi.getSignature(), sciFi);

        Book fantasy = new Book();
        sciFi.setSignature("FAN/2020/JRRT/S");
        sciFi.setAuthor("John Ronald Reuel Tolkien");
        sciFi.setTitle("Silmarillion");
        sciFi.setPublicationYear(2020);
        sciFi.setGenre(Genre.FANTASY);

        bibliotheca.put(fantasy.getSignature(), fantasy);

        Book tech = new Book();
        sciFi.setSignature("TECH/2017/JB/T");
        sciFi.setAuthor("Jan Białek");
        sciFi.setTitle("TECH. Krytyka rozwoju środowiska technologicznego");
        sciFi.setPublicationYear(2017);
        sciFi.setGenre(Genre.TECH);

        bibliotheca.put(tech.getSignature(), tech);

        Book crime = new Book();
        sciFi.setSignature("CRI/2020/HC/W");
        sciFi.setAuthor("Harlan Coben");
        sciFi.setTitle("W głębi lasu");
        sciFi.setPublicationYear(2020);
        sciFi.setGenre(Genre.CRIME);

        bibliotheca.put(crime.getSignature(), crime);
    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "Please provide the book signature here: ");
        return bibliotheca.get(signature);
    }
}
