package yc.ahmed.carenow.services;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yc.ahmed.carenow.Dtos.UserDTO.UserRequestDto;
import yc.ahmed.carenow.models.User;
import yc.ahmed.carenow.repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public List<UserRequestDto> getAllUsers() {
        List<User> Users = userRepository.findAll();
        return Users.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private UserRequestDto convertToDto(User user) {
        return modelMapper.map(user, UserRequestDto.class);
    }

    public UserRequestDto getUserById(Long id) {
        User user = userRepository.findById(id).orElse(null);
        return modelMapper.map(user, UserRequestDto.class);
    }

    public UserRequestDto createUser(UserRequestDto UserDto) {
        User user = modelMapper.map(UserDto, User.class);
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserRequestDto.class);
    }

    public UserRequestDto updateUser(UserRequestDto UserDto) {
        User user = modelMapper.map(UserDto, User.class);
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserRequestDto.class);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
    
    
}
