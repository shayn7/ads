package dev.naamad.ads.entities;

import jakarta.persistence.*;
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
@Entity
@Table(name = "tbl_campaign")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long campaignId;
    private String name;
    private int bid;
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "campaign_product",
            joinColumns = @JoinColumn(name = "campaign_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products;

}
