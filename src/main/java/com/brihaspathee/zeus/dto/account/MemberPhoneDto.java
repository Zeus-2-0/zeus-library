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
 * Date: 10, September 2022
 * Time: 10:11 AM
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
public class MemberPhoneDto {

    /**
     * The primary key of the member phone
     */
    @JsonProperty(required = false)
    @Schema(description = "Member Phone SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID memberPhoneSK;

    /**
     * The primary key of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "Member SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID memberSK;

    /**
     * The unique code of the member phone in MMS
     */
    @JsonProperty(required = true)
    @Schema(description = "Member Phone Code - Unique id that is assigned to the member phone in MMS", example = "DFEV323455DE5S3", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String memberPhoneCode;

    /**
     * The phone type code of the phone
     */
    @JsonProperty(required = true)
    @Schema(description = "The phone type code of the phone", example = "MOBILE", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String phoneTypeCode;

    /**
     * The phone number of the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The phone number of the member", example = "813-357-9150", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String phoneNumber;

    /**
     * The zeus transaction control number of the transaction that created the phone number
     */
    @JsonProperty(required = false)
    @Schema(description = "The zeus transaction control number of the transaction that created the phone number", example = "SDFG43456DFG23G", requiredMode = Schema.RequiredMode.NOT_REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private String ztcn;

    /**
     * The start date of the phone
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "The start date of the phone", example = "1/1/2021", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate startDate;

    /**
     * The end date of the phone
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Schema(description = "The end date of the phone", example = "12/31/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate endDate;

    /**
     * Identifies if the phone was updated
     */
    @JsonProperty(required = true)
    @Schema(description = "Identifies if the phone was updated", example = "false", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_WRITE)
    private AtomicBoolean changed;

    /**
     * The date when the phone number was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the phone number was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the phone number was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @Schema(description = "The date when the phone number was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "MemberPhoneDto{" +
                "memberPhoneSK=" + memberPhoneSK +
                ", memberSK=" + memberSK +
                ", memberPhoneCode='" + memberPhoneCode + '\'' +
                ", phoneTypeCode='" + phoneTypeCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
