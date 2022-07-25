package com.brihaspathee.zeus.security.model;

import lombok.*;

import java.util.List;

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
public class UserList {

    /**
     * The list of users
     */
    private List<UserDto> userDtos;

    @Override
    public String toString() {
        return "UserList{" +
                "userDtos=" + userDtos +
                '}';
    }
}
