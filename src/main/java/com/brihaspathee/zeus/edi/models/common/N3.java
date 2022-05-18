package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, February 2022
 * Time: 2:58 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class N3 {

    private String n301;

    private String n302;

    @Override
    public String toString() {
        return "N3{" +
                "n301='" + n301 + '\'' +
                ", n302='" + n302 + '\'' +
                '}';
    }
}
