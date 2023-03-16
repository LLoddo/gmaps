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
public class PlusCode {

    @JsonProperty("globalCode")
    String globalCode;

    @JsonProperty("compoundCode")
    String compoundCode;
}
