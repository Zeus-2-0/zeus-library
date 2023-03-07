package com.brihaspathee.zeus.reference.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

//import jakarta.validation.constraints.Null;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, October 2022
 * Time: 4:47 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.reference.data.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class XWalkResponse {

    /**
     * The internal list code
     */
    @JsonProperty(required = false)
    @Schema(description = "The internal list code", example = "SSN", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private String internalListCode;

    /**
     * The name of the internal list type
     */
    @JsonProperty(required = false)
    @Schema(description = "The name of the internal list type", example = "Identifier", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private String internalListTypeName;

    /**
     * The external list code
     */
    @JsonProperty(required = false)
    @Schema(description = "The external list code", example = "34", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private String externalListCode;

    /**
     * The name of the external list type
     */
    @JsonProperty(required = false)
    @Schema(description = "The name of the external list type", example = "Identifier", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private String externalListTypeName;

    /**
     * The name of the external source
     */
    private String externalSourceName;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "XWalkResponse{" +
                ", internalListCode='" + internalListCode + '\'' +
                ", internalListTypeName='" + internalListTypeName + '\'' +
                ", externalListCode='" + externalListCode + '\'' +
                ", externalListTypeName='" + externalListTypeName + '\'' +
                ", externalSourceName='" + externalSourceName + '\'' +
                '}';
    }
}
