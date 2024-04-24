package com.brihaspathee.zeus.broker.message.request;

import com.brihaspathee.zeus.dto.account.EnrollmentSpanDto;
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

    private String zrcn;

    private String zrcnTypeCode;

    private String accountNumber;

    private List<EnrollmentSpanDto> enrollmentSpanDtos;
}
