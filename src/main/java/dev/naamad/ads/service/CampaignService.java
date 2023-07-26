package dev.naamad.ads.service;

import dev.naamad.ads.dto.CampaignRequest;
import dev.naamad.ads.dto.CampaignResponse;
import dev.naamad.ads.entities.Campaign;

public interface CampaignService {
    CampaignResponse createCampaign(CampaignRequest campaignRequest);
    Campaign getActiveCampaignWithHighestBid();
}
