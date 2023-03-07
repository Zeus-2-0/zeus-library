package com.brihaspathee.zeus.dto.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

//import jakarta.validation.constraints.Null;
import java.time.LocalDateTime;
import java.util.List;
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
public class TransactionDto {

    /**
     * The primary key of the account
     */
    @JsonProperty(required = false)
    @Schema(description = "Transaction SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID transactionSK;

    /**
     * The zeus transaction control number
     */
    @JsonProperty(required = true)
    @Schema(description = "The zeus transaction control number", example = "DFEV323455DE5S3", required = true, accessMode = Schema.AccessMode.READ_ONLY)
    private String ztcn;

    /**
     * The zeus file control number
     */
    @JsonProperty(required = false)
    @Schema(description = "The zeus file control number", example = "DFEV323455DE5S3", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private String zfcn;

    /**
     * The date and time when the transaction was received
     */
    @JsonProperty(required = false)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="EST" )
    @Schema(description = "The date when the transaction was received", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime transactionReceivedDate;

    /**
     * The source of the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The source of the transaction", example = "MARKETPLACE", required = true, accessMode = Schema.AccessMode.READ_ONLY)
    private String transactionSourceTypeCode;

    /**
     * The transaction details
     */
    @JsonProperty(required = true)
    private TransactionDetailDto transactionDetail;

    /**
     * The status of the transaction
     */
    @JsonProperty(required = false)
    private TransactionStatusDto transactionStatus;

    /**
     * The transaction attributes (reporting categories) received in the transaction
     */
    @JsonProperty(required = false)
    private List<TransactionAttributeDto> transactionAttributes;

    /**
     * The transaction rates received in the transaction
     */
    @JsonProperty(required = false)
    private List<TransactionRateDto> transactionRates;

    /**
     * The trading partner for the transaction
     */
    @JsonProperty(required = true)
    private TransactionTradingPartnerDto tradingPartnerDto;

    /**
     * The sponsor information received in the transaction
     */
    @JsonProperty(required = true)
    private TransactionSponsorDto sponsor;

    /**
     * The broker detail received in the transaction
     */
    @JsonProperty(required = false)
    private TransactionBrokerDto broker;

    /**
     * Payer information received in the transaction
     */
    @JsonProperty(required = true)
    private TransactionPayerDto payer;

    /**
     * List of members in the transaction
     */
    @JsonProperty(required = true)
    private List<TransactionMemberDto> members;

    /**
     * The date when the account was created
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the transaction was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the account was updated
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
        return "TransactionDto{" +
                "transactionSK=" + transactionSK +
                ", ztcn='" + ztcn + '\'' +
                ", zfcn='" + zfcn + '\'' +
                ", transactionReceivedDate=" + transactionReceivedDate +
                ", transactionDetail=" + transactionDetail +
                ", transactionStatus=" + transactionStatus +
                ", transactionAttributes=" + transactionAttributes +
                ", transactionRates=" + transactionRates +
                ", tradingPartnerDto=" + tradingPartnerDto +
                ", sponsor=" + sponsor +
                ", broker=" + broker +
                ", payer=" + payer +
                ", members=" + members +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
