package com.brihaspathee.zeus.dto.account;

import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 26, December 2022
 * Time: 7:01 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.dto.account
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentSpanList {

    /**
     * The list of enrollment spans
     */
    private List<EnrollmentSpanDto> enrollmentSpans;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "EnrollmentSpanList{" +
                "enrollmentSpans=" + enrollmentSpans +
                '}';
    }
}
