package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> schoolPrincipal = new HashMap<>();

        Principal principalName1 = new Principal("Janusz", "Wielki");
        Principal principalName2 = new Principal("Kazimierz", "Mały");
        Principal principalName3 = new Principal("Bartosz", "Ostrożny");
        Principal principalName4 = new Principal("Remigiusz", "Trzynasty");

        School principalWolska = new School(23, "Wolska");
        School principalRedutowa = new School(27, "Redutowa");
        School principalKolo = new School(29, "Koło");
        School principalBracka = new School(21, "Bracka");

        schoolPrincipal.put(principalName1, principalWolska);
        schoolPrincipal.put(principalName2, principalRedutowa);
        schoolPrincipal.put(principalName3, principalKolo);
        schoolPrincipal.put(principalName4, principalBracka);

        for (Map.Entry<Principal, School> note : schoolPrincipal.entrySet()) {
            System.out.println("The main director is: " + note.getKey().getFirstName() + " " + note.getKey().getLastName() + ". He managed: " + note.getValue().getNameSchool() + "school, where quantity of children who are studying is: " + note.getValue().getQuantity());
        }

    }
}


