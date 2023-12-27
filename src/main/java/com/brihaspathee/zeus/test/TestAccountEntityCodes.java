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

    /**
     * List of entity codes if any that needs to be created for the account as part of the transaction
     */
    private Map<String, List<String>> entityCodes;

    /**
     * The member entity codes that needs to be created as part of the transaction
     */
    private List<TestMemberEntityCodes> memberEntityCodes;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TestAccountEntityCodes{" +
                "entityCodes=" + entityCodes +
                ", memberEntityCodes=" + memberEntityCodes +
                '}';
    }
}
