package com.brihaspathee.zeus.edi.models.enrollment;

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
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100 {

    /**
     * Contains member demographics
     */
    private Loop2100A memberDemographics;

    /**
     * Contains the incorrect member name and demographics
     */
    private Loop2100B incorrectMemberDemographics;

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

    @Override
    public String toString() {
        return "Loop2100{" +
                "memberDemographics=" + memberDemographics +
                ", incorrectMemberDemographics=" + incorrectMemberDemographics +
                ", employers=" + employers +
                ", schools=" + schools +
                ", custodialParent=" + custodialParent +
                ", responsiblePersons=" + responsiblePersons +
                ", dropOffLocation=" + dropOffLocation +
                '}';
    }
}
