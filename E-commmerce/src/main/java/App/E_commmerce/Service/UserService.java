package App.E_commmerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}