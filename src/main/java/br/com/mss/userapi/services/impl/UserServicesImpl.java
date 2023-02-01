package br.com.mss.userapi.services.impl;

import br.com.mss.userapi.domain.User;
import br.com.mss.userapi.repositories.UserRepository;
import br.com.mss.userapi.services.UserService;
import br.com.mss.userapi.services.exptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class UserServicesImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
