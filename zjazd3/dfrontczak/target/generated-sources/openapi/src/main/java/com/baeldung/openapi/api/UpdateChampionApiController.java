package com.baeldung.openapi.api;

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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-19T12:27:40.463677800+02:00[Europe/Warsaw]")
@Controller
@RequestMapping("${openapi.openAPIDefinition.base-path:}")
public class UpdateChampionApiController implements UpdateChampionApi {

    private final UpdateChampionApiDelegate delegate;

    public UpdateChampionApiController(@Autowired(required = false) UpdateChampionApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UpdateChampionApiDelegate() {});
    }

    @Override
    public UpdateChampionApiDelegate getDelegate() {
        return delegate;
    }

}
