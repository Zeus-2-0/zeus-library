package com.brihaspathee.zeus.broker.message.request;

import com.brihaspathee.zeus.dto.account.AccountDto;
import com.brihaspathee.zeus.dto.account.EnrollmentSpanDto;
import jakarta.validation.Constraint;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, April 2024
 * Time: 4:16 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.broker.message.request
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BillingUpdateRequest {

    /**
     * The request control number
     * If the update is made from a transaction this will be ztcn (Zeus Transaction control number)
     */
    @NotNull
    @Size(min = 15)
    private String zrcn;

    /**
     * This is the type code indicating the type of request
     */
    @NotNull
    private String zrcnTypeCode;

    /**
     * The account that is getting updated
     */
    @NotNull
    private AccountDto accountDto;
}
