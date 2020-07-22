package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookManagerTestSuite {
    private BookManager bookManager = new BookManager();

    @Test
    public void shouldCreateBookIfSuchBookDoesNotExist() {
        //Given
        //When
        bookManager.createBook("The Lord Of The Rings", "Tolkien");
        //Then
        assertEquals(1, bookManager.books.size());
    }

    @Test
    public void shouldNotCreateBookIfThisBookAlreadyExist() {
        //Given
        bookManager.createBook("The Lord Of The Rings", "Tolkien");
        //When
        bookManager.createBook("The Lord Of The Rings", "Tolkien");
        //Then
        assertEquals(1, bookManager.books.size());
    }

}