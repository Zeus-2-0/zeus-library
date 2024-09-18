package com.brihaspathee.zeus.test;

import com.brihaspathee.zeus.dto.account.PremiumPaymentDto;
import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 25, December 2023
 * Time: 4:29 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.test
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZeusTransactionControlNumber {

    /**
     * Transaction control number received in the test transaction
     */
    private String tcn;

    /**
     * The zeus transaction control number that should be assigned to the transaction
     */
    private String ztcn;

    /**
     * The account entity codes if any that needs to be created as part of the transaction
     */
    private TestAccountEntityCodes accountEntityCodes;

    /**
     * The list of premium payments to be made
     */
    private List<PremiumPaymentDto> premiumPayments;

    /**
     * toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "ZeusTransactionControlNumber{" +
                "tcn='" + tcn + '\'' +
                ", ztcn='" + ztcn + '\'' +
                ", accountEntityCodes=" + accountEntityCodes +
                ", premiumPayments=" + premiumPayments +
                '}';
    }
}
