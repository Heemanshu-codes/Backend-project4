package App.E_commmerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import App.E_commmerce.Model.UserModel;
import App.E_commmerce.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;
    public UserModel registerUser(UserModel user) {
        return userRepo.save(user);
    }
    public List<UserModel> getAllUser() {
        return userRepo.findAll();
    }
    public UserModel findUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }
    public String loginUser(String email,String password) {
        Optional<UserModel> existingUser=userRepo.findByEmailAndPassword(email,password);
        if (existingUser != null) {
            return "Login successful";
        }
        return "Invalid credentials";
    }
}