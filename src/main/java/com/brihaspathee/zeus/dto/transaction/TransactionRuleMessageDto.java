package com.brihaspathee.zeus.dto.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

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
public class TransactionRuleMessageDto {

    /**
     * The primary key of the transaction rule
     */
    @JsonProperty(required = false)
    @Schema(description = "Transaction Rule Message SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID transactionRuleMessageSK;

    /**
     * The message code
     */
    @JsonProperty(required = true)
    @Schema(description = "The message code", example = "15000001", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private String messageCode;

    /**
     * The type of message
     */
    @JsonProperty(required = true)
    @Schema(description = "The type of message", example = "CRITICAL", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private String messageTypeCode;

    /**
     * The description of the rule message
     */
    @JsonProperty(required = true)
    @Schema(description = "Short message description", example = "Subscriber not present", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private String messageDesc;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TransactionRuleMessageDto{" +
                "transactionRuleMessageSK=" + transactionRuleMessageSK +
                ", messageCode='" + messageCode + '\'' +
                ", messageTypeCode='" + messageTypeCode + '\'' +
                ", messageDesc='" + messageDesc + '\'' +
                '}';
    }
}
