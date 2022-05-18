package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.DSB;
import com.brihaspathee.zeus.edi.models.common.DTP;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, April 2022
 * Time: 2:12 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 *
 * Loop 2200 contains the member's disability information
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2200 {

    /**
     * Disability information of the member
     */
    private DSB disabilityInformation;

    /**
     * Dates of disability eligibility
     */
    @Builder.Default
    private Set<DTP> disabilityEligibilityDates = new HashSet<>();

    @Override
    public String toString() {
        return "Loop2200{" +
                "disabilityInformation=" + disabilityInformation +
                ", disabilityEligibilityDates=" + disabilityEligibilityDates +
                '}';
    }
}
