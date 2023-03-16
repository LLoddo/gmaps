package it.gmaps.api;

import it.gmaps.model.Address;
import it.gmaps.model.FormattedAddress;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link AddressApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-16T12:00:33.636+01:00[Europe/Berlin]")
public interface AddressApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /address : Obtain a well-formatted address from gMaps Address Validation API
     * obtain an address
     *
     * @param address address object (required)
     * @return Successful operation (status code 200)
     * @see AddressApi#getFormattedAddress
     */
    default ResponseEntity<FormattedAddress> getFormattedAddress(Address address) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : \"address\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
