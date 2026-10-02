package App.E_commmerce.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.E_commmerce.Model.CartModel;
import App.E_commmerce.Model.OrderModel;
import App.E_commmerce.repository.CartRepository;
import App.E_commmerce.repository.OrderRepository;


@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepo;

    @Autowired
    CartRepository cartRepo;

    public void placeOrder(OrderModel orderModel) {

    List<CartModel> cartItems =
            cartRepo.findByUserId(orderModel.getUserId());

    List<Integer> productIds = new ArrayList<>();

    for (CartModel item : cartItems) {
        productIds.add(item.getProductId());
    }

    orderModel.setProductIds(productIds);

    orderRepo.save(orderModel);

    cartRepo.deleteAll(cartItems);
    }

    public OrderModel addressChange(Long orderId, String address) {
        OrderModel order =
                orderRepo.findById(orderId).orElse(null);
        if (order != null) {
            order.setAddress(address);
            return orderRepo.save(order);
        }
        return null;
    }
}