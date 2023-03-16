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
public class UspsData {

    @JsonProperty("standardizedAddress")
    UspsAddress standardizedAddress;

    @JsonProperty("deliveryPointCode")
    String deliveryPointCode;

    @JsonProperty("deliveryPointCheckDigit")
    String deliveryPointCheckDigit;

    @JsonProperty("dpvConfirmation")
    String dpvConfirmation;

    @JsonProperty("dpvFootnote")
    String dpvFootnote;

    @JsonProperty("dpvCmra")
    String dpvCmra;

    @JsonProperty("dpvVacant")
    String dpvVacant;

    @JsonProperty("dpvNoStat")
    String dpvNoStat;

    @JsonProperty("carrierRoute")
    String carrierRoute;

    @JsonProperty("carrierRouteIndicator")
    String carrierRouteIndicator;

    @JsonProperty("ewsNoMatch")
    Boolean ewsNoMatch;

    @JsonProperty("postOfficeCity")
    String postOfficeCity;

    @JsonProperty("postOfficeState")
    String postOfficeState;

    @JsonProperty("abbreviatedCity")
    String abbreviatedCity;

    @JsonProperty("fipsCountyCode")
    String fipsCountyCode;

    @JsonProperty("county")
    String county;

    @JsonProperty("elotNumber")
    String elotNumber;

    @JsonProperty("elotFlag")
    String elotFlag;

    @JsonProperty("lacsLinkReturnCode")
    String lacsLinkReturnCode;

    @JsonProperty("lacsLinkIndicator")
    String lacsLinkIndicator;

    @JsonProperty("poBoxOnlyPostalCode")
    Boolean poBoxOnlyPostalCode;

    @JsonProperty("suitelinkFootnote")
    String suitelinkFootnote;

    @JsonProperty("pmbDesignator")
    String pmbDesignator;

    @JsonProperty("pmbNumber")
    String pmbNumber;

    @JsonProperty("addressRecordType")
    String addressRecordType;

    @JsonProperty("defaultAddress")
    Boolean defaultAddress;

    @JsonProperty("errorMessage")
    String errorMessage;

    @JsonProperty("cassProcessed")
    Boolean cassProcessed;
}
