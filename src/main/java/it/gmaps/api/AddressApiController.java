package it.gmaps.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-16T12:00:33.636+01:00[Europe/Berlin]")
@Controller
@RequestMapping("${openapi.gMaps.base-path:/api}")
public class AddressApiController implements AddressApi {

    private final AddressApiDelegate delegate;

    public AddressApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) AddressApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new AddressApiDelegate() {});
    }

    @Override
    public AddressApiDelegate getDelegate() {
        return delegate;
    }

}
