package dev.naamad.ads.dto;

import dev.naamad.ads.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CampaignResponse {
    private String name;
    private int bid;
    private Date startDate;
    private Set<Product> products;

}
