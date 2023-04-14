package com.brihaspathee.zeus.dto.account;

import com.fasterxml.jackson.annotation.JsonFormat;
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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 10, September 2022
 * Time: 6:42 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PremiumSpanDto {

    /**
     * The primary key of the premium span
     */
    @JsonProperty(required = false)
    @Schema(description = "Premium Span SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID premiumSpanSK;

    /**
     * The enrollment span that the premium span is associated
     */
    @JsonProperty(required = false)
    @Schema(description = "Enrollment Span SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private UUID enrollmentSpanSK;

    /**
     * The zeus transaction control number of the transaction that created the premium span
     */
    @JsonProperty(required = true)
    @Schema(description = "The zeus transaction control number of the transaction that created the premium span", example = "SDFG43456DFG23G", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String ztcn;

    /**
     * The unique code of the premium span in MMS
     */
    @JsonProperty(required = true)
    @Schema(description = "Premium Span Code - Unique id that is assigned to the premium span in MMS", example = "DFEV323455DE5S3", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String premiumSpanCode;

    /**
     * The list of members associated with the premium span
     */
    @JsonProperty(required = true)
    private Set<MemberPremiumDto> memberPremiumSpans;

    /**
     * Start date of the premium span
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "The start date of the premium span", example = "1/1/2021", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate startDate;

    /**
     * End date of the premium span
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "The end date of the premium span", example = "1/1/2021", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate endDate;

    /**
     * The status of the premium span
     */
    @JsonProperty(required = false)
    @Schema(description = "Status of the premim span", example = "ACTIVE", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String statusTypeCode;

    /**
     * The CSR Variant associated with the premium span
     */
    @JsonProperty(required = true)
    @Schema(description = "The CSR Variant of the premium span", example = "01", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String csrVariant;

    /**
     * The total premium amount associated with the premium span
     */
    @JsonProperty(required = true)
    @Schema(description = "The total premium amount period of the premium span", example = "150.00", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private BigDecimal totalPremiumAmount;

    /**
     * The total responsible amount associated with the premium span
     */
    @JsonProperty(required = true)
    @Schema(description = "The total responsible amount period of the premium span", example = "150.00", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private BigDecimal totalResponsibleAmount;

    /**
     * The APTC amount associated with the premium span
     */
    @JsonProperty(required = false)
    @Schema(description = "The APTC amount period of the premium span", example = "150.00", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private BigDecimal aptcAmount;

    /**
     * The other pay amount associated with the premium span
     */
    @JsonProperty(required = false)
    @Schema(description = "The other pay amount period of the premium span", example = "150.00", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private BigDecimal otherPayAmount;

    /**
     * The CSR Amount associated with the premium span
     */
    @JsonProperty(required = false)
    @Schema(description = "The CSR amount period of the premium span", example = "150.00", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private BigDecimal csrAmount;

    /**
     * Identifies if the premium span was updated
     */
    @JsonProperty(required = true)
    @Schema(description = "Identifies if the premium span was updated", example = "false", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private AtomicBoolean changed;

    /**
     * The date when the premium span was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the premium span was created", example = "12/15/2021", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the premium span was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the premium span was updated", example = "12/15/2021", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "PremiumSpanDto{" +
                "premiumSpanSK=" + premiumSpanSK +
                ", enrollmentSpanSK=" + enrollmentSpanSK +
                ", ztcn='" + ztcn + '\'' +
                ", premiumSpanCode='" + premiumSpanCode + '\'' +
                ", memberPremiumSpans=" + memberPremiumSpans +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", statusTypeCode='" + statusTypeCode + '\'' +
                ", csrVariant='" + csrVariant + '\'' +
                ", totalPremiumAmount=" + totalPremiumAmount +
                ", totalResponsibleAmount=" + totalResponsibleAmount +
                ", aptcAmount=" + aptcAmount +
                ", otherPayAmount=" + otherPayAmount +
                ", csrAmount=" + csrAmount +
                ", changed=" + changed +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
