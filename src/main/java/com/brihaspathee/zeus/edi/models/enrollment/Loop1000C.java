package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.N1;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 9:05 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop1000C {

    /**
     * Contains the broker information
     */
    private N1 broker;

    /**
     * Contains the broker account details
     */
    private Loop1100C accountDetails;

    @Override
    public String toString() {
        return "Loop1000C{" +
                "broker=" + broker +
                ", accountDetails=" + accountDetails +
                '}';
    }
}
