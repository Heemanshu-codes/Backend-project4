package App.E_commmerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import App.E_commmerce.*;
import App.E_commmerce.repository.ProductRepository;
import App.E_commmerce.Model.*;;



@Service
public class ProductService {
    @Autowired 
    ProductRepository ProductRepo;

    public ProductModel registerProduct(ProductModel product){
        return ProductRepo.save(product);
    }

    public List<ProductModel>  getAllProduct(){
        return ProductRepo.findAll();
    }
}
