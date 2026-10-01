package App.E_commmerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import App.E_commmerce.Model.CartModel;

@Repository
public interface CartRepository extends JpaRepository<CartModel, Long> {

    List<CartModel> findByUserId(Integer userId);

    void deleteByUserIdAndProductId(Integer userId, Integer productId);
}