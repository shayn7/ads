package dev.naamad.ads.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class CampaignRequest {
    private String name;
    private int bid;
    @JsonFormat(pattern="dd/MM/yy")
    private Date startDate;
    private Set<Long> productIds;

}
