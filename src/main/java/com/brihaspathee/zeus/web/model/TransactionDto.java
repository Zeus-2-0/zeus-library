package com.brihaspathee.zeus.web.model;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 09, October 2022
 * Time: 6:46 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {

    /**
     * The zeus transaction control number associated with the transaction
     */
    private String ztcn;

    /**
     * The zeus file control number of the file in which the transaction was received
     */
    private String zfcn;

    /**
     * The transaction control number received in the file
     */
    private String transactionControlNumber;

    /**
     * The trading partner id associated with the transaction
     */
    private String tradingPartnerId;

    /**
     * The marketplace type code associated with the transaction
     */
    private String marketplaceTypeCode;

    /**
     * The state associated with the transaction
     */
    private String stateTypeCode;

    /**
     * The line of business of the transaction
     */
    private String lineOfBusinessTypeCode;

    /**
     * The business unit type code associated with the transaction
     */
    private String businessUnitTypeCode;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TransactionDto{" +
                "ztcn='" + ztcn + '\'' +
                ", zfcn='" + zfcn + '\'' +
                ", transactionControlNumber='" + transactionControlNumber + '\'' +
                ", tradingPartnerId='" + tradingPartnerId + '\'' +
                ", marketplaceTypeCode='" + marketplaceTypeCode + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                ", lineOfBusinessTypeCode='" + lineOfBusinessTypeCode + '\'' +
                ", businessUnitTypeCode='" + businessUnitTypeCode + '\'' +
                '}';
    }
}
