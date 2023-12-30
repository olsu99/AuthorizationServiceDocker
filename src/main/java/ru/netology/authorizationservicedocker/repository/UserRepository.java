package ru.netology.authorizationservicedocker.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorizationservicedocker.authorities.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("user1") && password.equals("1111")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("user2") && password.equals("2222")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("user3") && password.equals("3333")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}
