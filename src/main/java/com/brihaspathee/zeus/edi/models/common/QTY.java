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
public class QTY {

    private String qty01;
    private String qty02;

    @Override
    public String toString() {
        return "QTY{" +
                "qty01='" + qty01 + '\'' +
                ", qty02='" + qty02 + '\'' +
                '}';
    }
}
