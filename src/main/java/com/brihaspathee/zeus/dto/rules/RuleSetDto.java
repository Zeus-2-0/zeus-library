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
 * Date: 09, November 2022
 * Time: 3:29 PM
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
public class RuleSetDto {

    /**
     * The rule set id. This is unique id for the rule set
     */
    @JsonProperty(required = true)
    @Schema(description = "This is unique id for the rule set", example = "GLPSKJXBMPXDVUI",
            required = true, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleSetId;

    /**
     * The rules that belongs to the rule set
     */
    @JsonProperty(required = false)
    private List<RuleDto> rules;

    /**
     * The rule set name. This is name for the rule set
     */
    @JsonProperty(required = false)
    @Schema(description = "This is name for the rule set", example = "Span Rule Set",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleSetName;

    /**
     * A short description for the rule set
     */
    @JsonProperty(required = false)
    @Schema(description = "A short description for the rule set", example = "Rule set for all span rules",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleSetDesc;

    /**
     * Identifies if the rule set is active
     */
    @JsonProperty(required = false)
    @Schema(description = "Identifies if the rule set is active", example = "true",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private boolean active;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "RuleSetDto{" +
                "ruleSetId='" + ruleSetId + '\'' +
                ", ruleSetName='" + ruleSetName + '\'' +
                ", ruleSetDesc='" + ruleSetDesc + '\'' +
                ", active=" + active +
                ", rules=" + rules +
                '}';
    }
}
