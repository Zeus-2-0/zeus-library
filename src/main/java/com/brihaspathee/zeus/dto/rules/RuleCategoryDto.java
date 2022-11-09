package com.brihaspathee.zeus.dto.rules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

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
public class RuleCategoryDto {

    /**
     * The rule category id. This is unique id for the rule category
     */
    @JsonProperty(required = true)
    @Schema(description = "This is unique id for the rule category", example = "GLPSKJXBMPXDVUI",
            required = true, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleCategoryId;

    /**
     * The rule category name. This is name for the rule category
     */
    @JsonProperty(required = false)
    @Schema(description = "This is name for the rule category", example = "ACCOUNT",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleCategoryName;

    /**
     * A short description for the rule category
     */
    @JsonProperty(required = false)
    @Schema(description = "A short description for the rule category", example = "Account Rules",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleCategoryDesc;

    /**
     * Identifies the rule types within the category
     */
    @JsonProperty(required = false)
    @Schema(description = "Identifies the rule types within the category", example = "PRE VALIDATION RULE",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleType;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "RuleCategoryDto{" +
                "ruleCategoryId='" + ruleCategoryId + '\'' +
                ", ruleCategoryName='" + ruleCategoryName + '\'' +
                ", ruleCategoryDesc='" + ruleCategoryDesc + '\'' +
                ", ruleType='" + ruleType + '\'' +
                '}';
    }
}
