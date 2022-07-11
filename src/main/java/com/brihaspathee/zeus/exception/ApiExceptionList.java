package com.brihaspathee.zeus.exception;

import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 11, July 2022
 * Time: 6:58 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.exception
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiExceptionList {

    /**
     * The list of exceptions
     */
    private List<ApiException> exceptions;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "ApiExceptionList{" +
                "exceptions=" + exceptions +
                '}';
    }
}
