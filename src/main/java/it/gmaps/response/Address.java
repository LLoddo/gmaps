package it.gmaps.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import it.gmaps.request.PostalAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @JsonProperty("formattedAddress")
    String formattedAddress;

    @JsonProperty("postalAddress")
    PostalAddress postalAddress;

    @JsonProperty("addressComponents")
    AddressComponent addressComponents;

    @JsonProperty("missingComponentTypes")
    List<String> missingComponentTypes;

    @JsonProperty("unconfirmedComponentTypes")
    List<String> unconfirmedComponentTypes;

    @JsonProperty("unresolvedTokens")
    List<String> unresolvedTokens;

}
