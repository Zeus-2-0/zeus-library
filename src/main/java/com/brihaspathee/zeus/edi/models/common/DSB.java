package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 3:14 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DSB {

    private String dsb01;

    private String dsb07;

    private String dsb08;

    @Override
    public String toString() {
        return "DSB{" +
                "dsb01='" + dsb01 + '\'' +
                ", dsb07='" + dsb07 + '\'' +
                ", dsb08='" + dsb08 + '\'' +
                '}';
    }
}
