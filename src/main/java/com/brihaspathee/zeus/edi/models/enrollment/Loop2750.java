package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.DTP;
import com.brihaspathee.zeus.edi.models.common.N1;
import com.brihaspathee.zeus.edi.models.common.REF;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

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
public class Loop2750 {

    /**
     * Name of the reporting category
     */
    private N1 reportingCategory;

    /**
     * Value of the reporting category
     */
    private Set<REF> categoryReference = new HashSet<>();

    /**
     * Effective date for the reporting category
     */
    private DTP categoryDate;

    @Override
    public String toString() {
        return "Loop2750{" +
                "reportingCategory=" + reportingCategory +
                ", categoryReference=" + categoryReference +
                ", categoryDate=" + categoryDate +
                '}';
    }
}
