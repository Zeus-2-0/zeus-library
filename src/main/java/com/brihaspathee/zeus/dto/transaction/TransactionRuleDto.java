package com.brihaspathee.zeus.dto.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

import java.util.List;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, February 2024
 * Time: 11:34 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.dto.transaction
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class TransactionRuleDto {

    /**
     * The primary key of the transaction rule
     */
    @JsonProperty(required = false)
    @Schema(description = "Transaction Rule SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID transactionRuleSK;

    /**
     * The id of the rule.
     */
    @JsonProperty(required = true)
    @Schema(description = "The rule id", example = "RWDGS534HGSV4", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String ruleId;

    /**
     * The name of the rule.
     */
    @JsonProperty(required = true)
    @Schema(description = "The rule name", example = "SUBSCRIBER", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String ruleName;

    /**
     * Identifies if the rule passed or failed
     */
    @JsonProperty(required = true)
    @Schema(description = "Boolean that identifies if the rule passed or failed", example = "true", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private boolean rulePassed;

    /**
     * The transaction member code of the member if the rule is a member level rule
     */
    @JsonProperty(required = true)
    @Schema(description = "The member code", example = "RWDGS534HGSV4", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String transactionMemberCode;

    /**
     * The list of messages generated by the rule
     */
    @JsonProperty(required = false)
    @Schema(description = "The list of message created by the rule")
    private List<TransactionRuleMessageDto> transactionRuleMessages;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TransactionRuleDto{" +
                "transactionRuleSK=" + transactionRuleSK +
                ", ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", rulePassed=" + rulePassed +
                ", transactionMemberCode='" + transactionMemberCode + '\'' +
                ", transactionRuleMessages=" + transactionRuleMessages +
                '}';
    }
}