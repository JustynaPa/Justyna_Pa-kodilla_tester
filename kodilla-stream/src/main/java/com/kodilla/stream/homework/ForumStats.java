package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgType1 = UsersRepository.getUsersList()
                .stream()
                .filter(condition -> condition.getAge() >= 40)
                .map(user -> user.getNumberOfPosts())
                .mapToDouble(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avgType1);

        double avgType2 = UsersRepository.getUsersList()
                .stream()
                .filter(condition -> condition.getAge() < 40)
                .map(user -> user.getNumberOfPosts())
                .mapToDouble(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avgType2);
    }
}
