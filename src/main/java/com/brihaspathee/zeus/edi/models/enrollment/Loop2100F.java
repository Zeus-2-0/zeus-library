package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.N3;
import com.brihaspathee.zeus.edi.models.common.N4;
import com.brihaspathee.zeus.edi.models.common.NM1;
import com.brihaspathee.zeus.edi.models.common.PER;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, April 2022
 * Time: 2:12 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 *
 * The loop 2100F contains the custodial parent details
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100F {

    /**
     * Custodial parent name
     */
    private NM1 custodialParentName;

    /**
     * Custodial parent contact details
     */
    private PER custodialParentCommunications;

    /**
     * Custodial Parent address lines
     */
    private N3 custodialParentAddressLine;

    /**
     * Custodial Parent city, state and zip
     */
    private N4 custodialParentCityStateZip;

    @Override
    public String toString() {
        return "Loop2100F{" +
                "custodialParentName=" + custodialParentName +
                ", custodialParentCommunications=" + custodialParentCommunications +
                ", custodialParentAddressLine=" + custodialParentAddressLine +
                ", custodialParentCityStateZip=" + custodialParentCityStateZip +
                '}';
    }
}
