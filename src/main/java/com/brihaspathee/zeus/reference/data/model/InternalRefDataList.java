package com.brihaspathee.zeus.reference.data.model;

import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 24, July 2022
 * Time: 6:26 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.reference.data.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InternalRefDataList {

    /**
     * The list of internal ref data codes
     */
    private List<InternalRefData> internalRefDataList;

    /**
     * to String method
     * @return
     */
    @Override
    public String toString() {
        return "InternalReferenceDataList{" +
                "internalRefDataList=" + internalRefDataList +
                '}';
    }
}
