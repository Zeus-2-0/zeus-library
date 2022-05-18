package com.brihaspathee.zeus.edi.models.common;

import com.brihaspathee.zeus.edi.models.enrollment.Transaction;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 3:37 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FunctionalGroup {

    /**
     * Functional Identifier Code
     *
     * Code identifying a group of application related transaction sets
     *
     * This is the 2-character Functional Identifier Code assigned to each
     * transaction set by X12. The specific code for a transaction set
     * defined by this implementation guide is presented in section 1.2,
     * Version Information.
     */
    private String gs01;

    /**
     * Application Sender’s Code
     *
     * Code identifying party sending transmission; codes agreed to by trading partners
     *
     * Use this code to identify the unit sending the information.
     */
    private String gs02;

    /**
     * Application Receiver’s Code
     *
     * Code identifying party receiving transmission; codes agreed to by trading partners
     *
     * Use this code to identify the unit receiving the information.
     */
    private String gs03;

    /**
     * Date
     *
     * Date expressed as CCYYMMDD where CC represents the first two digits of the
     * calendar year
     *
     * Use this date for the functional group creation date.
     */
    private String gs04;

    /**
     * Time
     *
     * Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or
     * HHMMSSD, or HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S =
     * integer seconds (00-59) and DD = decimal seconds; decimal seconds are
     * expressed as follows: D = tenths (0-9) and DD = hundredths (00-99)
     *
     * Use this time for the creation time. The recommended format is
     * HHMM.
     */
    private String gs05;

    /**
     * Group Control Number
     *
     * Assigned number originated and maintained by the sender
     *
     * SEMANTIC: The data interchange control number GS06 in this header must be
     * identical to the same data element in the associated functional group trailer,
     * GE02.
     *
     * For implementations compliant with this guide, GS06 must be
     * unique within a single transmission (that is, within a single ISA to
     * IEA enveloping structure). The authors recommend that GS06 be
     * unique within all transmissions over a period of time to be
     * determined by the sender.
     */
    private String gs06;

    /**
     * Responsible Agency Code
     *
     * Code identifying the issuer of the standard;
     *
     * X - Accredited Standards Committee X12
     */
    private String gs07;

    /**
     * Version / Release / Industry Identifier Code
     *
     * Code indicating the version, release, subrelease, and industry identifier of the EDI
     * standard being used, including the GS and GE segments;
     *
     * 005010X220 - Standards Approved for Publication by ASC X12
     * Procedures Review Board through October 2003
     */
    private String gs08;

    /**
     * Number of Transaction Sets Included
     *
     * Total number of transaction sets included in the functional group or interchange
     * (transmission) group terminated by the trailer containing this data element
     */
    private String ge01;

    /**
     * Group Control Number
     *
     * Assigned number originated and maintained by the sender
     *
     * The data interchange control number GE02 in this trailer must be
     * identical to the same data element in the associated functional group header,
     * GS06.
     */
    private String ge02;

    /**
     * Transaction Sets present in the group
     */
    @Builder.Default
    private Set<Transaction> transactionSet = new HashSet<>();

    /**
     * toString method to display the values
     * @return
     */
    @Override
    public String toString() {
        return "FunctionalGroup{" +
                "gs01='" + gs01 + '\'' +
                ", gs02='" + gs02 + '\'' +
                ", gs03='" + gs03 + '\'' +
                ", gs04='" + gs04 + '\'' +
                ", gs05='" + gs05 + '\'' +
                ", gs06='" + gs06 + '\'' +
                ", gs07='" + gs07 + '\'' +
                ", gs08='" + gs08 + '\'' +
                ", ge01='" + ge01 + '\'' +
                ", ge02='" + ge02 + '\'' +
                ", transactionSet=" + transactionSet +
                '}';
    }
}
