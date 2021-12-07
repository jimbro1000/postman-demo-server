package io.swagger.api;

import io.swagger.model.Column;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-04T12:00:03.264Z[GMT]")
@RestController
public class ColumnApiController implements ColumnApi {

    private static final Logger log = LoggerFactory.getLogger(ColumnApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ColumnApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Column> createNewColumn(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Column body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Column>(objectMapper.readValue("{\n  \"columnPriority\" : 14,\n  \"columnId\" : 0,\n  \"boardId\" : 6,\n  \"columnName\" : \"columnName\"\n}", Column.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Column>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Column>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteColumnById(@Parameter(in = ParameterIn.PATH, description = "the id of the column to delete", required=true, schema=@Schema()) @PathVariable("columnId") Integer columnId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Column>> getColumnByBoardId(@Parameter(in = ParameterIn.PATH, description = "the id of the board to find columns against", required=true, schema=@Schema()) @PathVariable("boardId") Integer boardId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Column>>(objectMapper.readValue("[ {\n  \"columnPriority\" : 14,\n  \"columnId\" : 0,\n  \"boardId\" : 6,\n  \"columnName\" : \"columnName\"\n}, {\n  \"columnPriority\" : 14,\n  \"columnId\" : 0,\n  \"boardId\" : 6,\n  \"columnName\" : \"columnName\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Column>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Column>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Column> getColumnById(@Parameter(in = ParameterIn.PATH, description = "the id of the column to find", required=true, schema=@Schema()) @PathVariable("columnId") Integer columnId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Column>(objectMapper.readValue("{\n  \"columnPriority\" : 14,\n  \"columnId\" : 0,\n  \"boardId\" : 6,\n  \"columnName\" : \"columnName\"\n}", Column.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Column>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Column>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateColumnById(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Column body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
