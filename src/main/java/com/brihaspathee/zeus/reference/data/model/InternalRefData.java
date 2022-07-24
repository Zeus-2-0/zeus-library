package com.brihaspathee.zeus.reference.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 24, July 2022
 * Time: 6:25 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.reference.data.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InternalRefData {

    /**
     * The internal list code
     */
    private String listCode;

    /**
     * The internal list type of the code
     */
    private InternalListTypeDto listTypeDto;

    /**
     * A short description of the code
     */
    private String listCodeDesc;

    /**
     * The display name of the list code
     */
    @JsonProperty(required = true)
    @Schema(description = "Display name of the list code", example = "Social Security Number")
    private String displayName;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "InternalRefData{" +
                "listCode='" + listCode + '\'' +
                ", listCodeDesc='" + listCodeDesc + '\'' +
                '}';
    }
}
