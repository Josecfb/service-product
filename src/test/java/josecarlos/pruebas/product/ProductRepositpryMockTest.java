package josecarlos.pruebas.product;

import josecarlos.pruebas.product.entity.Category;
import josecarlos.pruebas.product.entity.Product;
import josecarlos.pruebas.product.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class ProductRepositpryMockTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenFindByCategory_thenReturnListProduct(){
        Product product01 = Product.builder()
                .name("computer")
                .category(Category.builder().id(1L).build())
                .description("")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1240.99"))
                .status("Created")
                .createdAt(new Date()).build();
        productRepository.save(product01);
        List<Product> founds = productRepository.findByCategory(product01.getCategory());
        Assertions.assertTrue(founds.size()==3);
    }
}
