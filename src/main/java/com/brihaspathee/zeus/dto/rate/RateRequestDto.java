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
public class RateRequestDto {

    /**
     * Plan Id for which the rate is requested
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
     * The list of member for whom the rates are requested
     */
    private List<MemberRateRequestDto> memberRateRequestDtos;

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "RateRequestDto{" +
                "planId='" + planId + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                ", fipsCode='" + fipsCode + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", memberRateRequestDtos=" + memberRateRequestDtos +
                '}';
    }
}
