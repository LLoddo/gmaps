package it.gmaps.request;

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
public class PostalAddress {

    @JsonProperty("revision")
    Integer revision;

    @JsonProperty("regionCode")
    String regionCode;

    @JsonProperty("languageCode")
    String languageCode;

    @JsonProperty("postalCode")
    String postalCode;

    @JsonProperty("sortingCode")
    String sortingCode;

    @JsonProperty("administrativeArea")
    String administrativeArea;

    @JsonProperty("locality")
    String locality;

    @JsonProperty("sublocality")
    String sublocality;

    @JsonProperty("addressLines")
    List<String> addressLines;

    @JsonProperty("recipients")
    List<String> recipients;

    @JsonProperty("organization")
    String organization;
}
