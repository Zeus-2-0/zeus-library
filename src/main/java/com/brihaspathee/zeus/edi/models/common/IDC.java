package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, April 2022
 * Time: 11:35 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IDC {

    private String idc01;

    private String idc02;

    private String idc03;

    private String idc04;

    @Override
    public String toString() {
        return "IDC{" +
                "idc01='" + idc01 + '\'' +
                ", idc02='" + idc02 + '\'' +
                ", idc03='" + idc03 + '\'' +
                ", idc04='" + idc04 + '\'' +
                '}';
    }
}
