package CursoSpringBoot.Controllers;

import CursoSpringBoot.Configurations.ExternalizedConfigurations;
import CursoSpringBoot.domain.Product;
import CursoSpringBoot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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
    @Lazy
    //@Qualifier("listResourceService") comentamos para usar conditionalOnProperty
    private ProductService  productsService;

    @Autowired
    private ExternalizedConfigurations externalizedConfigurations;

    @GetMapping
    public ResponseEntity<?> getProducts(){

        System.out.println(externalizedConfigurations.toString());
        List<Product> products = productsService.getProducts();

        return ResponseEntity.ok(products);
    }
}
