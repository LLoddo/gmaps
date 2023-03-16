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
public class AddressComponent {

    @JsonProperty("componentName")
    ComponentName componentName;

    @JsonProperty("componentType")
    String componentType;

    @JsonProperty("confirmationLevel")
    ConfirmationLevel confirmationLevel;

    @JsonProperty("inferred")
    Boolean inferred;

    @JsonProperty("spellCorrected")
    Boolean spellCorrected;

    @JsonProperty("replaced")
    Boolean replaced;

    @JsonProperty("unexpected")
    Boolean unexpected;

}
