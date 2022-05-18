package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.ACT;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, April 2022
 * Time: 2:01 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop1100C {

    /**
     * Broker account information
     */
    private ACT brokerAccount;

    @Override
    public String toString() {
        return "Loop1100C{" +
                "brokerAccount=" + brokerAccount +
                '}';
    }
}
