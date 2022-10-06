package com.brihaspathee.zeus.validator;

import com.brihaspathee.zeus.validator.rules.RuleResult;
import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 06, October 2022
 * Time: 2:06 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.validator
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberValidationResult {

    /**
     * The member code that uniquely identifies the member
     */
    private String memberCode;

    /**
     * The list of rules that were executed for the member and the results of the same
     */
    private List<RuleResult> ruleResults;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "MemberValidationResult{" +
                "memberCode='" + memberCode + '\'' +
                ", ruleResults=" + ruleResults +
                '}';
    }
}
