package dev.naamad.ads.service;

import dev.naamad.ads.entities.Product;
import dev.naamad.ads.enums.Category;

import java.util.Optional;

public interface ProductService {

    Optional<Product> findProductById(Long id);

    Product getProductByCategoryFromActiveCampaignWithHighestBid(String category);
}
