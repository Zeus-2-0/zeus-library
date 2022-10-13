package com.brihaspathee.zeus.validator;

import com.brihaspathee.zeus.validator.rules.RuleResult;
import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 13, October 2022
 * Time: 7:25 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.validator
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionValidationResult {

    /**
     * A unique id that is created as a response for the validation
     */
    private String responseId;

    /**
     * The request payload id for which the response is sent
     */
    private String requestPayloadId;

    /**
     * The zeus transaction control number of the transaction
     */
    private String ztcn;

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
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TransactionValidationResult{" +
                "responseId='" + responseId + '\'' +
                ", requestPayloadId='" + requestPayloadId + '\'' +
                ", ztcn='" + ztcn + '\'' +
                ", validationPassed=" + validationPassed +
                ", ruleResults=" + ruleResults +
                ", memberValidationResults=" + memberValidationResults +
                '}';
    }
}
