package dev.naamad.ads.service_impl;

import dev.naamad.ads.entities.Campaign;
import dev.naamad.ads.entities.Product;
import dev.naamad.ads.enums.Category;
import dev.naamad.ads.repository.CampaignRepository;
import dev.naamad.ads.repository.ProductRepository;
import dev.naamad.ads.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CampaignRepository campaignRepository;

    @Override
    public Optional<Product> findProductById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product getProductByCategoryFromActiveCampaignWithHighestBid(String category) {

        System.out.println(campaignRepository.findValidCampaigns());

        return null;
    }
}
