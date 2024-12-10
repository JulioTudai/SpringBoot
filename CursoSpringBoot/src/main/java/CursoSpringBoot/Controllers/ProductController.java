package CursoSpringBoot.Controllers;

import CursoSpringBoot.domain.Product;
import CursoSpringBoot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    //esto genera un fuerte acoplamiento entre la clase producto controller y servicio
    //ProductService productsService = new ProductsServiceImpl();


    @Autowired//usando inyeccion de dependencias
    @Qualifier("listResourceService")
    private ProductService  productsService;

    @GetMapping
    public ResponseEntity<?> getProducts(){
        List<Product> products = productsService.getProducts();

        return ResponseEntity.ok(products);
    }
}
