package dev.naamad.ads.utils;

import dev.naamad.ads.entities.Product;
import dev.naamad.ads.enums.Category;
import dev.naamad.ads.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbInit {

    @Autowired
    private ProductRepository productRepository;


    @PostConstruct
    private void createProducts() {
        List<Product> products = new ArrayList<>();
        Category category = null;

        for (int i = 0; i < 100; i++) {
            if (i<=30) category = Category.CLOTHES;
            if(i>=31 && i<=70) category = Category.DRINKS;
            if(i>=71) category = Category.FOOD;

            Product product = Product
                    .builder()
                    .title(RandomStringUtils.randomAlphabetic(7))
                    .price(i * 9)
                    .serialNumber(RandomStringUtils.randomAlphanumeric(10))
                    .category(category)
                    .build();
            products.add(product);
        }

        productRepository.saveAll(products);
        System.out.println(products);
    }
}
