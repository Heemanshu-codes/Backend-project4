package App.E_commmerce.controller;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import App.E_commmerce.Service.*;
import App.E_commmerce.Model.*;
import java.util.*;
@RestController
@RequestMapping("product")
public class Product {
    @Autowired
    ProductService productService;
 
    @GetMapping("allproduct")
    public List<ProductModel> getALLproduct(){
        return productService.getAllProduct();
    }
    @PostMapping("addproduct")
    public ProductModel addProduct(@RequestBody ProductModel product){
        return productService.registerProduct(product);
    }

}
