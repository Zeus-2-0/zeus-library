package com.brihaspathee.zeus.edi.models.enrollment;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, April 2022
 * Time: 1:46 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop1000 {

    /**
     * Contains the details of the sponsor received in the transaction
     */
    private Loop1000A sponsor;

    /**
     * Contains the details of the payer received in the transaction
     */
    private Loop1000B payer;

    /**
     * Contains the details of the brokers received in the transaction
     */
    @Builder.Default
    private Set<Loop1000C> brokers = new HashSet<>();

    @Override
    public String toString() {
        return "Loop1000{" +
                "sponsor=" + sponsor +
                ", payer=" + payer +
                ", brokers=" + brokers +
                '}';
    }
}
