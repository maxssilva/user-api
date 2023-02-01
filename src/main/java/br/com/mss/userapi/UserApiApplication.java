package br.com.mss.userapi;

import br.com.mss.userapi.domain.User;
import br.com.mss.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(List.of(
                new User(null, "Valdir Cezar", "valdir@mail.com", "123", 30.0)
                , new User(null, "Ramon Rodriguez", "ramon@mail.com", "123", 35.5)
                , new User(null, "Amanda Mazcarenhas", "amanda@mail.com", "123", 40.7)
        ));
    }
}