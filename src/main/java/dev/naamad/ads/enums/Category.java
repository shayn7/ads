package dev.naamad.ads.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Category {
    @JsonProperty("clothes")
    CLOTHES,
    @JsonProperty("food")
    FOOD,
    @JsonProperty("drinks")
    DRINKS
}
