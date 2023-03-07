package com.brihaspathee.zeus.dto.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

//import jakarta.validation.constraints.Null;
import java.math.BigDecimal;
import java.time.LocalDate;
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
public class TransactionRateDto {

    /**
     * The primary key of the transaction rate
     */
    @JsonProperty(required = false)
    @Schema(description = "Transaction Rate SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID transactionRateSK;

    /**
     * The transaction associated with the payer
     */
    @JsonProperty(required = true)
    private TransactionDto transaction;

    /**
     * The rate type - E.g. PREAMTOT, APTCAMT etc.
     */
    @JsonProperty(required = true)
    @Schema(description = "The rate type", example = "PREAMTOT", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String rateTypeCode;

    /**
     * The value that was received for the rate type
     */
    @JsonProperty(required = true)
    @Schema(description = "The value that was received for the rate type", example = "155.65", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private BigDecimal transactionRate;

    /**
     * The start date of the rate
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Schema(description = "The start date of the rate", example = "6/1/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate rateStartDate;

    /**
     * The end date of the rate
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Schema(description = "The end date of the rate", example = "8/31/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate rateEndDate;

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
        return "TransactionRateDto{" +
                "transactionRateSK=" + transactionRateSK +
                ", transaction=" + transaction +
                ", rateTypeCode='" + rateTypeCode + '\'' +
                ", transactionRate=" + transactionRate +
                ", rateStartDate=" + rateStartDate +
                ", rateEndDate=" + rateEndDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
