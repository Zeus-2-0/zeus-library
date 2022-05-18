package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.DMG;
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
 * The 2100B loop contains the incorrect name and demographics of the member
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2100B {

    /**
     * Incorrect Member name
     */
    private NM1 memberName;

    /**
     * Incorrect Member demographics
     */
    private DMG memberDemographics;

    @Override
    public String toString() {
        return "Loop2100B{" +
                "memberName=" + memberName +
                ", memberDemographics=" + memberDemographics +
                '}';
    }
}
