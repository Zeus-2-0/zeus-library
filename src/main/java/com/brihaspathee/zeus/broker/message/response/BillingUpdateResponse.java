package com.brihaspathee.zeus.broker.message.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import jakarta.validation.Constraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotNull(message = "The response id cannot be null")
    @NotBlank(message = "The response id cannot be blank")
    @JsonPropertyDescription("The response id of the payload")
    private String responseId;

    /**
     * The request payload id for which the response is sent
     */
    @NotNull(message = "The request payload id cannot be null")
    @NotBlank(message = "The request payload if cannot be blank")
    @JsonPropertyDescription("The request payload id for which the response is created")
    private String requestPayloadId;

    /**
     * Account number for which the response is created.
     */
    @NotNull(message = "The account number cannot be null")
    @NotBlank(message = "The account number cannot be blank")
    @JsonPropertyDescription("The account number for which the response is created")
    private String accountNumber;

    /**
     * Transaction for which the response is created
     */
    @JsonProperty("The Zeus Transaction Control Number of the transaction for which the response is created")
    private String ztcn;

    /**
     * Response code that indicates if the response is for one of the below
     * 1. Billing Update Completed
     * 2. Billing Update Error
     */
    @NotNull(message = "Response code cannot be null")
    @NotBlank(message = "Response code cannot be blank")
    @Size(min = 2, max = 20)
    private String responseCode;

    /**
     * Response message corresponding to the response code
     */
    @NotNull
    @NotBlank
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
