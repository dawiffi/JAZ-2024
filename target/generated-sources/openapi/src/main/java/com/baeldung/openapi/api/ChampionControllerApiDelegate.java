package com.baeldung.openapi.api;

import com.baeldung.openapi.model.ChampionCreateRequest;
import com.baeldung.openapi.model.ChampionResponse;
import com.baeldung.openapi.model.ChampionUpdateRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link ChampionControllerApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-27T15:51:15.584749800+02:00[Europe/Warsaw]", comments = "Generator version: 7.5.0")
public interface ChampionControllerApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /addChampion
     *
     * @param championCreateRequest  (required)
     * @return OK (status code 200)
     * @see ChampionControllerApi#createChampion
     */
    default ResponseEntity<ChampionResponse> createChampion(ChampionCreateRequest championCreateRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"damage_type\" : \"damage_type\", \"role\" : \"role\", \"name\" : \"name\", \"id\" : 0, \"region\" : \"region\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /deleteChampion/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     * @see ChampionControllerApi#deleteChampion
     */
    default ResponseEntity<Void> deleteChampion(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /getChampion/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     * @see ChampionControllerApi#getChampion
     */
    default ResponseEntity<ChampionResponse> getChampion(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"damage_type\" : \"damage_type\", \"role\" : \"role\", \"name\" : \"name\", \"id\" : 0, \"region\" : \"region\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /getChampions
     *
     * @return OK (status code 200)
     * @see ChampionControllerApi#getChampions
     */
    default ResponseEntity<List<ChampionResponse>> getChampions() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "[ { \"damage_type\" : \"damage_type\", \"role\" : \"role\", \"name\" : \"name\", \"id\" : 0, \"region\" : \"region\" }, { \"damage_type\" : \"damage_type\", \"role\" : \"role\", \"name\" : \"name\", \"id\" : 0, \"region\" : \"region\" } ]";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /updateChampion/{id}
     *
     * @param id  (required)
     * @param championUpdateRequest  (required)
     * @return OK (status code 200)
     * @see ChampionControllerApi#updateChampion
     */
    default ResponseEntity<ChampionResponse> updateChampion(Long id,
        ChampionUpdateRequest championUpdateRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"damage_type\" : \"damage_type\", \"role\" : \"role\", \"name\" : \"name\", \"id\" : 0, \"region\" : \"region\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
