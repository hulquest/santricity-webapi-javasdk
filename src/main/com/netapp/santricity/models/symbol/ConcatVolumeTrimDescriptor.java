/**************************************************************************************************************************************************************
 *  The Clear BSD License
 *
 *   Copyright (c) – 2016, NetApp, Inc. All rights reserved.
 *
 *   Redistribution and use in source and binary forms, with or without modification, are permitted (subject to the limitations in the disclaimer below) provided that the following conditions are met:
 *
 *   * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 *   * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *   * Neither the name of NetApp, Inc. nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 *
 *   NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *************************************************************************************************************************************************************/


package com.netapp.santricity.models.symbol;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.netapp.santricity.models.v2.*;
import com.netapp.santricity.models.symbol.*;
import com.netapp.santricity.models.utils.*;
import com.netapp.santricity.Pair;
import com.netapp.santricity.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.util.Date;
import java.util.Objects;


/**
 * ConcatVolumeTrimDescriptor
 */
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:46.001-05:00")
public class ConcatVolumeTrimDescriptor   {
  
    private String concatVol;

    private Integer trimCount;

    private Boolean retainRepositoryMembers;

  
  /**
   * The ConcatVolume to trim.
   **/
  public ConcatVolumeTrimDescriptor concatVol(String concatVol) {
    this.concatVol = concatVol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ConcatVolume to trim.")
  @JsonProperty("concatVol")
  public String getConcatVol() {
    return concatVol;
  }
  
  public void setConcatVol(String concatVol) {
    this.concatVol = concatVol;
  }

  
  /**
   * The number of members to remove (starting from the end). Must be less than or equal to the number of current members minus 1.
   **/
  public ConcatVolumeTrimDescriptor trimCount(Integer trimCount) {
    this.trimCount = trimCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of members to remove (starting from the end). Must be less than or equal to the number of current members minus 1.")
  @JsonProperty("trimCount")
  public Integer getTrimCount() {
    return trimCount;
  }
  
  public void setTrimCount(Integer trimCount) {
    this.trimCount = trimCount;
  }

  
  /**
   * An indication of whether the member volumes removed should be deleted or retained.
   **/
  public ConcatVolumeTrimDescriptor retainRepositoryMembers(Boolean retainRepositoryMembers) {
    this.retainRepositoryMembers = retainRepositoryMembers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An indication of whether the member volumes removed should be deleted or retained.")
  @JsonProperty("retainRepositoryMembers")
  public Boolean getRetainRepositoryMembers() {
    return retainRepositoryMembers;
  }
  
  public void setRetainRepositoryMembers(Boolean retainRepositoryMembers) {
    this.retainRepositoryMembers = retainRepositoryMembers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConcatVolumeTrimDescriptor concatVolumeTrimDescriptor = (ConcatVolumeTrimDescriptor) o;
    return Objects.equals(this.concatVol, concatVolumeTrimDescriptor.concatVol) &&
        Objects.equals(this.trimCount, concatVolumeTrimDescriptor.trimCount) &&
        Objects.equals(this.retainRepositoryMembers, concatVolumeTrimDescriptor.retainRepositoryMembers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concatVol, trimCount, retainRepositoryMembers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcatVolumeTrimDescriptor {\n");
    
    sb.append("    concatVol: ").append(toIndentedString(concatVol)).append("\n");
    sb.append("    trimCount: ").append(toIndentedString(trimCount)).append("\n");
    sb.append("    retainRepositoryMembers: ").append(toIndentedString(retainRepositoryMembers)).append("\n");
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

