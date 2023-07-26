package dev.naamad.ads.service_impl;

import dev.naamad.ads.dto.CampaignRequest;
import dev.naamad.ads.dto.CampaignResponse;
import dev.naamad.ads.entities.Campaign;
import dev.naamad.ads.entities.Product;
import dev.naamad.ads.repository.CampaignRepository;
import dev.naamad.ads.service.CampaignService;
import dev.naamad.ads.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class CampaignServiceImpl implements CampaignService {

    private final CampaignRepository campaignRepository;
    private final ProductService productService;
    @Override
    public CampaignResponse createCampaign(CampaignRequest campaignRequest) {
//        List<Product> products = getProducts(campaignRequest);
        Set<Product> products = getProducts(campaignRequest);

        Campaign campaign = Campaign
                .builder()
                .name(campaignRequest.getName())
                .bid(campaignRequest.getBid())
                .startDate(campaignRequest.getStartDate())
                .products(products)
                .build();
        campaignRepository.save(campaign);
        return mapToCampaignResponse(campaign, products);
    }

    private Set<Product> getProducts(CampaignRequest campaignRequest) {
        Set<Long> productIds= new HashSet<>(campaignRequest.getProductIds());
        Set<Product> products = new HashSet<>();
        for (Long productId : productIds) {
            Optional<Product> product = productService.findProductById(productId);
            if(product.isEmpty()) throw new RuntimeException(String.format("product %s does not exist!", productId));
            products.add(product.get());
        }
        return products;
    }
    private CampaignResponse mapToCampaignResponse(Campaign campaign, Set<Product> products) {
        return CampaignResponse
                .builder()
                .name(campaign.getName())
                .startDate(campaign.getStartDate())
                .bid(campaign.getBid())
                .products(products)
                .build();
    }
}
