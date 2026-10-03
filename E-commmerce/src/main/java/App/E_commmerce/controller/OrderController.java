package App.E_commmerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import App.E_commmerce.Model.OrderModel;
import App.E_commmerce.Service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public void placeOrder(@RequestBody OrderModel orderModel) {
        orderService.placeOrder(orderModel);
    }

    @PutMapping("/addressChange")
    public OrderModel addressChange(
            @RequestParam Long orderId,
            @RequestParam String address) {

        return orderService.addressChange(orderId, address);
    }
}