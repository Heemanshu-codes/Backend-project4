
package  App.E_commmerce.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import App.E_commmerce.Model.UserModel;
import App.E_commmerce.Service.UserService;

@RestController
@RequestMapping("/user")
public class User {
    
    @Autowired
    UserService userService;

   @PostMapping("/register")
    public UserModel register(@RequestBody UserModel user) {
    return userService.registerUser(user);
    }

    @GetMapping("/alluser")
    public List<UserModel> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,@RequestParam  String password){
        return userService.loginUser(email,password);
    }
}
