package com.brihaspathee.zeus.util;

import java.security.SecureRandom;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 11, June 2022
 * Time: 3:42 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.util
 * To change this template use File | Settings | File and Code Template
 */
public class ZeusRandomStringGenerator {

    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static SecureRandom rnd = new SecureRandom();

    public static String randomString(int len){
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }
}
