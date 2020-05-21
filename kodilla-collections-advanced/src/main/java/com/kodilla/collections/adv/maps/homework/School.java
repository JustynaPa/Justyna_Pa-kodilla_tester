package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private int quantity;
    private String nameSchool;


    public School(int quantity, String nameSchool) {
        this.quantity = quantity;
        this.nameSchool = nameSchool;

            }


    List<School> studentsList = new ArrayList<>();


    public int getQuantity() {
        return quantity;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return getQuantity() == school.getQuantity() &&
                Objects.equals(getNameSchool(), school.getNameSchool()) &&
                Objects.equals(studentsList, school.studentsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuantity(), getNameSchool(), studentsList);
    }

    @Override
    public String toString() {
        return "School{" +
                "quantity=" + quantity +
                ", nameSchool='" + nameSchool + '\'' +
                ", studentsList=" + studentsList +
                '}';
    }
}
