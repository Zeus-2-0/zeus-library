package com.brihaspathee.zeus.test;

import lombok.*;

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

    private String ztcn;

    private TestAccountEntityCodes accountEntityCodes;

    @Override
    public String toString() {
        return "TestTransactionControlNumber{" +
                "ztcn='" + ztcn + '\'' +
                ", accountEntityCodes=" + accountEntityCodes +
                '}';
    }
}
