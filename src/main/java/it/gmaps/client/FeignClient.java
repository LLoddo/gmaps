package it.gmaps.client;

import it.gmaps.request.AddressRequest;
import it.gmaps.response.AddressResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.cloud.openfeign.FeignClient("https://addressvalidation.googleapis.com/v1:")
public interface FeignClient {

    @PostMapping(value = "validateAddress")
    AddressResponse postValidateAddress(@RequestBody AddressRequest addressRequest, @RequestParam String key);

}
