package com.brihaspathee.zeus.dto.rate;

import lombok.*;

import java.util.List;

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
public class RateResponseDto {

    /**
     * Plan Id for which the rate is sent as response
     */
    private String planId;

    /**
     * The state of the member's residential address
     */
    private String stateTypeCode;

    /**
     * The county code the member's residential address
     */
    private String fipsCode;

    /**
     * The zip code of the member residential address
     */
    private String zipCode;

    /**
     * Exception occurred
     */
    private boolean isException;

    /**
     * Exception code indicating the type of exception
     */
    private String exceptionCode;

    /**
     * The list of members with their respective rates
     */
    private List<MemberRateResponseDto> memberRateResponseDtos;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "RateResponseDto{" +
                "planId='" + planId + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                ", fipsCode='" + fipsCode + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", memberRateResponseDtos=" + memberRateResponseDtos +
                '}';
    }
}
