package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.DTP;
import com.brihaspathee.zeus.edi.models.common.INS;
import com.brihaspathee.zeus.edi.models.common.REF;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 9:05 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2000 {

    /**
     * Contains the details of the member
     */
    private INS memberDetail;

    /**
     * Contains different identifiers of the member
     */
    private REF subscriberIdentifier;

    /**
     * The group policy id associated with the member's plan
     */
    private REF groupPolicyId;

    /**
     * Contains other supplmental identifiers of the member
     */
    @Builder.Default
    private Set<REF> memberSupplementalIdentifiers = new HashSet<>();

    /**
     * Contains dates that are related to member
     */
    @Builder.Default
    private Set<DTP> memberLevelDates = new HashSet<>();

    /**
     * Contains member demographics
     */
    private Loop2100A memberDemographics;

    /**
     * Contains the incorrect address of the member
     */
    private Loop2100B incorrectMemberAddress;

    /**
     * Contains the employer details of the member
     */
    @Builder.Default
    private Set<Loop2100D> employers = new HashSet<>();

    /**
     * Contains the set of schools attended by the member
     */
    @Builder.Default
    private Set<Loop2100E> schools = new HashSet<>();

    /**
     * Contains the custodial parent if present for the member
     */
    private Loop2100F custodialParent;

    /**
     * Contains the list of people who are responsible parties for the member
     */
    @Builder.Default
    private Set<Loop2100G> responsiblePersons = new HashSet<>();

    /**
     * Contains the drop off location for the member
     */
    private Loop2100H dropOffLocation;

    /**
     * Contains any disabilities of the member
     */
    @Builder.Default
    private Set<Loop2200> disabilities = new HashSet<>();

    /**
     * Contains health coverage details of the member
     */
    @Builder.Default
    private Set<Loop2300> healthCoverages = new HashSet<>();

    /**
     * Contains the reporting categories received for the member in the transaction
     */
    private Loop2700 reportingCategories;


    @Override
    public String toString() {
        return "Loop2000{" +
                "memberDetail=" + memberDetail +
                ", subscriberIdentifier=" + subscriberIdentifier +
                ", groupPolicyId=" + groupPolicyId +
                ", memberSupplementalIdentifiers=" + memberSupplementalIdentifiers +
                ", memberLevelDates=" + memberLevelDates +
                ", memberDemographics=" + memberDemographics +
                ", incorrectMemberAddress=" + incorrectMemberAddress +
                ", employers=" + employers +
                ", schools=" + schools +
                ", custodialParent=" + custodialParent +
                ", responsiblePersons=" + responsiblePersons +
                ", dropOffLocation=" + dropOffLocation +
                ", disabilities=" + disabilities +
                ", healthCoverages=" + healthCoverages +
                ", reportingCategories=" + reportingCategories +
                '}';
    }
}
