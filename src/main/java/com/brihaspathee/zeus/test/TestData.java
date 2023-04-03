package com.brihaspathee.zeus.test;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 26, January 2022
 * Time: 4:26 PM
 * Project: Zeus
 * Package Name: com.zeus.test
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestData<E> {

    /**
     * Unique test case id created for the test case
     */
    private String testCaseId;

    /**
     * A short description of the test case
     */
    private String testCaseDescription;

    /**
     * Test data
     */
    private E testData;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TestData{" +
                "testCaseDescription='" + testCaseDescription + '\'' +
                ", testData=" + testData +
                '}';
    }
}
