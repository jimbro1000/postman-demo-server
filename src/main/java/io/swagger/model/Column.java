package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Column
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-04T12:00:03.264Z[GMT]")


public class Column   {
  @JsonProperty("columnId")
  private Integer columnId = null;

  @JsonProperty("boardId")
  private Integer boardId = null;

  @JsonProperty("columnName")
  private String columnName = null;

  @JsonProperty("columnPriority")
  private Integer columnPriority = null;

  public Column columnId(Integer columnId) {
    this.columnId = columnId;
    return this;
  }

  /**
   * Get columnId
   * @return columnId
   **/
  @Schema(description = "")
  
    public Integer getColumnId() {
    return columnId;
  }

  public void setColumnId(Integer columnId) {
    this.columnId = columnId;
  }

  public Column boardId(Integer boardId) {
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

  public Column columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Get columnName
   * @return columnName
   **/
  @Schema(description = "")
  
  @Size(min=5,max=30)   public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public Column columnPriority(Integer columnPriority) {
    this.columnPriority = columnPriority;
    return this;
  }

  /**
   * Get columnPriority
   * minimum: 0
   * maximum: 100
   * @return columnPriority
   **/
  @Schema(description = "")
  
  @Min(0) @Max(100)   public Integer getColumnPriority() {
    return columnPriority;
  }

  public void setColumnPriority(Integer columnPriority) {
    this.columnPriority = columnPriority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Column column = (Column) o;
    return Objects.equals(this.columnId, column.columnId) &&
        Objects.equals(this.boardId, column.boardId) &&
        Objects.equals(this.columnName, column.columnName) &&
        Objects.equals(this.columnPriority, column.columnPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnId, boardId, columnName, columnPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Column {\n");
    
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnPriority: ").append(toIndentedString(columnPriority)).append("\n");
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
