package App.E_commmerce.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import App.E_commmerce.Service.*;
import org.springframework.web.bind.annotation.*;
import App.E_commmerce.Model.CartModel;
import java.util.List;
@Controller
@RequestMapping("/cart")
public class Cart {
    
    @Autowired
    private CartService cartService;
     
    @PostMapping("/add")
    public String addToCart(@RequestParam("userId") Integer userId, @RequestParam("productId") Integer productId) {
        cartService.addToCart(userId, productId);
        return "redirect:/cart";
    }

    @PostMapping("/remove")
    public String removeFromCart(@RequestParam("UserId") Integer UserId,@RequestParam("productId") Integer productId) {
        cartService.removeFromCart(UserId, productId);
        return "redirect:/cart";
    }

    @GetMapping("items")
    public List<CartModel> getCartItems(@RequestParam("userId") Integer userId){
        return cartService.getCartItems(userId);
    }
}
