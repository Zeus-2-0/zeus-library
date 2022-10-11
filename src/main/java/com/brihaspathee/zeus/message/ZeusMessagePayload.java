package com.brihaspathee.zeus.message;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 20, June 2022
 * Time: 8:45 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.message
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ZeusMessagePayload<T> {

    /**
     * Metadata details of the payload
     */
    private MessageMetadata messageMetadata;

    /**
     * Unique payload id for the payload
     */
    private String payloadId;

    /**
     * The payload that is to be transmitted
     */
    private T payload;

}
