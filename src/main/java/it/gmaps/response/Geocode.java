package it.gmaps.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Geocode {

    @JsonProperty("location")
    LatLng location;

    @JsonProperty("plusCode")
    PlusCode plusCode;

    @JsonProperty("bounds")
    Viewport bounds;

    @JsonProperty("featureSizeMeters")
    Number featureSizeMeters;

    @JsonProperty("placeId")
    String placeId;

    @JsonProperty("placeTypes")
    List<String> placeTypes;

}
