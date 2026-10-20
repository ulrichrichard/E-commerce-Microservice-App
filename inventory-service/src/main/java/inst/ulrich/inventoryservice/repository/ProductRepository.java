package inst.ulrich.inventoryservice.repository;

import inst.ulrich.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
