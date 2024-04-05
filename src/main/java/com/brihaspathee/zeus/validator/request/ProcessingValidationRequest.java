package com.brihaspathee.zeus.validator.request;

import com.brihaspathee.zeus.dto.account.AccountDto;
import com.brihaspathee.zeus.dto.transaction.TransactionDto;
import lombok.*;

import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 03, April 2024
 * Time: 11:28 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.validator.request
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessingValidationRequest {

    /**
     * Transaction for which the validation is requested
     */
    private TransactionDto transactionDto;

    /**
     * Account dto for which the transaction is being processed
     */
    private AccountDto accountDto;

    /**
     * The account SK that identifies the account in APS
     */
    private UUID accountSK;

    /**
     * The request SK that identifies the request in APS
     */
    private UUID processRequestSK;

    /**
     * The request type code
     */
    private String zrcnTypeCode;

    /**
     * The request control number. This will be ztcn for a transaction
     */
    private String zrcn;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "ProcessingValidationRequest{" +
                "transactionDto=" + transactionDto +
                ", accountDto=" + accountDto +
                ", accountSK=" + accountSK +
                ", processRequestSK=" + processRequestSK +
                ", zrcnTypeCode='" + zrcnTypeCode + '\'' +
                ", zrcn='" + zrcn + '\'' +
                '}';
    }
}
