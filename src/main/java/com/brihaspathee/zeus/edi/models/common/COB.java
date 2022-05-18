package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 3:11 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class COB {

    private String cob01;
    private String cob02;
    private String cob03;
    private String cob04;

    @Override
    public String toString() {
        return "COB{" +
                "cob01='" + cob01 + '\'' +
                ", cob02='" + cob02 + '\'' +
                ", cob03='" + cob03 + '\'' +
                ", cob04='" + cob04 + '\'' +
                '}';
    }
}
