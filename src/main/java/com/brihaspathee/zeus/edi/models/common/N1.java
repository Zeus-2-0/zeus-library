package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, February 2022
 * Time: 2:56 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class N1 {

    private String n101;

    private String n102;

    private String n103;

    private String n104;

    @Override
    public String toString() {
        return "N1{" +
                "n101='" + n101 + '\'' +
                ", n102='" + n102 + '\'' +
                ", n103='" + n103 + '\'' +
                ", n104='" + n104 + '\'' +
                '}';
    }
}
