package com.brihaspathee.zeus.test;

import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 25, December 2023
 * Time: 4:30 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.test
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestAccountEntityCodes {

    private String accountNumber;

    private String enrollmentSpanCode;

    private List<String> premiumSpanCodes;

    private String brokerCode;

    private String sponsorCode;

    private String payerCode;

    private List<TestMemberEntityCodes> memberEntityCodes;

    @Override
    public String toString() {
        return "TestAccountEntityCodes{" +
                "accountNumber='" + accountNumber + '\'' +
                ", enrollmentSpanCode='" + enrollmentSpanCode + '\'' +
                ", premiumSpanCodes=" + premiumSpanCodes +
                ", brokerCode='" + brokerCode + '\'' +
                ", sponsorCode='" + sponsorCode + '\'' +
                ", payerCode='" + payerCode + '\'' +
                ", memberEntityCodes=" + memberEntityCodes +
                '}';
    }
}
