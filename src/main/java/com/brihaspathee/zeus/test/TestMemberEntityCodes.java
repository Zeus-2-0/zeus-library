package com.brihaspathee.zeus.test;

import lombok.*;

import java.util.List;
import java.util.Map;

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

    /**
     * The exchange member id that is received in the transaction
     */
    private String exchangeMemberId;

    /**
     * The entity codes if any that needs to be created for the member as part of transaction processing
     */
    private Map<String, List<String>> entityCodes;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TestMemberEntityCodes{" +
                "exchangeMemberId='" + exchangeMemberId + '\'' +
                ", entityCodes=" + entityCodes +
                '}';
    }
}
