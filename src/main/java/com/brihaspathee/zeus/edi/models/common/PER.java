package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, February 2022
 * Time: 3:09 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PER {

    private String per01;

    private String per03;

    private String per04;

    private String per05;

    private String per06;

    private String per07;

    private String per08;

    @Override
    public String toString() {
        return "PER{" +
                "per01='" + per01 + '\'' +
                ", per03='" + per03 + '\'' +
                ", per04='" + per04 + '\'' +
                ", per05='" + per05 + '\'' +
                ", per06='" + per06 + '\'' +
                ", per07='" + per07 + '\'' +
                ", per08='" + per08 + '\'' +
                '}';
    }
}
