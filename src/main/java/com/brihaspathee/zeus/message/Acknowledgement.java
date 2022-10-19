package com.brihaspathee.zeus.message;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 11, October 2022
 * Time: 6:23 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.message
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Acknowledgement {

    /**
     * Unique id for the acknowledgment
     */
    private String ackId;

    /**
     * The request payload id for which the acknowledgement is sent
     */
    private String requestPayloadId;
}
