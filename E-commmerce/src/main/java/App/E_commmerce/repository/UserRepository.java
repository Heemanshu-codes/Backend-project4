package App.E_commmerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import App.E_commmerce.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}