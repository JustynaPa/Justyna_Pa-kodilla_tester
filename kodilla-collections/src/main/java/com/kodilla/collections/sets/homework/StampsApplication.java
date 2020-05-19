package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("oldCity", 2.30, 2.45, true));
        stamps.add(new Stamp("oldVillage", 1.93, 2.05, false));
        stamps.add(new Stamp("oldMonument", 2.11, 2.11, false));
        stamps.add(new Stamp("oldOak", 2.59, 2.69, true));
        stamps.add(new Stamp("oldCity", 2.30, 2.45, true));
        stamps.add(new Stamp("oldCity", 2.30, 2.45, true));
        stamps.add(new Stamp("oldCity", 2.30, 2.45, true));
        stamps.add(new Stamp("oldMonument", 2.11, 2.11, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
