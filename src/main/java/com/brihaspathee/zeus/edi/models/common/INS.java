package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 22, February 2022
 * Time: 2:53 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class INS {

    /**
     * Yes/No Condition or Response Code
     * Code indicating a Yes or No condition or response
     *
     * INS01 indicates status of the insured. A “Y” value indicates the insured
     * is a subscriber: an “N” value indicates the insured is a dependent.
     *
     * N - No
     * Y - Yes
     */
    private String ins01;

    /**
     * Individual Relationship Code
     *
     * Code indicating the relationship between two individuals or entities
     *
     * The value 18 must be used for the subscriber.
     *
     */
    private String ins02;

    /**
     * Maintenance Type Code
     *
     * Code identifying the specific type of item maintenance
     *
     * 001 - Change
     * 021 - Addition
     * 024 - Cancellation or Termination
     * 025 - Reinstatement
     */
    private String ins03;

    /**
     * Maintenance Reason Code
     *
     * Code identifying the reason for the maintenance change
     */
    private String ins04;

    /**
     * Benefit Status Code
     */
    private String ins05;

    /**
     * MEDICARE STATUS CODE
     *
     * To provide Medicare coverage and associated reason for Medicare eligibility
     *
     * Required if a member is being enrolled or disenrolled in Medicare, is currently in Medicare or has terminated
     * or changed their Medicare enrollment.
     */
    private String ins06;

    /**
     * Consolidated Omnibus Budget Reconciliation Act (COBRA) Qualifying
     *
     * A Qualifying Event is any of the following which results in loss of coverage for a
     * Qualified Beneficiary
     */
    private String ins07;

    /**
     * Employment Status Code
     *
     * Code showing the general employment status of an employee/claimant
     *
     * If this insurance enrollment is through a non-employment based
     * program such as Medicare or Medicaid then this data element will
     * contain the status of the subscriber in that program, rather than
     * their employment status. Codes for non-employment based
     * programs will be limited to “AC”, Active and “TE”, Terminated.
     *
     */
    private String ins08;

    /**
     * Student Status Code
     *
     * Code indicating the student status of the patient if 19 years of age or older, not
     * handicapped and not the insured
     */
    private String ins09;

    /**
     * Yes/No Condition or Response Code - Handicap Indicator
     */
    private String ins10;

    /**
     * Insured Death Date Format Qualifier
     *
     * Code indicating the date format, time format, or date and time format
     *
     *
     */
    private String ins11;

    /**
     * Member Individual Death Date
     */
    private String ins12;

    /**
     * Confidentiality Code
     *
     * Code indicating the access to insured information
     *
     * R - Restricted Access
     * U - Unrestricted Access
     *
     */
    private String ins13;

    /**
     * Birth Sequence Number
     */
    private String ins17;

    @Override
    public String toString() {
        return "INS{" +
                "ins01='" + ins01 + '\'' +
                ", ins02='" + ins02 + '\'' +
                ", ins03='" + ins03 + '\'' +
                ", ins04='" + ins04 + '\'' +
                ", ins05='" + ins05 + '\'' +
                ", ins06='" + ins06 + '\'' +
                ", ins07='" + ins07 + '\'' +
                ", ins08='" + ins08 + '\'' +
                ", ins09='" + ins09 + '\'' +
                ", ins10='" + ins10 + '\'' +
                ", ins11='" + ins11 + '\'' +
                ", ins12='" + ins12 + '\'' +
                ", ins13='" + ins13 + '\'' +
                ", ins17='" + ins17 + '\'' +
                '}';
    }
}
