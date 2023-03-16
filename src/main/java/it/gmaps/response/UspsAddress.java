package it.gmaps.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UspsAddress {

    @JsonProperty("firstAddressLine")
    String firstAddressLine;

    @JsonProperty("firm")
    String firm;

    @JsonProperty("secondAddressLine")
    String secondAddressLine;

    @JsonProperty("urbanization")
    String urbanization;

    @JsonProperty("cityStateZipAddressLine")
    String cityStateZipAddressLine;

    @JsonProperty("city")
    String city;

    @JsonProperty("state")
    String state;

    @JsonProperty("zipCode")
    String zipCode;

    @JsonProperty("zipCodeExtension")
    String zipCodeExtension;
}
