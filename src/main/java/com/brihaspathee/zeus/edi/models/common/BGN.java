package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 3:09 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BGN {

    private String bgn01;
    private String bgn02;
    private String bgn03;
    private String bgn04;
    private String bgn05;
    private String bgn06;
    private String bgn08;

    @Override
    public String toString() {
        return "BGN{" +
                "bgn01='" + bgn01 + '\'' +
                ", bgn02='" + bgn02 + '\'' +
                ", bgn03='" + bgn03 + '\'' +
                ", bgn04='" + bgn04 + '\'' +
                ", bgn05='" + bgn05 + '\'' +
                ", bgn06='" + bgn06 + '\'' +
                ", bgn08='" + bgn08 + '\'' +
                '}';
    }
}
