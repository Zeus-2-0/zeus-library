package com.brihaspathee.zeus.message;

import lombok.*;

import java.time.LocalDateTime;

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
public class MessageMetadata {

    /**
     * Source of the message
     */
    private String messageSource;

    /**
     * The destinations for the messages
     */
    private String [] messageDestination;

    /**
     * The time when the message was created
     */
    private LocalDateTime messageCreationTimestamp;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "MessageMetadata{" +
                "messageSource='" + messageSource + '\'' +
                ", messageDestination='" + messageDestination + '\'' +
                ", messageCreationTimestamp='" + messageCreationTimestamp + '\'' +
                '}';
    }
}
