package com.brihaspathee.zeus.exception;

import com.networknt.schema.ValidationMessage;
import lombok.*;

import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 1:33 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.exception
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZeusApiValidationException extends RuntimeException{

    private String apiName;

    private Set<ValidationMessage> validationMessages;

    public ZeusApiValidationException(String message){
        super(message);
    }

    public ZeusApiValidationException(String message, Throwable cause){
        super(message, cause);
    }

    public ZeusApiValidationException(Set<ValidationMessage> validationMessages, String apiName){
        this.validationMessages = validationMessages;
        this.apiName = apiName;
    }
}
