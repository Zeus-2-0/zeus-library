package com.brihaspathee.zeus.validator;

import com.brihaspathee.zeus.validator.rules.RuleResult;
import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 13, October 2022
 * Time: 2:00 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.validator
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountProcessingResponse {

    /**
     * A unique id that is created as a response for processing the account information
     */
    private String responseId;

    /**
     * The request payload id for which the response is sent
     */
    private String requestPayloadId;

    /**
     * Account number for which the response is created
     */
    private String accountNumber;

    /**
     * indicates if the request received for the account was processed successfully or not
     */
    private boolean processedSuccessfully;

    /**
     * The results of the rules that were executed for the account
     */
    private List<RuleResult> ruleResults;

    /**
     * The validation results for the members who are present in the account
     */
    private List<MemberValidationResult> memberValidationResults;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "AccountProcessingResponse{" +
                "responseId='" + responseId + '\'' +
                ", requestPayloadId='" + requestPayloadId + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", processedSuccessfully=" + processedSuccessfully +
                ", ruleResults=" + ruleResults +
                ", memberValidationResults=" + memberValidationResults +
                '}';
    }
}
