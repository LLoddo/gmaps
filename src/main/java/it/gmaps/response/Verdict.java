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
public class Verdict {

    @JsonProperty("inputGranularity")
    Granularity inputGranularity;

    @JsonProperty("validationGranularity")
    Granularity validationGranularity;

    @JsonProperty("geocodeGranularity")
    Granularity geocodeGranularity;

    @JsonProperty("addressComplete")
    Boolean addressComplete;

    @JsonProperty("hasUnconfirmedComponents")
    Boolean hasUnconfirmedComponents;

    @JsonProperty("hasInferredComponents")
    Boolean hasInferredComponents;

    @JsonProperty("hasReplacedComponents")
    Boolean hasReplacedComponents;

}
