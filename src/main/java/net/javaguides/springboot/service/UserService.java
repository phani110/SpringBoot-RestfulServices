package net.javaguides.springboot.service;

import net.javaguides.springboot.Dto.UserDto;
import net.javaguides.springboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public UserDto createUser(UserDto userDto);

    public UserDto getUserById(Long id);

    public List<UserDto> getAllUsers();

    public UserDto updateUser(Long Id,User user);

    public String deleteUser(Long id);
}
