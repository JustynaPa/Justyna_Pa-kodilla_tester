package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();
        Book top1 = bookManager.createBook("Jadłonomia po polsku", "Dymek Marta");
        Book top2 = bookManager.createBook("Lot 202", "Mróz Remigiusz");
        Book top3 = bookManager.createBook("Lot 202", "Mróz Remigiusz");

        System.out.println(top1.hashCode());
        System.out.println(top2.hashCode());
        System.out.println(top3.hashCode());

        System.out.println(top1 == top2);
        System.out.println(top1 == top3);
        System.out.println(top2 == top3);
        System.out.println(top1.equals(top2));
        System.out.println(top1.equals(top3));
        System.out.println(top2.equals(top3));

    }
}
