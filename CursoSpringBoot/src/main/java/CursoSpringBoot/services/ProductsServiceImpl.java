package CursoSpringBoot.services;

import CursoSpringBoot.domain.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductsServiceImpl {

    List<Product> productos = new ArrayList<>(Arrays.asList(
            new Product(1,"laptopc",799.99,10),
            new Product(2,"spartphone",499.99,25),
            new Product(3,"Tablet",299.9,15),
            new Product(4,"Smartwach",199.99,30)
    ));

    public List<Product> getProducts(){
        return productos;
    }


    
}
