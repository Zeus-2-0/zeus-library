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
 * Time: 2:13 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2330 {

    /**
     * Name of the COB Entity
     */
    private NM1 cobRelatedEntity;

    /**
     * Contact of the administration for the COB Entity
     */
    private PER administrationContact;

    /**
     * COB Entity Address Lines
     */
    private N3 cobRelatedEntityAddress;

    /**
     * COB Entity city, state and zip
     */
    private N4 cobRelatedEntityCityStateZip;

    @Override
    public String toString() {
        return "Loop2330{" +
                "cobRelatedEntity=" + cobRelatedEntity +
                ", administrationContact=" + administrationContact +
                ", cobRelatedEntityAddress=" + cobRelatedEntityAddress +
                ", cobRelatedEntityCityStateZip=" + cobRelatedEntityCityStateZip +
                '}';
    }
}
