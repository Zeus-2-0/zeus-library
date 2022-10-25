package com.brihaspathee.zeus.dto.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.Null;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 17, October 2022
 * Time: 5:47 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.transaction.dto
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class TransactionAttributeDto {

    /**
     * The primary key of the transaction attribute
     */
    @JsonProperty(required = false)
    @Schema(description = "Transaction attribute SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID transactionAttributeSK;

    /**
     * Transaction in which the attribute was received
     */
    @JsonProperty(required = true)
    private TransactionDto transactionDto;

    /**
     * The transaction attribute type code
     */
    @JsonProperty(required = true)
    @Schema(description = "The transaction attribute type code", example = "AMRC", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String transactionAttributeTypeCode;

    /**
     * The transaction attribute value
     */
    @JsonProperty(required = true)
    @Schema(description = "The transaction attribute value", example = "FINANCIAL CHANGE", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String transactionAttributeValue;

    /**
     * The date when the record was created
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the transaction was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the record was updated
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the transaction was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TransactionAttributeDto{" +
                "transactionAttributeSK=" + transactionAttributeSK +
                ", transactionDto=" + transactionDto +
                ", transactionAttributeTypeCode='" + transactionAttributeTypeCode + '\'' +
                ", transactionAttributeValue='" + transactionAttributeValue + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
