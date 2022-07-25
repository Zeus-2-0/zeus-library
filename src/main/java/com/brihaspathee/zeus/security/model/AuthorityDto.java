package com.brihaspathee.zeus.security.model;

import lombok.*;

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
public class AuthorityDto {

    /**
     * The unique id that is associated with the authority
     */
    private UUID authorityId;

    /**
     * The permission string of the authority
     */
    private String permission;

    @Override
    public String toString() {
        return "AuthorityDto{" +
                "authorityId=" + authorityId +
                ", permission='" + permission + '\'' +
                '}';
    }
}
