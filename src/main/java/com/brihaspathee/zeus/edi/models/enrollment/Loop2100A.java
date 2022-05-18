package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, April 2022
 * Time: 2:11 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 *
 * This 2100A loop contains the details of the member
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100A {

    /**
     * NM1 Segment of the member
     */
    private NM1 memberName;

    /**
     * The communication details of the member
     */
    private PER memberCommunication;

    /**
     * Address Line 1 and Address Line 2 of the address
     */
    private N3 memberAddressLine;

    /**
     * City, State and Zip of the address
     */
    private N4 memberCityStateZip;

    /**
     * Demographic details of the member
     */
    private DMG memberDemographics;

    /**
     * Employment class segment of the member
     */
    @Builder.Default
    private Set<EC> employmentClass = new HashSet<>();

    /**
     * Member Income information
     */
    private ICM memberIncome;

    /**
     * Policy amounts associated with the member
     */
    @Builder.Default
    private Set<AMT> memberPolicyAmounts = new HashSet<>();

    /**
     * Member health information
     */
    private HLH memberHealthInformation;

    /**
     * Language information associated with the member
     */
    private Set<LUI> memberLanguages;

    @Override
    public String toString() {
        return "Loop2100A{" +
                "memberName=" + memberName +
                ", memberCommunication=" + memberCommunication +
                ", memberAddressLine=" + memberAddressLine +
                ", memberCityStateZip=" + memberCityStateZip +
                ", memberDemographics=" + memberDemographics +
                ", employmentClass=" + employmentClass +
                ", memberIncome=" + memberIncome +
                ", memberPolicyAmounts=" + memberPolicyAmounts +
                ", memberHealthInformation=" + memberHealthInformation +
                ", memberLanguages=" + memberLanguages +
                '}';
    }
}
