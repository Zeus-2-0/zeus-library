package com.brihaspathee.zeus.dto.account;

import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 24, July 2024
 * Time: 8:53 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.dto.account
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentSpanStatusDto {

    /**
     * The enrollment span for which the status is/has to be calculated
     */
    private EnrollmentSpanDto currentEnrollmentSpan;

    /**
     * The enrollment spans that are prior to the current enrollment span
     */
    private List<EnrollmentSpanDto> priorEnrollmentSpans;
}
