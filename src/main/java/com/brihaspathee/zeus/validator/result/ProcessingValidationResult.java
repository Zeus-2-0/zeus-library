package com.brihaspathee.zeus.validator.result;

import com.brihaspathee.zeus.validator.MemberValidationResult;
import com.brihaspathee.zeus.validator.request.ProcessingValidationRequest;
import com.brihaspathee.zeus.validator.rules.RuleResult;
import lombok.*;

import java.util.List;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 03, April 2024
 * Time: 11:27 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.validator
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessingValidationResult {

    /**
     * A unique id that is created as a response for the validation
     */
    private String responseId;

    /**
     * The request payload id for which the response is sent
     */
    private String requestPayloadId;

    /**
     * The validation request for which the results are produced
     */
    private ProcessingValidationRequest validationRequest;

    /**
     * indicates if the validation passed or failed, this will indicate a failure even if
     * one of the rules at the transaction level or at the member level failed
     */
    private boolean validationPassed;

    /**
     * The results of the rules that were executed for the transaction
     */
    private List<RuleResult> ruleResults;

    /**
     * The validation results for the members who are present in the transaction
     */
    private List<MemberValidationResult> memberValidationResults;

    /**
     * The transaction sk for which the validation was done
     */
    private UUID transactionSK;

    /**
     * The account SK in the APS for which the validation was done
     */
    private UUID accountSK;

    @Override
    public String toString() {
        return "ProcessingValidationResult{" +
                "responseId='" + responseId + '\'' +
                ", requestPayloadId='" + requestPayloadId + '\'' +
                ", validationPassed=" + validationPassed +
                ", ruleResults=" + ruleResults +
                ", memberValidationResults=" + memberValidationResults +
                ", transactionSK=" + transactionSK +
                ", accountSK=" + accountSK +
                '}';
    }
}
