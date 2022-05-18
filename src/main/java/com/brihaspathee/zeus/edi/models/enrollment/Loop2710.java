package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.LX;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, April 2022
 * Time: 2:14 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2710 {

    /**
     * Start of a reporting category
     */
    private LX reportingCategory;

    /**
     * Details of a reporting category
     */
    private Loop2750 reportingCategoryDetails;

    @Override
    public String toString() {
        return "Loop2710{" +
                "reportingCategory=" + reportingCategory +
                ", reportingCategoryDetails=" + reportingCategoryDetails +
                '}';
    }
}
