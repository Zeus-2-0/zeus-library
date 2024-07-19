package com.brihaspathee.zeus.dto.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

//import jakarta.validation.constraints.Null;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 09, September 2022
 * Time: 7:16 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnrollmentSpanDto {

    /**
     * The primary key of the record
     */
    @JsonProperty(required = false)
    @Schema(description = "Enrollment Span SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID enrollmentSpanSK;

    /**
     * The account key of the account that the enrollment span is associated with
     */
    @JsonProperty(required = false)
    @Schema(description = "Account SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", requiredMode = Schema.RequiredMode.NOT_REQUIRED , accessMode = Schema.AccessMode.READ_WRITE)
    @Null
    private UUID accountSK;

    /**
     * The unique code of the enrollment span in MMS
     */
    @JsonProperty(required = false)
    @Schema(description = "Enrollment Span Code - Unique id that is assigned to the enrollment span in MMS", example = "DFEV323455DE5S3", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String enrollmentSpanCode;

    /**
     * The state associated with the enrollment span
     */
    @JsonProperty(required = true)
    @Schema(description = "State associated with the enrollment span", example = "FL", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String stateTypeCode;

    /**
     * The marketplace associated with the enrollment span
     */
    @JsonProperty(required = true)
    @Schema(description = "Marketplace associated with the enrollment span", example = "FFM", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String marketplaceTypeCode;

    /**
     * The business unit associated with the enrollment span
     */
    @JsonProperty(required = true)
    @Schema(description = "Business unit associated with the enrollment span", example = "FL_BU", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String businessUnitTypeCode;

    /**
     * The enrollment type of the enrollment span (ACTIVE or PASSIVE)
     */
    @JsonProperty(required = true)
    @Schema(description = "The enrollment type of the enrollment span", example = "PASSIVE", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String enrollmentType;

    /**
     * The start date of the enrollment span
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "Start date associated with the enrollment span", example = "1/1/2022", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate startDate;

    /**
     * The end date of the enrollment span
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "End date associated with the enrollment span", example = "12/31/2022", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate endDate;

    /**
     * The exchange subscriber id associated with the enrollment span
     */
    @JsonProperty(required = false)
    @Schema(description = "The exchange subscriber id associated with the enrollment span", example = "5236346", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String exchangeSubscriberId;

    /**
     * The effectuation date of the enrollment span
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "Effectuation date associated with the enrollment span", example = "12/14/2021", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate effectuationDate;

    /**
     * The plan id of the enrollment span
     */
    @JsonProperty(required = true)
    @Schema(description = "Plan Id associated with the enrollment span", example = "52345FL424525235", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String planId;

    /**
     * The group policy id of the enrollment span
     */
    @JsonProperty(required = true)
    @Schema(description = "Group policy id associated with the enrollment span", example = "523452345", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String groupPolicyId;

    /**
     * The product type code of the enrollment span
     */
    @JsonProperty(required = true)
    @Schema(description = "Product type code of the plan", example = "HMO", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String productTypeCode;

    /**
     * Identifies the type of coverage for an enrollment span
     */
    @JsonProperty(required = true)
    @Schema(description = "The type of coverage", example = "true", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String coverageTypeCode;

    /**
     * Identifies if the enrollment span is delinquent or not
     */
    @JsonProperty(required = false)
    @Schema(description = "Identifies if the enrollment span is delinquent or not", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private boolean delinqInd;

    /**
     * The paid through date of the enrollment span
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "Paid through date associated with the enrollment span", example = "12/14/2021", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate paidThroughDate;

    /**
     * The claim paid through date of the enrollment span
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "Claim Paid through date associated with the enrollment span", example = "12/14/2021", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate claimPaidThroughDate;

    /**
     * The status of the enrollment span
     */
    @JsonProperty(required = true)
    @Schema(description = "Status of the enrollment span", example = "ENROLLED", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String statusTypeCode;

    /**
     * The effective reason associated with the enrollment span
     */
    @JsonProperty(required = false)
    @Schema(description = "Effective Reason of the enrollment span", example = "MBS", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String effectiveReason;

    /**
     * The term reason associated with the enrollment span
     */
    @JsonProperty(required = false)
    @Schema(description = "Term Reason of the enrollment span", example = "VW", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String termReason;

    /**
     * The zeus transaction control number of the transaction that created the enrollment span
     */
    @JsonProperty(required = false)
    @Schema(description = "The zeus transaction control number of the transaction that created the enrollment span", example = "SDFG43456DFG23G", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String ztcn;

    /**
     * The source of the data
     */
    @JsonProperty(required = true)
    @Schema(description = "The source of the data", example = "MARKETPLACE", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String source;

    /**
     * Identifies if the enrollment span was updated
     */
    @JsonProperty(required = true)
    @Schema(description = "Identifies if the enrollment span was updated", example = "false", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private AtomicBoolean changed;


    /**
     * The date when the enrollment span was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the enrollment span was created", example = "12/15/2021", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the enrollment span was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the enrollment span was updated", example = "12/15/2021", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * The premium spans associated with the enrollment span
     */
    @JsonProperty(required = false)
    private Set<PremiumSpanDto> premiumSpans;

    /**
     * The premium payments associated with the enrollment span
     */
    @JsonProperty(required = false)
    private Set<PremiumPaymentDto> premiumPayments;

    /**
     * toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "EnrollmentSpanDto{" +
                "enrollmentSpanSK=" + enrollmentSpanSK +
                ", accountSK=" + accountSK +
                ", enrollmentSpanCode='" + enrollmentSpanCode + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                ", marketplaceTypeCode='" + marketplaceTypeCode + '\'' +
                ", businessUnitTypeCode='" + businessUnitTypeCode + '\'' +
                ", enrollmentType='" + enrollmentType + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", exchangeSubscriberId='" + exchangeSubscriberId + '\'' +
                ", effectuationDate=" + effectuationDate +
                ", planId='" + planId + '\'' +
                ", groupPolicyId='" + groupPolicyId + '\'' +
                ", productTypeCode='" + productTypeCode + '\'' +
                ", coverageTypeCode='" + coverageTypeCode + '\'' +
                ", delinqInd=" + delinqInd +
                ", paidThroughDate=" + paidThroughDate +
                ", claimPaidThroughDate=" + claimPaidThroughDate +
                ", statusTypeCode='" + statusTypeCode + '\'' +
                ", effectiveReason='" + effectiveReason + '\'' +
                ", termReason='" + termReason + '\'' +
                ", ztcn='" + ztcn + '\'' +
                ", source='" + source + '\'' +
                ", changed=" + changed +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", premiumSpans=" + premiumSpans +
                '}';
    }
}
