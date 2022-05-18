package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 3:16 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DTP {

    private String dtp01;
    private String dtp02;
    private String dtp03;

    @Override
    public String toString() {
        return "DTP{" +
                "dtp01='" + dtp01 + '\'' +
                ", dtp02='" + dtp02 + '\'' +
                ", dtp03='" + dtp03 + '\'' +
                '}';
    }
}
