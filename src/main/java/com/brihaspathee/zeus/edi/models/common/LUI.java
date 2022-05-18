package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, February 2022
 * Time: 2:55 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LUI {

    private String lui01;
    private String lui02;
    private String lui03;
    private String lui04;

    @Override
    public String toString() {
        return "LUI{" +
                "lui01='" + lui01 + '\'' +
                ", lui02='" + lui02 + '\'' +
                ", lui03='" + lui03 + '\'' +
                ", lui04='" + lui04 + '\'' +
                '}';
    }
}
