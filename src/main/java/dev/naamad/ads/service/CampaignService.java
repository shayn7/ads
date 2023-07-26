package dev.naamad.ads.service;

import dev.naamad.ads.dto.CampaignRequest;
import dev.naamad.ads.dto.CampaignResponse;

public interface CampaignService {
    CampaignResponse createCampaign(CampaignRequest campaignRequest);
}
