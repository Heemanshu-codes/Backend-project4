package App.E_commmerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.E_commmerce.Model.*;
import App.E_commmerce.repository.CartRepository;

import java.util.List;

    @Service
public class CartService {

@Autowired
private CartRepository cartRepo;

    public void addToCart(Integer userId, Integer productId) {
        CartModel cart = new CartModel();

        cart.setUserId(userId);
        cart.setProductId(productId);

        cartRepo.save(cart);
    }

    public void removeFromCart(Integer userId, Integer productId) {
        cartRepo.deleteByUserIdAndProductId(userId, productId);
    }

    public List<CartModel> getCartItems(Integer userId) {
        return cartRepo.findByUserId(userId);
    }
}
