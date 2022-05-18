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
 * The loop 2100G contains the responsible person details
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100G {

    /**
     * Responsible Person name
     */
    private NM1 responsiblePersonName;

    /**
     * Responsible Person contact details
     */
    private PER responsiblePersonCommunications;

    /**
     * Responsible Person address lines
     */
    private N3 responsiblePersonAddressLine;

    /**
     * Responsible Person city, state and zip
     */
    private N4 responsiblePersonCityStateZip;

    @Override
    public String toString() {
        return "Loop2100G{" +
                "responsiblePersonName=" + responsiblePersonName +
                ", responsiblePersonCommunications=" + responsiblePersonCommunications +
                ", responsiblePersonAddressLine=" + responsiblePersonAddressLine +
                ", responsiblePersonCityStateZip=" + responsiblePersonCityStateZip +
                '}';
    }
}
