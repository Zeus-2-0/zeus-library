package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.LE;
import com.brihaspathee.zeus.edi.models.common.LS;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

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
public class Loop2700 {

    /**
     * Start of a reporting categoies
     */
    private LS additionalReportingCategory;

    /**
     * List of all reporting categories
     */
    private Set<Loop2710> reportingCategories = new HashSet<>();

    /**
     * End of all reporting categories
     */
    private LE loopTermination;

    @Override
    public String toString() {
        return "Loop2700{" +
                "additionalReportingCategory=" + additionalReportingCategory +
                ", reportingCategories=" + reportingCategories +
                ", loopTermination=" + loopTermination +
                '}';
    }
}
