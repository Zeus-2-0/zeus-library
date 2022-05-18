package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 3:49 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HLH {

    private String hlh01;
    private String hlh02;
    private String hlh03;

    @Override
    public String toString() {
        return "HLH{" +
                "hlh01='" + hlh01 + '\'' +
                ", hlh02='" + hlh02 + '\'' +
                ", hlh03='" + hlh03 + '\'' +
                '}';
    }
}
