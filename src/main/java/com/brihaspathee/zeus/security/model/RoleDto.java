package com.brihaspathee.zeus.security.model;

import lombok.*;

import java.util.List;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 25, July 2022
 * Time: 6:03 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.security.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {

    /**
     * The unique role id that is associated with the role
     */
    private UUID roleId;

    /**
     * The role name of the role
     */
    private String roleName;

    /**
     * The authorities that are associated with the role
     */
    private List<AuthorityDto> authorityDtos;

    @Override
    public String toString() {
        return "RoleDto{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", authorityDtos=" + authorityDtos +
                '}';
    }
}
