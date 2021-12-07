package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Board
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-04T12:00:03.264Z[GMT]")


public class Board   {
  @JsonProperty("boardId")
  private Integer boardId = null;

  @JsonProperty("boardName")
  private String boardName = null;

  @JsonProperty("boardOwner")
  private String boardOwner = null;

  public Board boardId(Integer boardId) {
    this.boardId = boardId;
    return this;
  }

  /**
   * Get boardId
   * @return boardId
   **/
  @Schema(description = "")
  
    public Integer getBoardId() {
    return boardId;
  }

  public void setBoardId(Integer boardId) {
    this.boardId = boardId;
  }

  public Board boardName(String boardName) {
    this.boardName = boardName;
    return this;
  }

  /**
   * Get boardName
   * @return boardName
   **/
  @Schema(description = "")
  
  @Size(min=5,max=20)   public String getBoardName() {
    return boardName;
  }

  public void setBoardName(String boardName) {
    this.boardName = boardName;
  }

  public Board boardOwner(String boardOwner) {
    this.boardOwner = boardOwner;
    return this;
  }

  /**
   * Get boardOwner
   * @return boardOwner
   **/
  @Schema(description = "")
  
  @Size(min=5,max=30)   public String getBoardOwner() {
    return boardOwner;
  }

  public void setBoardOwner(String boardOwner) {
    this.boardOwner = boardOwner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Board board = (Board) o;
    return Objects.equals(this.boardId, board.boardId) &&
        Objects.equals(this.boardName, board.boardName) &&
        Objects.equals(this.boardOwner, board.boardOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardId, boardName, boardOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Board {\n");
    
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardName: ").append(toIndentedString(boardName)).append("\n");
    sb.append("    boardOwner: ").append(toIndentedString(boardOwner)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
