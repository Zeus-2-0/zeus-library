package com.brihaspathee.zeus.message;

import com.brihaspathee.zeus.web.model.AccountDto;
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
     * Unique id for the message
     */
    private String validationMessageId;

    /**
     * The account that needs to be validated
     */
    private AccountDto accountDto;
}
