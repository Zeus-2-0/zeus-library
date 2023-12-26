package com.brihaspathee.zeus.test;

import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 25, December 2023
 * Time: 4:32 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.test
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestMemberEntityCodes {

    private String exchangeMemberId;

    private String memberCode;

    private List<String> memberAddressCodes;

    private List<String> memberPhoneCodes;

    private List<String> memberIdentifierCodes;

    private List<String> memberEmailCodes;

    private List<String> memberLanguageCodes;

    @Override
    public String toString() {
        return "TestMemberEntityCodes{" +
                "memberCode='" + memberCode + '\'' +
                ", memberAddressCodes=" + memberAddressCodes +
                ", memberPhoneCodes=" + memberPhoneCodes +
                ", memberIdentifierCodes=" + memberIdentifierCodes +
                ", memberEmailCodes=" + memberEmailCodes +
                ", memberLanguageCodes=" + memberLanguageCodes +
                '}';
    }
}
