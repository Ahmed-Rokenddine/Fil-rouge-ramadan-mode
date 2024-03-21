package yc.ahmed.carenow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yc.ahmed.carenow.Dtos.UserDTO.UserRequestDto;
import yc.ahmed.carenow.services.UserService;

import java.util.List;

@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/Users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserRequestDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserRequestDto getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/create")
    public UserRequestDto createUser(@RequestBody UserRequestDto user) {
        return userService.createUser(user);
    }

    @PutMapping("/update")
    public UserRequestDto updateUser(@RequestBody UserRequestDto user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
