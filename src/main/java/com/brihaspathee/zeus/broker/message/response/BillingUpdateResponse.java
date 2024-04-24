package com.brihaspathee.zeus.broker.message.response;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, April 2024
 * Time: 4:16 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.broker.message.response
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BillingUpdateResponse {

    /**
     * A unique id that is created as a response for processing the account information
     */
    private String responseId;

    /**
     * The request payload id for which the response is sent
     */
    private String requestPayloadId;

    /**
     * Account number for which the response is created.
     */
    private String accountNumber;

    /**
     * Transaction for which the response is created
     */
    private String ztcn;

    /**
     * Response code that indicates if the response is for one of the below
     * 1. Billing Update Completed
     * 2. Billing Update Error
     */
    private String responseCode;

    /**
     * Response message corresponding to the response code
     */
    private String responseMessage;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "BillingUpdateResponse{" +
                "responseId='" + responseId + '\'' +
                ", requestPayloadId='" + requestPayloadId + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", ztcn='" + ztcn + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", responseMessage='" + responseMessage + '\'' +
                '}';
    }
}
