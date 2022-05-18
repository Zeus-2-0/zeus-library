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
 * Time: 2:11 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 *
 * The loop 2100D contains the member employer information
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100D {

    /**
     * Member's employer name
     */
    private NM1 memberEmployerName;

    /**
     * Member's employer's contact details
     */
    private PER memberEmployerCommunications;

    /**
     * Member's employer's address lines
     */
    private N3 memberEmployerAddressLine;

    /**
     * Member's employer's city, state and zip
     */
    private N4 memberEmployerCityStateZip;

    @Override
    public String toString() {
        return "Loop2100D{" +
                "memberEmployerName=" + memberEmployerName +
                ", memberEmployerCommunications=" + memberEmployerCommunications +
                ", memberEmployerAddressLine=" + memberEmployerAddressLine +
                ", memberEmployerCityStateZip=" + memberEmployerCityStateZip +
                '}';
    }
}
