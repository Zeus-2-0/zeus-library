package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 3:12 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DMG {

    private String dmg01;
    private String dmg02;
    private String dmg03;
    private String dmg04;

    @Builder.Default
    private Set<String> dmg05 = new HashSet<>();

    private String dmg06;
    private String dmg10;
    private String dmg11;

    @Override
    public String toString() {
        return "DMG{" +
                "dmg01='" + dmg01 + '\'' +
                ", dmg02='" + dmg02 + '\'' +
                ", dmg03='" + dmg03 + '\'' +
                ", dmg04='" + dmg04 + '\'' +
                ", dmg05=" + dmg05 +
                ", dmg06='" + dmg06 + '\'' +
                ", dmg10='" + dmg10 + '\'' +
                ", dmg11='" + dmg11 + '\'' +
                '}';
    }
}
