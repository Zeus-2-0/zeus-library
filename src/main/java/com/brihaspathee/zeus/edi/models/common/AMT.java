package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 18, February 2022
 * Time: 5:00 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AMT {

    private String amt01;

    private String amt02;

    @Override
    public String toString() {
        return "AMT{" +
                "amt01='" + amt01 + '\'' +
                ", amt02='" + amt02 + '\'' +
                '}';
    }
}
