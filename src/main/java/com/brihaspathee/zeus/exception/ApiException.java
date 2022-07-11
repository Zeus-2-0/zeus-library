package com.brihaspathee.zeus.exception;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 11, July 2022
 * Time: 6:57 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.exception
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiException {

    /**
     * The exception code associated with the exception
     */
    private String exceptionCode;

    /**
     * The exception message
     */
    private String exceptionMessage;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "ApiException{" +
                "exceptionCode='" + exceptionCode + '\'' +
                ", exceptionMessage='" + exceptionMessage + '\'' +
                '}';
    }
}
