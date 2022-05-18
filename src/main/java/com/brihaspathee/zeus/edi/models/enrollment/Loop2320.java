package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.COB;
import com.brihaspathee.zeus.edi.models.common.DTP;
import com.brihaspathee.zeus.edi.models.common.REF;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, April 2022
 * Time: 2:13 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 *
 * Contains the data of the co-ordination of benefits
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2320 {

    /**
     * Contains coordination of benefits information
     */
    private COB coordinationOfBenefits;

    /**
     * Ids related to co-ordination of benefits
     */
    private Set<REF> additionalCOBIds = new HashSet<>();

    /**
     * Dates related of co-ordination of benefit dates
     */
    private Set<DTP> cobDates = new HashSet<>();

    /**
     * Entities related to co-ordination of benefits
     */
    private Set<Loop2330> cobRelatedEntities = new HashSet<>();

    @Override
    public String toString() {
        return "Loop2320{" +
                "coordinationOfBenefits=" + coordinationOfBenefits +
                ", additionalCOBIds=" + additionalCOBIds +
                ", cobDates=" + cobDates +
                ", cobRelatedEntities=" + cobRelatedEntities +
                '}';
    }
}
