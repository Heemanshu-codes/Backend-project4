package App.E_commmerce.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import App.E_commmerce.Model.*;


@Repository

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
