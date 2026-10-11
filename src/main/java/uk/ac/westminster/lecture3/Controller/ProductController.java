package uk.ac.westminster.lecture3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.lecture3.Services.ProductService;
import uk.ac.westminster.lecture3.dto.Product;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(
            @PathVariable Long id) {
        return productService.getProductById(id)
                .orElse(null); // orElse(null) is a
// placeholder we replace with a real 404 later.
    }

    @PostMapping()
    public Product saveProduct(
            @RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(
            @PathVariable Long id) {
      return  productService.deleteProduct(id);
    }
}
