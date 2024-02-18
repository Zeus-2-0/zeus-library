package com.brihaspathee.zeus.dto.rules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 17, February 2024
 * Time: 8:38 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.dto.rules
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class RuleTypeDto {

    /**
     * The rule type id. This is unique id for the rule type
     */
    @JsonProperty(required = true)
    @Schema(description = "This is unique id for the rule type", example = "GLPSKJXBMPXDVUI",
            required = true, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleTypeId;

    /**
     * The rule type name. This is name for the rule type
     */
    @JsonProperty(required = false)
    @Schema(description = "This is name for the rule type", example = "BUSINESS_RULE",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleTypeName;

    /**
     * A short description for the rule type
     */
    @JsonProperty(required = false)
    @Schema(description = "A short description for the rule type", example = "Business Rules",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleTypeDesc;


    /**
     * The rule sets associated with the rule type
     */
    @JsonProperty(required = false)
    private List<RuleSetDto> ruleSets;

    /**
     * to String method
     * @return
     */
    @Override
    public String toString() {
        return "RuleTypeDto{" +
                "ruleTypeId='" + ruleTypeId + '\'' +
                ", ruleTypeName='" + ruleTypeName + '\'' +
                ", ruleTypeDesc='" + ruleTypeDesc + '\'' +
                ", ruleSets=" + ruleSets +
                '}';
    }
}
