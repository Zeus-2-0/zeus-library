package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 18, February 2022
 * Time: 4:59 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ACT {

    private String act01;

    private String act06;

    @Override
    public String toString() {
        return "ACT{" +
                "act01='" + act01 + '\'' +
                ", act06='" + act06 + '\'' +
                '}';
    }
}
