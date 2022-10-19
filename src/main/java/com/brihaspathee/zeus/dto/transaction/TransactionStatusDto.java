package com.brihaspathee.zeus.dto.transaction;

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
 * Time: 5:46 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.transaction.dto
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionStatusDto {

    /**
     * The primary key of the transaction status
     */
    @JsonProperty(required = false)
    @Schema(description = "Transaction Status SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID transactionStatusSK;

    /**
     * The status of the transaction
     */
    @JsonProperty(required = true)
    private TransactionDto transaction;

    /**
     * The sequence of the status
     */
    @JsonProperty(required = false)
    @Schema(description = "Sequence of the status", example = "1", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private int statusSequence;

    /**
     * Status of the transaction
     */
    @JsonProperty(required = false)
    @Schema(description = "Status of the transaction", example = "PROCESSED", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private String transactionStatusTypeCode;

    /**
     * Processing status of the transaction
     */
    @JsonProperty(required = false)
    @Schema(description = "Processing status of the transaction", example = "VALIDATION", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private String processingStatusTypeCode;


    /**
     * The date when the record was created
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the record was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the record was updated
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the record was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TransactionStatusDto{" +
                "transactionStatusSK=" + transactionStatusSK +
                ", transaction=" + transaction +
                ", statusSequence=" + statusSequence +
                ", transactionStatusTypeCode='" + transactionStatusTypeCode + '\'' +
                ", processingStatusTypeCode='" + processingStatusTypeCode + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
