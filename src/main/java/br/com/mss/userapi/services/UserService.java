package br.com.mss.userapi.services;

import br.com.mss.userapi.domain.User;

import java.util.List;

/**
 * The interface User service.
 */
public interface UserService {

    /**
     * Find by id user.
     *
     * @param id the id
     * @return the user
     */
    User findById(Long id);

    /**
     * Find all list.
     *
     * @return the list
     */
    List<User> findAll();


}
