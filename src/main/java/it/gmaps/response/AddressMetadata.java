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
public class AddressMetadata {

    @JsonProperty("business")
    Boolean business;

    @JsonProperty("poBox")
    Boolean poBox;

    @JsonProperty("residential")
    Boolean residential;

}
