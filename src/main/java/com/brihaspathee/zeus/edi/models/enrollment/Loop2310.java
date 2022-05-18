package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.*;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, April 2022
 * Time: 2:13 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 *
 * Loop 2310 contains the provider information
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2310 {

    /**
     * Contains a sequence of the provider present in the transaction
     */
    private LX providerInformation;

    /**
     * The name of the provider
     */
    private NM1 providerName;

    /**
     * The address of the provider
     */
    private N3 providerAddress;

    /**
     * The city, state and zip of the provider
     */
    private N4 providerCityStateZip;

    /**
     * Contact information of the provider
     */
    private PER providerCommunications;

    /**
     * Contains the reason for the
     */
    private PLA providerChangeReason;

    @Override
    public String toString() {
        return "Loop2310{" +
                "providerInformation=" + providerInformation +
                ", providerName=" + providerName +
                ", providerAddress=" + providerAddress +
                ", providerCityStateZip=" + providerCityStateZip +
                ", providerCommunications=" + providerCommunications +
                ", providerChangeReason=" + providerChangeReason +
                '}';
    }
}
