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
 * The loop 2100E contains the member's school details
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100E {

    /**
     * Member's school name
     */
    private NM1 memberSchoolName;

    /**
     * Member's school's contact details
     */
    private PER memberSchoolCommunications;

    /**
     * Member's school's address lines
     */
    private N3 memberSchoolAddressLine;

    /**
     * Member's school's city, state and zip
     */
    private N4 memberSchoolCityStateZip;

    @Override
    public String toString() {
        return "Loop2100E{" +
                "memberSchoolName=" + memberSchoolName +
                ", memberSchoolCommunications=" + memberSchoolCommunications +
                ", memberSchoolAddressLine=" + memberSchoolAddressLine +
                ", memberSchoolCityStateZip=" + memberSchoolCityStateZip +
                '}';
    }
}
