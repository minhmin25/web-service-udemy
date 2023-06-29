package com.minhta.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static final List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Minh", LocalDate.now().minusYears(18)));
        users.add(new User(++usersCount, "Duong", LocalDate.now().minusYears(15)));
        users.add(new User(++usersCount, "TUng", LocalDate.now().minusYears(12)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }

    public void save(User user) {

        user.setId(++usersCount);
        users.add(user);
    }
}
