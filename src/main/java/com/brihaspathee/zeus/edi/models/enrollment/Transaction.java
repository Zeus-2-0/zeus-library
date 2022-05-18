package com.brihaspathee.zeus.edi.models.enrollment;

import com.brihaspathee.zeus.edi.models.common.BGN;
import com.brihaspathee.zeus.edi.models.common.DTP;
import com.brihaspathee.zeus.edi.models.common.QTY;
import com.brihaspathee.zeus.edi.models.common.REF;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 3:39 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.common
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    /**
     * Sequence of the transaction in the EDI file
     */
    private int transactionSequence;

    /**
     * Transaction Set Identifier Code
     *
     * Code uniquely identifying a Transaction Set
     *
     * The transaction set identifier (ST01) is used by the translation routines
     * of the interchange partners to select the appropriate transaction set definition
     * (e.g., 810 selects the Invoice Transaction Set).
     *
     * 834 - Benefit Enrollment and Maintenance
     */
    private String st01;

    /**
     * Transaction Set Control Number
     *
     * Identifying control number that must be unique within the transaction set
     * functional group assigned by the originator for a transaction set
     *
     * The Transaction Set Control Number in ST02 and SE02 must be
     * identical. The number must be unique within a specific interchange
     * (ISA-IEA), but can repeat in other interchanges.
     */
    private String st02;

    /**
     * Implementation Convention Reference
     *
     * Reference assigned to identify Implementation Convention
     *
     * The implementation convention reference (ST03) is used by the
     * translation routines of the interchange partners to select the appropriate
     * implementation convention to match the transaction set definition. When used,
     * this implementation convention reference takes precedence over the
     * implementation reference specified in the GS08.
     */
    private String st03;

    /**
     * Indicates the beginning of a transaction set
     */
    private BGN beginningSegment;

    /**
     * The definition of the Master Policy Number is determined by the
     * issuer of the policy, the Payer/Plan Administrator. The Master Policy
     * Number may be used to meet various business needs such as
     * indicating the line of business under which the policy is defined.
     */
    private REF transactionSetPolicyNumber;

    /**
     * Required when specified in the contract. If not required by this
     * implementation guide, do not send.
     */
    @Builder.Default
    private Set<DTP> fileEffectiveDates = new HashSet<>();

    /**
     * Required when the contract or trading partner agreement specifies that
     * this information be included in the transaction set. If not required by this
     * implementation guide, do not send.
     */
    @Builder.Default
    private Set<QTY> transactionSetControls = new HashSet<>() ;

    /**
     * EDI Loop1000A contains the sponsor information
     */
    private Loop1000A sponsor;

    /**
     * EDI Loop1000B contains the payer information
     */
    private Loop1000B payer;

    /**
     * Loop1000C contains the broker information
     */
    @Builder.Default
    private Set<Loop1000C> brokers = new HashSet<>() ;

    /**
     * Loop2000 contains the list of members present in the transaction
     */
    @Builder.Default
    private Set<Loop2000> members = new HashSet<>() ;

    /**
     * Number of Included Segments
     *
     * Total number of segments included in a transaction set including ST and SE
     * segments
     */
    private String se01;

    /**
     * Transaction Set Control Number
     *
     * Identifying control number that must be unique within the transaction set
     * functional group assigned by the originator for a transaction set
     *
     * The transaction set control numbers in ST02 and SE02 must be
     * identical.
     */
    private String se02;

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionSequence=" + transactionSequence +
                ", st01='" + st01 + '\'' +
                ", st02='" + st02 + '\'' +
                ", st03='" + st03 + '\'' +
                ", beginningSegment=" + beginningSegment +
                ", transactionSetPolicyNumber=" + transactionSetPolicyNumber +
                ", fileEffectiveDates=" + fileEffectiveDates +
                ", transactionSetControls=" + transactionSetControls +
                ", sponsor=" + sponsor +
                ", payer=" + payer +
                ", brokers=" + brokers +
                ", members=" + members +
                ", se01='" + se01 + '\'' +
                ", se02='" + se02 + '\'' +
                '}';
    }
}
