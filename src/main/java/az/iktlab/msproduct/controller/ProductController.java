package az.iktlab.msproduct.controller;

import az.iktlab.msproduct.client.AdsDto;
import az.iktlab.msproduct.model.Product;
import az.iktlab.msproduct.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void addAds(@RequestBody AdsDto adsDto) {
        productService.add(adsDto);
    }

    @GetMapping
    public List<AdsDto> getAll() {
        return productService.getAll();
    }
}
