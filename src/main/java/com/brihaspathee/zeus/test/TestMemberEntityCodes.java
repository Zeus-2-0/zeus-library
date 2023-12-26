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

    private String exchangeMemberId;

    private Map<String, List<String>> entityCodes;

    @Override
    public String toString() {
        return "TestMemberEntityCodes{" +
                "exchangeMemberId='" + exchangeMemberId + '\'' +
                ", entityCodes=" + entityCodes +
                '}';
    }
}
