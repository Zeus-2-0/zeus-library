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
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2022
 * Time: 11:56 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.dto.account
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PayerDto {

    /**
     * The primary key of the payer in MMS
     */
    @JsonProperty(required = false)
    @Schema(description = "Payer SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID payerSK;

    /**
     * The account key of the account that the enrollment span is associated with
     */
    @JsonProperty(required = false)
    @Schema(description = "Account SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    @Null
    private UUID accountSK;

    /**
     * The unique code of the payer
     */
    @JsonProperty(required = true)
    @Schema(description = "Payer Code - Unique id that is assigned to the payer in MMS", example = "DFEV323455DE5S3", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String payerCode;

    /**
     * The name of the payer
     */
    @JsonProperty(required = true)
    @Schema(description = "The name of the payer", example = "John Doe", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String payerName;

    /**
     * The id of the payer
     */
    @JsonProperty(required = true)
    @Schema(description = "The id of the payer", example = "923-53-6234", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String payerId;

    /**
     * The zeus transaction control number of the transaction that created the payer
     */
    @JsonProperty(required = false)
    @Schema(description = "The zeus transaction control number of the transaction that created the payer", example = "SDFG43456DFG23G", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String ztcn;

    /**
     * The source of the data
     */
    @JsonProperty(required = true)
    @Schema(description = "The source of the data", example = "MARKETPLACE", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String source;

    /**
     * The start date of the payer
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "Start date of the payer", example = "1/1/2022", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate startDate;

    /**
     * The end date of the payer
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "End date of the payer", example = "12/31/2022", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate endDate;

    /**
     * Identifies if the payer was updated
     */
    @JsonProperty(required = true)
    @Schema(description = "Identifies if the payer was updated", example = "false", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private AtomicBoolean changed;

    /**
     * The date when the account was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the account was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the account was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the account was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "PayerDto{" +
                "payerSK=" + payerSK +
                ", accountSK=" + accountSK +
                ", payerCode='" + payerCode + '\'' +
                ", payerName='" + payerName + '\'' +
                ", payerId='" + payerId + '\'' +
                ", ztcn='" + ztcn + '\'' +
                ", source='" + source + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", changed=" + changed +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
