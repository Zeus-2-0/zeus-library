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
 * Time: 3:30 PM
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
public class RuleTransactionDto {

    /**
     * The type of transaction that the rule should be executed against
     */
    @JsonProperty(required = false)
    @Schema(description = "The type of transaction that the rule should be executed against", example = "ADD",
            required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private String transactionTypeCode;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "RuleTransactionDto{" +
                ", transactionTypeCode='" + transactionTypeCode + '\'' +
                '}';
    }
}
