package com.brihaspathee.zeus.reference.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, October 2022
 * Time: 4:58 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.reference.data.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class XWalkRequest {

    /**
     * The list code for which the cross walk value is requested
     */
    @JsonProperty(required = true)
    @Schema(description = "The internal or external ref data code for which the cross walk value is requested", example = "SSN")
    @NotNull
    @NotBlank
    private String listCode;

    /**
     * The name of the list type that the code is associated
     */
    @JsonProperty(required = true)
    @Schema(description = "The name of the list type that the code is associated. If the XWALK from external to internal " +
            "then this is external list type name, if from internal to external then this is " +
            "internal list type name", example = "Identifier")
    @NotNull
    @NotBlank
    private String listTypeName;

    /**
     * The name of the external source that is involved in the cross-walk
     */
    @JsonProperty(required = true)
    @Schema(description = "The name of the external source that is involved in the cross-walk", example = "Identifier")
    @NotNull
    @NotBlank
    private String externalSourceName;

    /**
     * The toString method
     * @return
     */
    @Override
    public String toString() {
        return "XWalkRequest{" +
                "listCode='" + listCode + '\'' +
                ", externalListTypeName='" + listTypeName + '\'' +
                ", externalSourceName='" + externalSourceName + '\'' +
                '}';
    }
}
