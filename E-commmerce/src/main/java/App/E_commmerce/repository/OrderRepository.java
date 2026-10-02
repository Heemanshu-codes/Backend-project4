package App.E_commmerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import App.E_commmerce.Model.OrderModel;
@Repository

public interface  OrderRepository extends JpaRepository<OrderModel,Long>{
    
}
