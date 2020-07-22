package com.kodilla.collections.adv.immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTestSuite {
    @Test
    public void shouldGetAuthor(){
        //Given
        Book book = new Book("Paulina Swist", "Gorące lato");
        //When
        String result = book.getAuthor();
        //Then
        assertEquals(result, "Paulina Swist");
    }
    @Test
    public void shouldGetTitle(){
        //Given
        Book book = new Book("Lingas-Łoniewska Agnieszka", "Przebudzenie");
        //When
        String result = book.getTitle();
        //Then
        assertEquals(result, "Przebudzenie");
    }

    @Test
    public void shouldDisplayBookTitleAndAuthor() {
        //Given
        Book book = new Book("Piotr C.", "Gwiazdor");
        //When
        String title = book.getTitle();
        String author = book.getAuthor();
        //Then
        assertEquals("Gwiazdor", title);
        assertEquals("Piotr C.", author);
    }
}
