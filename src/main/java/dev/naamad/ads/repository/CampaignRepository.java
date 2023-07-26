package dev.naamad.ads.repository;

import dev.naamad.ads.entities.Campaign;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CampaignRepository extends ListCrudRepository<Campaign, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM tbl_campaign WHERE start_date > current_date OR start_date BETWEEN dateadd(day,-10,current_date) AND current_date;")
    List<Campaign> findValidCampaigns();
    @Query(nativeQuery = true, value = "SELECT * FROM tbl_campaign WHERE bid = ( SELECT MAX(bid) FROM tbl_campaign );")
    Campaign findHighestBid(List<Campaign> campaigns);

}
