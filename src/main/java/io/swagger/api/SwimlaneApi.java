/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.30).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Swimlane;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-04T12:00:03.264Z[GMT]")
@Validated
public interface SwimlaneApi {

    @Operation(summary = "Add a swimlane", description = "", tags={ "swimlanes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Expected response to create request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Swimlane.class))) })
    @RequestMapping(value = "/swimlane",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    ResponseEntity<Swimlane> createNewSwimlane(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Swimlane body);


    @Operation(summary = "Delete a specific swimlane", description = "", tags={ "swimlanes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Expected response to a delete request"),
        
        @ApiResponse(responseCode = "404", description = "Swimlane not found") })
    @RequestMapping(value = "/swimlane/{swimlaneId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSwimlaneById(@Parameter(in = ParameterIn.PATH, description = "the id of the swimlane to delete", required=true, schema=@Schema()) @PathVariable("swimlaneId") Integer swimlaneId);


    @Operation(summary = "Column info for a specific board", description = "", tags={ "swimlanes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Expected response to a request", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Swimlane.class)))),
        
        @ApiResponse(responseCode = "404", description = "Board not found") })
    @RequestMapping(value = "/swimlane/byBoard/{boardId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Swimlane>> getSwimlaneByBoardId(@Parameter(in = ParameterIn.PATH, description = "the id of the board to find swimlanes against", required=true, schema=@Schema()) @PathVariable("boardId") Integer boardId);


    @Operation(summary = "Info for a specific swimlane", description = "", tags={ "swimlanes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Expected response to a request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Swimlane.class))),
        
        @ApiResponse(responseCode = "404", description = "Swimlane not found") })
    @RequestMapping(value = "/swimlane/{swimlaneId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Swimlane> getSwimlanenById(@Parameter(in = ParameterIn.PATH, description = "the id of the swimlane to find", required=true, schema=@Schema()) @PathVariable("swimlaneId") Integer swimlaneId);


    @Operation(summary = "Update a swimlane", description = "", tags={ "swimlanes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Expected response to a valid update request"),
        
        @ApiResponse(responseCode = "400", description = "Invalid swimlaneId supplied"),
        
        @ApiResponse(responseCode = "404", description = "Swimlane not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation error") })
    @RequestMapping(value = "/swimlane",
        consumes = { "*/*" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateSwimlaneById(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Swimlane body);

}

