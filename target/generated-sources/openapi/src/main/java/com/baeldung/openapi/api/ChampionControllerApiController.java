package com.baeldung.openapi.api;

import com.baeldung.openapi.model.ChampionCreateRequest;
import com.baeldung.openapi.model.ChampionResponse;
import com.baeldung.openapi.model.ChampionUpdateRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-27T15:51:15.584749800+02:00[Europe/Warsaw]", comments = "Generator version: 7.5.0")
@Controller
@RequestMapping("${openapi.openAPIDefinition.base-path:}")
public class ChampionControllerApiController implements ChampionControllerApi {

    private final ChampionControllerApiDelegate delegate;

    public ChampionControllerApiController(@Autowired(required = false) ChampionControllerApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ChampionControllerApiDelegate() {});
    }

    @Override
    public ChampionControllerApiDelegate getDelegate() {
        return delegate;
    }

}
