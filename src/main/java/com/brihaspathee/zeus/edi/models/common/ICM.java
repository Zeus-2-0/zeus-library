package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, February 2022
 * Time: 2:51 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ICM {

    private String icm01;
    private String icm02;
    private String icm03;
    private String icm04;
    private String icm05;

    @Override
    public String toString() {
        return "ICM{" +
                "icm01='" + icm01 + '\'' +
                ", icm02='" + icm02 + '\'' +
                ", icm03='" + icm03 + '\'' +
                ", icm04='" + icm04 + '\'' +
                ", icm05='" + icm05 + '\'' +
                '}';
    }
}
