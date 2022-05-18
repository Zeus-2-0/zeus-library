package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, February 2022
 * Time: 3:13 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PLA {

    private String pla01;

    private String pla02;

    private String pla03;

    private String pla05;

    @Override
    public String toString() {
        return "PLA{" +
                "pla01='" + pla01 + '\'' +
                ", pla02='" + pla02 + '\'' +
                ", pla03='" + pla03 + '\'' +
                ", pla05='" + pla05 + '\'' +
                '}';
    }
}
