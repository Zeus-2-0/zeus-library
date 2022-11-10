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
public class RuleDto {

    /**
     * The rule id. This is unique id for the rule
     */
    @JsonProperty(required = true)
    @Schema(description = "This is unique id for the rule", example = "GLPSKJXBMPXDVUI",
            required = true, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleId;

    /**
     * The list of transaction types for which the rule should be executed
     */
    @JsonProperty(required = false)
    private List<RuleTransactionDto> ruleTransactions;

    /**
     * The rule name. This is name for the rule
     */
    @JsonProperty(required = false)
    @Schema(description = "This is name for the rule", example = "GENDER",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleName;

    /**
     * A short description for the rule
     */
    @JsonProperty(required = false)
    @Schema(description = "A short description for the rule", example = "Validates the gender",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private String ruleDesc;

    /**
     * Identifies if the rule is active
     */
    @JsonProperty(required = false)
    @Schema(description = "Identifies if the rule is active", example = "true",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private boolean active;

    /**
     * Identifies if the rule is at the member level
     */
    @JsonProperty(required = false)
    @Schema(description = "Identifies if the rule is at the member level", example = "true",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private boolean memberLevel;

    private String ruleImplName;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "RuleDto{" +
                "ruleId='" + ruleId + '\'' +
                ", ruleTransactions=" + ruleTransactions +
                ", ruleName='" + ruleName + '\'' +
                ", ruleDesc='" + ruleDesc + '\'' +
                ", active=" + active +
                ", memberLevel=" + memberLevel +
                '}';
    }
}
