package com.brihaspathee.zeus.dto.rate;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 24, January 2024
 * Time: 12:10 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.dto.rate
 * To change this template use File | Settings | File and Code Template
 */
@Setter
@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class MemberRateRequestDto {

    /**
     * Unique code that identifies the member in the source system
     * This will be returned in the response with the rate for the member
     */
    private String memberRateCode;

    /**
     * The first name of the member
     */
    private String firstName;

    /**
     * The last name of the member
     */
    private String lastName;

    /**
     * The relationship of the member with HOH
     */
    private String relationshipTypeCode;

    /**
     * The age of the member
     */
    private int age;

    /**
     * The gender of the member
     */
    private String genderTypeCode;

    /**
     * Identifies if the member uses tobacco
     */
    private boolean tobaccoInd;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "MemberRateRequestDto{" +
                "memberRateCode='" + memberRateCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", relationshipTypeCode='" + relationshipTypeCode + '\'' +
                ", age=" + age +
                ", genderTypeCode='" + genderTypeCode + '\'' +
                ", tobaccoInd=" + tobaccoInd +
                '}';
    }
}
