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
        fantasy.setSignature("FAN/2020/JRRT/S");
        fantasy.setAuthor("John Ronald Reuel Tolkien");
        fantasy.setTitle("Silmarillion");
        fantasy.setPublicationYear(2020);
        fantasy.setGenre(Genre.FANTASY);

        bibliotheca.put(fantasy.getSignature(), fantasy);

        Book tech = new Book();
        tech.setSignature("TECH/2017/JB/T");
        tech.setAuthor("Jan Białek");
        tech.setTitle("TECH. Krytyka rozwoju środowiska technologicznego");
        tech.setPublicationYear(2017);
        tech.setGenre(Genre.TECH);

        bibliotheca.put(tech.getSignature(), tech);

        Book crime = new Book();
        crime.setSignature("CRI/2020/HC/W");
        crime.setAuthor("Harlan Coben");
        crime.setTitle("W głębi lasu");
        crime.setPublicationYear(2020);
        crime.setGenre(Genre.CRIME);

        bibliotheca.put(crime.getSignature(), crime);
    }

    public Book findBook(String signature) {
        System.out.println("Get signature:" + signature);
        System.out.println(bibliotheca);
        Assert.notNull(signature, "Please provide the book signature here: ");
        Book result = bibliotheca.get(signature);
        System.out.println(result);
        return result;
    }


}
