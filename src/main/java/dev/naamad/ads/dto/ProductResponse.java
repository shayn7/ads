package dev.naamad.ads.dto;

import dev.naamad.ads.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {
    private String title;
    private Category category;
    private int price;
    private String serialNumber;
}
