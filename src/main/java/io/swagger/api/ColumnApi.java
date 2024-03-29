/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.30).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Column;
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
public interface ColumnApi {

    @Operation(summary = "Add a column", description = "", tags={ "columns" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Expected response to create request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Column.class))) })
    @RequestMapping(value = "/column",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    ResponseEntity<Column> createNewColumn(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Column body);


    @Operation(summary = "Delete a specific column", description = "", tags={ "columns" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Expected response to a delete request"),
        
        @ApiResponse(responseCode = "404", description = "Column not found") })
    @RequestMapping(value = "/column/{columnId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteColumnById(@Parameter(in = ParameterIn.PATH, description = "the id of the column to delete", required=true, schema=@Schema()) @PathVariable("columnId") Integer columnId);


    @Operation(summary = "Column info for a specific board", description = "", tags={ "columns" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Expected response to a request", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Column.class)))),
        
        @ApiResponse(responseCode = "404", description = "Board not found") })
    @RequestMapping(value = "/column/byBoard/{boardId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Column>> getColumnByBoardId(@Parameter(in = ParameterIn.PATH, description = "the id of the board to find columns against", required=true, schema=@Schema()) @PathVariable("boardId") Integer boardId);


    @Operation(summary = "Info for a specific column", description = "", tags={ "columns" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Expected response to a request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Column.class))),
        
        @ApiResponse(responseCode = "404", description = "Column not found") })
    @RequestMapping(value = "/column/{columnId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Column> getColumnById(@Parameter(in = ParameterIn.PATH, description = "the id of the column to find", required=true, schema=@Schema()) @PathVariable("columnId") Integer columnId);


    @Operation(summary = "Update a column", description = "", tags={ "columns" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Expected response to a valid update request"),
        
        @ApiResponse(responseCode = "400", description = "Invalid column Id supplied"),
        
        @ApiResponse(responseCode = "404", description = "Column not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation error") })
    @RequestMapping(value = "/column",
        consumes = { "*/*" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateColumnById(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Column body);

}

