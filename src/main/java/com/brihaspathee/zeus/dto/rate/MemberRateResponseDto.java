package com.brihaspathee.zeus.dto.rate;

import lombok.*;

import java.math.BigDecimal;

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
public class MemberRateResponseDto {

    /**
     * Unique code that identifies the member in the source system
     * This will be returned in the response with the rate for the member
     */
    private String memberRateCode;

    /**
     * The member rate
     */
    private BigDecimal memberRate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "MemberRateResponseDto{" +
                "memberRateCode='" + memberRateCode + '\'' +
                ", memberRate=" + memberRate +
                '}';
    }
}
