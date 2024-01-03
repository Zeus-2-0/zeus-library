package com.brihaspathee.zeus.dto.account;

import com.brihaspathee.zeus.edi.models.enrollment.Transaction;
import com.brihaspathee.zeus.test.ZeusTransactionControlNumber;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 07, October 2022
 * Time: 3:30 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RawTransactionDto {

    /**
     * The Zeus transaction control number that is assigned to the transaction
     */
    private String ztcn;

    /**
     * The zeus file control number of the file that the transaction was received
     */
    private String zfcn;

    /**
     * The trading partner id that is associated with the transaction
     */
    private String tradingPartnerId;

    /**
     * The line of business of the transaction
     */
    private String lineOfBusinessTypeCode;

    /**
     * The state of the transaction
     */
    private String stateTypeCode;

    /**
     * The business unit of the transaction
     */
    private String businessUnitTypeCode;

    /**
     * The marketplace type code of the transaction
     */
    private String marketplaceTypeCode;

    /**
     * The transaction that was received from the marketplace
     */
    private Transaction transaction;

    /**
     * The source of the data
     */
    @JsonProperty(required = true)
    @Schema(description = "The source of the data", example = "MARKETPLACE", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String source;

    /**
     * This is used during integration testing to carry all the entity codes that
     * will be created by the test case so that they can be validated
     * This should not be used for production
     */
    private ZeusTransactionControlNumber zeusTransactionControlNumber;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "RawTransactionDto{" +
                "ztcn='" + ztcn + '\'' +
                ", zfcn='" + zfcn + '\'' +
                ", tradingPartnerId='" + tradingPartnerId + '\'' +
                ", lineOfBusinessTypeCode='" + lineOfBusinessTypeCode + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                ", businessUnitTypeCode='" + businessUnitTypeCode + '\'' +
                ", marketplaceTypeCode='" + marketplaceTypeCode + '\'' +
                ", transaction=" + transaction +
                ", zeusTransactionControlNumber=" + zeusTransactionControlNumber +
                '}';
    }
}
