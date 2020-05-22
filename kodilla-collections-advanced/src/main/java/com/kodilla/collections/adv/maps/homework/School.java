package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private List<Integer> quantity = new ArrayList<>();
    private String nameSchool;


    public School(List<Integer> quantity, String nameSchool) {
        this.quantity = quantity;
        this.nameSchool = nameSchool;

            }





    public List<Integer> getQuantity() {
        return quantity;
    }

    public int getSumList() {
        int sum = 0;
        for(Integer note : quantity)
            sum += note;
        return sum;
    }

    public String getNameSchool() {
        return nameSchool;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return Objects.equals(getQuantity(), school.getQuantity()) &&
                Objects.equals(getNameSchool(), school.getNameSchool());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuantity(), getNameSchool());
    }

    @Override
    public String toString() {
        return "School{" +
                "quantity=" + quantity +
                ", nameSchool='" + nameSchool + '\'' +
                '}';
    }
}
