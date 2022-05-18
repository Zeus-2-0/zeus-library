package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 3:47 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HD {

    private String hd01;
    private String hd03;
    private String hd04;
    private String hd05;
    private String hd09;

    @Override
    public String toString() {
        return "HD{" +
                "hd01='" + hd01 + '\'' +
                ", hd03='" + hd03 + '\'' +
                ", hd04='" + hd04 + '\'' +
                ", hd05='" + hd05 + '\'' +
                ", hd09='" + hd09 + '\'' +
                '}';
    }
}
