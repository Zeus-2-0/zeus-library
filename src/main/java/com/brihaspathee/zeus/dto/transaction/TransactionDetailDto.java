package com.brihaspathee.zeus.dto.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.Null;
import java.time.LocalDate;
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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class TransactionDetailDto {

    /**
     * The primary key of the transaction detail
     */
    @JsonProperty(required = false)
    @Schema(description = "Transaction Detail SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID transactionDetailSK;

    /**
     * The transaction associated with the detail
     */
    @JsonProperty(required = true)
    private TransactionDto transaction;

    /**
     * The type of transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The type of transaction", example = "ADD", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String transactionTypeCode;

    /**
     * The plan id received in the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The plan id received in the transaction", example = "67138CA0234501", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String planId;

    /**
     * The csr variant received in the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The csr variant received in the transaction", example = "03", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String csrVariant;

    /**
     * The group policy id received in the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The group policy id received in the transaction", example = "72352456", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String groupPolicyId;

    /**
     * The effective date received in the transaction
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Schema(description = "The effective date received in the transaction", example = "1/1/2021", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate effectiveDate;

    /**
     * The end date received in the transaction
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Schema(description = "The end date received in the transaction", example = "1/31/2021", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate endDate;

    /**
     * The maintenance effective date received in the transaction
     */
    @JsonProperty(required = false)
    @Schema(description = "The maintenance effective date received in the transaction", example = "1/15/2021", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate maintenanceEffectiveDate;


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
        return "TransactionDetailDto{" +
                "transactionDetailSK=" + transactionDetailSK +
                ", transaction=" + transaction +
                ", transactionTypeCode='" + transactionTypeCode + '\'' +
                ", planId='" + planId + '\'' +
                ", csrVariant='" + csrVariant + '\'' +
                ", groupPolicyId='" + groupPolicyId + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", endDate=" + endDate +
                ", maintenanceEffectiveDate=" + maintenanceEffectiveDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
