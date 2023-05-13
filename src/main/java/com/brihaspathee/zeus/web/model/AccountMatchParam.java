package com.brihaspathee.zeus.web.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 13, May 2023
 * Time: 7:49 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountMatchParam {

    @NotBlank
    private String accountNumber;

    @NotBlank
    private String exchangeSubscriberId;

    @NotBlank
    private String stateTypeCode;

    @Override
    public String toString() {
        return "AccountMatchParam{" +
                "accountNumber='" + accountNumber + '\'' +
                ", exchangeSubscriberId='" + exchangeSubscriberId + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                '}';
    }
}
