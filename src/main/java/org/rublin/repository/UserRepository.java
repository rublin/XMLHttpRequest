package org.rublin.repository;

import org.rublin.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class UserRepository {
    private ConcurrentHashMap<String, User> userMap = new ConcurrentHashMap<String, User>();

    public User get(String key) {
        return userMap.get(key);
    }

    @PostConstruct
    private void init() {
        userMap.put("user", new User("user", "password"));
    }
}
