package com.brihaspathee.zeus.edi.models.common;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 3:36 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Interchange {

    /**
     * Authorization Information Qualifier
     *
     * Code identifying the type of information in the Authorization Information
     *
     * 00 - No Authorization Information Present
     * 03 - Additional Data Identification
     */
    private String isa01;

    /**
     * Authorization Information
     * Information used for additional identification or authorization of the interchange
     * sender or the data in the interchange; the type of information is set by the
     * Authorization Information Qualifier (I01)
     */
    private String isa02;

    /**
     * Security Information Qualifier
     *
     * Code identifying the type of information in the Security Information
     *
     * 00 - No Security Information Present
     * 01 - Password
     */
    private String isa03;

    /**
     * Security Information
     *
     * This is used for identifying the security information about the interchange sender
     * or the data in the interchange; the type of information is set by the Security
     * Information Qualifier (I03)
     */
    private String isa04;

    /**
     * Interchange ID Qualifier
     *
     * Code indicating the system/method of code structure used to designate the
     * sender or receiver ID element being qualified
     *
     * 01 - Duns (Dun & Bradstreet)
     * 14 - Duns Plus Suffix
     * 20 - Health Industry Number
     * 27 - Carrier Identification Number as assigned by Health Care Financing Administration (HCFA)
     * 28 - Fiscal Intermediary Identification Number as assigned by Health Care Financing Administration (HCFA)
     * 29 - Medicare Provider and Supplier Identification Number as assigned by Health Care Financing Administration (HCFA)
     * 30 - U.S. Federal Tax Identification Number
     * 33 - National Association of Insurance Commissioners Company Code (NAIC)
     * ZZ - Mutually Defined
     *
     */
    private String isa05;

    /**
     * Interchange Sender ID
     *
     * Identification code published by the sender for other parties to use as the receiver
     * ID to route data to them; the sender always codes this value in the sender ID
     * element
     */
    private String isa06;

    /**
     * Interchange ID Qualifier
     *
     * Code indicating the system/method of code structure used to designate the
     * sender or receiver ID element being qualified
     * 01 - Duns (Dun & Bradstreet)
     * 14 - Duns Plus Suffix
     * 20 - Health Industry Number
     * 27 - Carrier Identification Number as assigned by Health Care Financing Administration (HCFA)
     * 28 - Fiscal Intermediary Identification Number as assigned by Health Care Financing Administration (HCFA)
     * 29 - Medicare Provider and Supplier Identification Number as assigned by Health Care Financing Administration (HCFA)
     * 30 - U.S. Federal Tax Identification Number
     * 33 - National Association of Insurance Commissioners Company Code (NAIC)
     * ZZ - Mutually Defined
     */
    private String isa07;

    /**
     * Interchange Receiver ID
     *
     * Identification code published by the receiver of the data; When sending, it is used
     * by the sender as their sending ID, thus other parties sending to them will use this
     * as a receiving ID to route data to them
     */
    private String isa08;

    /**
     * Interchange Date
     *
     * Date of the interchange. The date format is YYMMDD.
     */
    private String isa09;

    /**
     * Interchange Time
     *
     * Time of the interchange. The time format is HHMM.
     */
    private String isa10;

    /**
     * Repetition Separator
     *
     * Type is not applicable; the repetition separator is a delimiter and not a data
     * element; this field provides the delimiter used to separate repeated occurrences
     * of a simple data element or a composite data structure; this value must be
     * different than the data element separator, component element separator, and the
     * segment terminator
     */
    private String isa11;

    /**
     * Interchange Control Version Number
     *
     * Code specifying the version number of the interchange control segments
     *
     * 00501 - Standards Approved for Publication by ASC X12
     * Procedures Review Board through October 2003
     */
    private String isa12;

    /**
     * Interchange Control Number
     *
     * A control number assigned by the interchange sender
     *
     * The Interchange Control Number, ISA13, must be identical to the
     * associated Interchange Trailer IEA02.
     */
    private String isa13;

    /**
     * Acknowledgment Requested
     *
     * Code indicating sender’s request for an interchange acknowledgment
     *
     * 0 - No Interchange Acknowledgment Requested
     * 1 - Interchange Acknowledgment Requested (TA1)
     */
    private String isa14;

    /**
     * Interchange Usage Indicator
     *
     * P - Production Data
     * T - Test Data
     */
    private String isa15;

    /**
     * Component Element Separator
     *
     * Type is not applicable; the component element separator is a delimiter and not a
     * data element; this field provides the delimiter used to separate component data
     * elements within a composite data structure; this value must be different than the
     * data element separator and the segment terminator
     */
    private String isa16;

    /**
     * Number of Included Functional Groups
     *
     * A count of the number of functional groups included in an interchange
     */
    private String iea01;

    /**
     * Interchange Control Number
     *
     * A control number assigned by the interchange sender
     */
    private String iea02;

    /**
     * Functional Groups that are present in the EDI File
     */
    @Builder.Default
    private Set<FunctionalGroup> functionalGroupSet = new HashSet<>();

    @Override
    public String toString() {
        return "Interchange{" +
                "isa01='" + isa01 + '\'' +
                ", isa02='" + isa02 + '\'' +
                ", isa03='" + isa03 + '\'' +
                ", isa04='" + isa04 + '\'' +
                ", isa05='" + isa05 + '\'' +
                ", isa06='" + isa06 + '\'' +
                ", isa07='" + isa07 + '\'' +
                ", isa08='" + isa08 + '\'' +
                ", isa09='" + isa09 + '\'' +
                ", isa10='" + isa10 + '\'' +
                ", isa11='" + isa11 + '\'' +
                ", isa12='" + isa12 + '\'' +
                ", isa13='" + isa13 + '\'' +
                ", isa14='" + isa14 + '\'' +
                ", isa15='" + isa15 + '\'' +
                ", isa16='" + isa16 + '\'' +
                ", iea01='" + iea01 + '\'' +
                ", iea02='" + iea02 + '\'' +
                ", functionalGroupSet=" + functionalGroupSet +
                '}';
    }
}
