package com.brihaspathee.zeus.edi.models.enrollment;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, April 2022
 * Time: 2:13 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.edi.models.enrollment
 * To change this template use File | Settings | File and Code Template
 *
 * Loop 2300 contains the Health Coverage information
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loop2300 {

    /**
     * Health coverage details
     */
    private HD healthCoverage;

    /**
     * Contains the dates that are related to health coverage
     * 348 - Benefit Begin Date
     * 349 - Benefit End Date
     */
    @Builder.Default
    private Set<DTP> healthCoverageDates = new HashSet<>();

    /**
     * Contains the health coverage policy amounts
     */
    @Builder.Default
    private Set<AMT> healthCoveragePolicyAmounts = new HashSet<>();

    /**
     * Contains the health coverage policy numbers
     * CE - QHP ID
     * 1L - Group/Policy Id
     */
    @Builder.Default
    private Set<REF> healthCoveragePolicyNumbers = new HashSet<>();

    /**
     * Contains prior coverage months
     */
    private REF priorCoverageMonths;

    /**
     * Contains the details of the identification card
     */
    private IDC identificationCard;

    /**
     * Contains the providers
     */
    @Builder.Default
    private Set<Loop2310> providers = new HashSet<>();

    /**
     * Contains the details related to co-ordination of benefits
     */
    @Builder.Default
    private Set<Loop2320> cobs = new HashSet<>();

    @Override
    public String toString() {
        return "Loop2300{" +
                "healthCoverage=" + healthCoverage +
                ", healthCoverageDates=" + healthCoverageDates +
                ", healthCoveragePolicyAmounts=" + healthCoveragePolicyAmounts +
                ", healthCoveragePolicyNumbers=" + healthCoveragePolicyNumbers +
                ", priorCoverageMonths=" + priorCoverageMonths +
                ", identificationCard=" + identificationCard +
                ", providers=" + providers +
                ", cobs=" + cobs +
                '}';
    }
}
