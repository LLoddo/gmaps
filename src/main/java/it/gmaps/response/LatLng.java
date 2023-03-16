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
public class LatLng {

    @JsonProperty("latitude")
    Number latitude;

    @JsonProperty("longitude")
    Number longitude;
}
