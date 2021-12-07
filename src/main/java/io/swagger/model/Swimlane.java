package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Swimlane
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-04T12:00:03.264Z[GMT]")


public class Swimlane   {
  @JsonProperty("swimlaneId")
  private Integer swimlaneId = null;

  @JsonProperty("boardId")
  private Integer boardId = null;

  @JsonProperty("swimlaneName")
  private String swimlaneName = null;

  @JsonProperty("swimlanePriority")
  private Integer swimlanePriority = null;

  public Swimlane swimlaneId(Integer swimlaneId) {
    this.swimlaneId = swimlaneId;
    return this;
  }

  /**
   * Get swimlaneId
   * @return swimlaneId
   **/
  @Schema(description = "")
  
    public Integer getSwimlaneId() {
    return swimlaneId;
  }

  public void setSwimlaneId(Integer swimlaneId) {
    this.swimlaneId = swimlaneId;
  }

  public Swimlane boardId(Integer boardId) {
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

  public Swimlane swimlaneName(String swimlaneName) {
    this.swimlaneName = swimlaneName;
    return this;
  }

  /**
   * Get swimlaneName
   * @return swimlaneName
   **/
  @Schema(description = "")
  
  @Size(min=5,max=30)   public String getSwimlaneName() {
    return swimlaneName;
  }

  public void setSwimlaneName(String swimlaneName) {
    this.swimlaneName = swimlaneName;
  }

  public Swimlane swimlanePriority(Integer swimlanePriority) {
    this.swimlanePriority = swimlanePriority;
    return this;
  }

  /**
   * Get swimlanePriority
   * minimum: 0
   * maximum: 100
   * @return swimlanePriority
   **/
  @Schema(description = "")
  
  @Min(0) @Max(100)   public Integer getSwimlanePriority() {
    return swimlanePriority;
  }

  public void setSwimlanePriority(Integer swimlanePriority) {
    this.swimlanePriority = swimlanePriority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Swimlane swimlane = (Swimlane) o;
    return Objects.equals(this.swimlaneId, swimlane.swimlaneId) &&
        Objects.equals(this.boardId, swimlane.boardId) &&
        Objects.equals(this.swimlaneName, swimlane.swimlaneName) &&
        Objects.equals(this.swimlanePriority, swimlane.swimlanePriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(swimlaneId, boardId, swimlaneName, swimlanePriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Swimlane {\n");
    
    sb.append("    swimlaneId: ").append(toIndentedString(swimlaneId)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    swimlaneName: ").append(toIndentedString(swimlaneName)).append("\n");
    sb.append("    swimlanePriority: ").append(toIndentedString(swimlanePriority)).append("\n");
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
