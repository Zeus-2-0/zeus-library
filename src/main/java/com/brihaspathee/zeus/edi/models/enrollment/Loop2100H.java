package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.N3;
import com.brihaspathee.zeus.edi.models.common.N4;
import com.brihaspathee.zeus.edi.models.common.NM1;
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
 * The loop 2100H contains the Drop Off Location details
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100H {

    /**
     * Drop off location name
     */
    private NM1 dropOffLocationName;

    /**
     * Drop off location address lines
     */
    private N3 dropOffLocationAddressLine;

    /**
     * Drop off location city, state and zip
     */
    private N4 dropOffLocationCityStateZip;

    @Override
    public String toString() {
        return "Loop2100H{" +
                "dropOffLocationName=" + dropOffLocationName +
                ", dropOffLocationAddressLine=" + dropOffLocationAddressLine +
                ", dropOffLocationCityStateZip=" + dropOffLocationCityStateZip +
                '}';
    }
}
