package com.brihaspathee.zeus.dto.account;

import lombok.*;

import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 16, September 2022
 * Time: 7:32 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberList {

    /**
     * List of all the member dtos
     */
    private Set<MemberDto> memberDtos;
}
