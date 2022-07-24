package com.brihaspathee.zeus.reference.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

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
public class InternalListTypesDto {

    /**
     * The list of all the internal lists
     */
    @JsonProperty(required = false)
    @Schema(description = "Contains the list of all the internal reference data lists")
    private List<InternalListTypeDto> internalListTypes;

    /**
     * The to string method
     * @return
     */
    @Override
    public String toString() {
        return "InternalListTypesDto{" +
                "internalListTypes=" + internalListTypes +
                '}';
    }
}
