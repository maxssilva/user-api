package br.com.mss.userapi.services;

import br.com.mss.userapi.domain.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

   User findById(Long id);

    List<User> findAll();


}
