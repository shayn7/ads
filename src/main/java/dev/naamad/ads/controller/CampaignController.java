package dev.naamad.ads.controller;

import dev.naamad.ads.dto.CampaignRequest;
import dev.naamad.ads.dto.CampaignResponse;
import dev.naamad.ads.entities.Campaign;
import dev.naamad.ads.service.CampaignService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/campaign")
@RequiredArgsConstructor
@RestController
public class CampaignController {

    private final CampaignService campaignService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public CampaignResponse createCampaign(@RequestBody CampaignRequest campaignRequest){
        return campaignService.createCampaign(campaignRequest);
    }

    @GetMapping("/active/highest-bid")
    @ResponseStatus(HttpStatus.OK)
    public Campaign getActiveCampaignWithHighestBid(){
        return campaignService.getActiveCampaignWithHighestBid();
    }
}
