package josecarlos.pruebas.product.repository;

import josecarlos.pruebas.product.entity.Category;
import josecarlos.pruebas.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findByCategory(Category category);
}
