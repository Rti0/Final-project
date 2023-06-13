package com.example.desiner.Service;

import com.example.desiner.ApiException.ApiException;
import com.example.desiner.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {
private final UserRepository userRepository;

  public List<User> getAllUsers(){
      return userRepository.findAll();
  }

public void addUser(User user){
      userRepository.save(user);
}

public void updateUser(User user,Integer id) {
    User old = userRepository.findUserById(id);
    if (old == null) {
        throw new ApiException("there is no user to update");
    }

    userRepository.save(old);
}
}
