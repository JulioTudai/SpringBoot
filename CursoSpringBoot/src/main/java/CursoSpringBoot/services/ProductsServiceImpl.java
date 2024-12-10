package CursoSpringBoot.services;

import CursoSpringBoot.domain.Product;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Lazy
@Service
@ConditionalOnProperty(name = "service.products",havingValue = "list")

public class ProductsServiceImpl implements ProductService {

    List<Product> productos = new ArrayList<>(Arrays.asList(
            new Product(1,"laptopc",799.99,10),
            new Product(2,"spartphone",499.99,25),
            new Product(3,"Tablet",299.9,15),
            new Product(4,"Smartwach",199.99,30)
    ));
    @Override
    public List<Product> getProducts(){
        return productos;
    }


    
}
