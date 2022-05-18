package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, February 2022
 * Time: 3:02 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NM1 {

    private String nm101;

    private String nm102;

    private String nm103;

    private String nm104;

    private String nm105;

    private String nm106;

    private String nm107;

    private String nm108;

    private String nm109;

    private String nm110;

    private String nm111;

    private String nm112;

    @Override
    public String toString() {
        return "NM1{" +
                "nm101='" + nm101 + '\'' +
                ", nm102='" + nm102 + '\'' +
                ", nm103='" + nm103 + '\'' +
                ", nm104='" + nm104 + '\'' +
                ", nm105='" + nm105 + '\'' +
                ", nm106='" + nm106 + '\'' +
                ", nm107='" + nm107 + '\'' +
                ", nm108='" + nm108 + '\'' +
                ", nm109='" + nm109 + '\'' +
                ", nm110='" + nm110 + '\'' +
                ", nm111='" + nm111 + '\'' +
                ", nm112='" + nm112 + '\'' +
                '}';
    }
}
