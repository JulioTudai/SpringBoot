package CursoSpringBoot.Controllers;

import CursoSpringBoot.domain.Product;
import CursoSpringBoot.services.ProductsServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    ProductsServiceImpl productsService = new ProductsServiceImpl();
    @GetMapping
    public ResponseEntity<?> getProducts(){
        List<Product> products = productsService.getProducts();

        return ResponseEntity.ok(products);
    }
}