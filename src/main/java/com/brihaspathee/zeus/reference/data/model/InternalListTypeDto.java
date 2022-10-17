package com.brihaspathee.zeus.reference.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.UUID;

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
public class InternalListTypeDto {

    /**
     * The primary key of the account
     */
    @JsonProperty(required = false)
    @Schema(description = "The key of the internal list type", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID internalListTypeSK;

    /**
     * The name of the internal list type
     */
    @JsonProperty(required = true)
    @Schema(description = "Internal list type name", example = "Identifier")
    private String internalListTypeName;

    /**
     * The description of the internal list type
     */
    @JsonProperty(required = false)
    @Schema(description = "Internal list type description", example = "Contains the list of all the internal identifiers")
    private String internalListTypeDesc;

    /**
     * The display name of the list type
     */
    @JsonProperty(required = true)
    @Schema(description = "Display name of the list type", example = "Identifier")
    private String displayName;

    /**
     * The list of codes that are associated with the internal list
     */
    @JsonProperty(required = false)
    @Schema(description = "The list of the internal ref-data codes that are in the internal list")
    private List<InternalRefData> internalRefDataList;
}
