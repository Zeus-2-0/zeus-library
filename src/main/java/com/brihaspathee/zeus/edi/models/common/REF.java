package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 9:07 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class REF {

    private String ref01;
    private String ref02;

    @Override
    public String toString() {
        return "REF{" +
                "ref01='" + ref01 + '\'' +
                ", ref02='" + ref02 + '\'' +
                '}';
    }
}
