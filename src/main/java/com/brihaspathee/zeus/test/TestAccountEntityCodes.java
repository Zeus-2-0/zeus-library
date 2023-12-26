package com.brihaspathee.zeus.test;

import lombok.*;

import java.util.List;
import java.util.Map;

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

    private Map<String, List<String>> entityCodes;

    private List<TestMemberEntityCodes> memberEntityCodes;

    @Override
    public String toString() {
        return "TestAccountEntityCodes{" +
                "entityCodes=" + entityCodes +
                ", memberEntityCodes=" + memberEntityCodes +
                '}';
    }
}
