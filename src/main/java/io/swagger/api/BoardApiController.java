package io.swagger.api;

import com.fasterxml.jackson.databind.*;
import io.swagger.model.*;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.enums.*;
import io.swagger.v3.oas.annotations.media.*;
import org.slf4j.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.*;
import javax.validation.*;
import javax.validation.constraints.*;
import java.io.*;
import java.util.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-04T12:00:03.264Z[GMT]")
@RestController
public class BoardApiController implements BoardApi {

  private static final Logger log = LoggerFactory.getLogger(BoardApiController.class);

  private final ObjectMapper objectMapper;

  private final HttpServletRequest request;

  @org.springframework.beans.factory.annotation.Autowired
  public BoardApiController(ObjectMapper objectMapper, HttpServletRequest request) {
    this.objectMapper = objectMapper;
    this.request = request;
  }

  public ResponseEntity<List<Board>> boardGet() {
    String accept = request.getHeader("Accept");
    if (accept != null && accept.contains("application/json")) {
      try {
        return new ResponseEntity<List<Board>>(
            objectMapper.readValue(
                "[ {\n  \"boardId\" : 0,\n  \"boardOwner\" : \"boardOwner\",\n  \"boardName\" : \"boardName\"\n}, {\n  \"boardId\" : 0,\n  \"boardOwner\" : \"boardOwner\",\n  \"boardName\" : \"boardName\"\n} ]",
                List.class
            ), HttpStatus.OK);
      } catch (IOException e) {
        log.error("Couldn't serialize response for content type application/json", e);
        return new ResponseEntity<List<Board>>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    return new ResponseEntity<List<Board>>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Board> createTaskBoard(
      @Parameter(
          in = ParameterIn.DEFAULT,
          description = "",
          required = true,
          schema = @Schema())
      @Valid @RequestBody Board body) {
    String accept = request.getHeader("Accept");
    if (accept != null && accept.contains("application/json")) {
      try {
        return new ResponseEntity<Board>(
            objectMapper.readValue(
                "{\n  \"boardId\" : 0,\n  \"boardOwner\" : \"boardOwner\",\n  \"boardName\" : \"boardName\"\n}",
                Board.class
            ), HttpStatus.OK);
      } catch (IOException e) {
        log.error("Couldn't serialize response for content type application/json", e);
        return new ResponseEntity<Board>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    return new ResponseEntity<Board>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Void> deleteBoardById(
      @Parameter(
          in = ParameterIn.PATH,
          description = "The id of the board to delete",
          required = true,
          schema = @Schema())
      @PathVariable("boardId") Integer boardId) {
    String accept = request.getHeader("Accept");
    return new ResponseEntity<Void>(HttpStatus.OK);
  }

  public ResponseEntity<Board> showBoardById(
      @Parameter(
          in = ParameterIn.PATH,
          description = "The id of the board to retrieve",
          required = true,
          schema = @Schema())
      @PathVariable("boardId") Integer boardId) {
    String accept = request.getHeader("Accept");
    if (accept != null && accept.contains("application/json")) {
      try {
        return new ResponseEntity<Board>(objectMapper.readValue(
            "{\n  \"boardId\" : 0,\n  \"boardOwner\" : \"boardOwner\",\n  \"boardName\" : \"boardName\"\n}",
            Board.class
        ), HttpStatus.OK);
      } catch (IOException e) {
        log.error("Couldn't serialize response for content type application/json", e);
        return new ResponseEntity<Board>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    return new ResponseEntity<Board>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<List<Board>> showBoardByName(
      @Size(max = 20)
      @Parameter(
          in = ParameterIn.PATH,
          description = "The (partial) name of the board to retrieve",
          required = true,
          schema = @Schema())
      @PathVariable("boardName") String boardName) {
    String accept = request.getHeader("Accept");
    if (accept != null && accept.contains("application/json")) {
      try {
        return new ResponseEntity<List<Board>>(objectMapper.readValue(
            "[ {\n  \"boardId\" : 0,\n  \"boardOwner\" : \"boardOwner\",\n  \"boardName\" : \"boardName\"\n}, {\n  \"boardId\" : 0,\n  \"boardOwner\" : \"boardOwner\",\n  \"boardName\" : \"boardName\"\n} ]",
            List.class
        ), HttpStatus.OK);
      } catch (IOException e) {
        log.error("Couldn't serialize response for content type application/json", e);
        return new ResponseEntity<List<Board>>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    return new ResponseEntity<List<Board>>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<List<Board>> showBoardByOwner(
      @Size(min = 5, max = 30)
      @Parameter(
          in = ParameterIn.PATH,
          description = "The name of the owners boards to retrieve",
          required = true,
          schema = @Schema())
      @PathVariable("ownerName") String ownerName) {
    String accept = request.getHeader("Accept");
    if (accept != null && accept.contains("application/json")) {
      try {
        return new ResponseEntity<List<Board>>(objectMapper.readValue(
            "[ {\n  \"boardId\" : 0,\n  \"boardOwner\" : \"boardOwner\",\n  \"boardName\" : \"boardName\"\n}, {\n  \"boardId\" : 0,\n  \"boardOwner\" : \"boardOwner\",\n  \"boardName\" : \"boardName\"\n} ]",
            List.class
        ), HttpStatus.OK);
      } catch (IOException e) {
        log.error("Couldn't serialize response for content type application/json", e);
        return new ResponseEntity<List<Board>>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    return new ResponseEntity<List<Board>>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Void> updateBoardById(
      @Parameter(
          in = ParameterIn.DEFAULT,
          description = "",
          required = true,
          schema = @Schema())
      @Valid @RequestBody Board body) {
    String accept = request.getHeader("Accept");
    return new ResponseEntity<Void>(HttpStatus.OK);
  }

}
