package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, February 2022
 * Time: 2:59 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class N4 {

    private String n401;

    private String n402;

    private String n403;

    private String n404;

    private String n405;

    private String n406;

    private String n407;

    @Override
    public String toString() {
        return "N4{" +
                "n401='" + n401 + '\'' +
                ", n402='" + n402 + '\'' +
                ", n403='" + n403 + '\'' +
                ", n404='" + n404 + '\'' +
                ", n405='" + n405 + '\'' +
                ", n406='" + n406 + '\'' +
                ", n407='" + n407 + '\'' +
                '}';
    }
}
