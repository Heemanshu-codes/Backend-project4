package App.E_commmerce.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.E_commmerce.Model.CartModel;
import App.E_commmerce.repository.CartRepository;

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