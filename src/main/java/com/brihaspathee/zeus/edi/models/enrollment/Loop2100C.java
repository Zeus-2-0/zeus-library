package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.N3;
import com.brihaspathee.zeus.edi.models.common.N4;
import com.brihaspathee.zeus.edi.models.common.NM1;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, April 2022
 * Time: 2:11 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 *
 * The loop 2100C contains the member mailing address
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100C {

    /**
     * Member name for mailing address
     */
    private NM1 memberName;

    /**
     * Address lines for mailing address
     */
    private N3 memberAddressLine;

    /**
     * City, State and Zip of the mailing address
     */
    private N4 memberCityStateZip;

    @Override
    public String toString() {
        return "Loop2100C{" +
                "memberName=" + memberName +
                ", memberAddressLine=" + memberAddressLine +
                ", memberCityStateZip=" + memberCityStateZip +
                '}';
    }
}
