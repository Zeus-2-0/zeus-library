package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 3:17 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EC {

    private String ec01;
    private String ec02;
    private String ec03;

    @Override
    public String toString() {
        return "EC{" +
                "ec01='" + ec01 + '\'' +
                ", ec02='" + ec02 + '\'' +
                ", ec03='" + ec03 + '\'' +
                '}';
    }
}
