package it.gmaps.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ValidationResult {

    @JsonProperty("verdict")
    Verdict verdict;

    @JsonProperty("address")
    Address address;

    @JsonProperty("geocode")
    Geocode geocode;

    @JsonProperty("metadata")
    AddressMetadata addressMetadata;

    @JsonProperty("uspsData")
    UspsData uspsData;
}
