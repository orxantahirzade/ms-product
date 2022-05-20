package az.iktlab.msproduct.controller;

import az.iktlab.msproduct.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @PostMapping
    public void add(Product product) {

    }
}
