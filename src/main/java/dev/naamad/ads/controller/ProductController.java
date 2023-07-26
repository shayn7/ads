package dev.naamad.ads.controller;

import dev.naamad.ads.entities.Product;
import dev.naamad.ads.enums.Category;
import dev.naamad.ads.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;


    @GetMapping("/category/{category}")
    @ResponseStatus(HttpStatus.OK)
    public Product getProductByCategoryFromActiveCampaignWithHighestBid(@PathVariable("category") String category){
        return productService.getProductByCategoryFromActiveCampaignWithHighestBid(category);
    }
}
