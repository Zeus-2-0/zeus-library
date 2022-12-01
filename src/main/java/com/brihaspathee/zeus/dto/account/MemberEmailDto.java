package com.brihaspathee.zeus.dto.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.Null;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 10, September 2022
 * Time: 10:35 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEmailDto {

    /**
     * The primary key of the member email
     */
    @JsonProperty(required = false)
    @Schema(description = "Member Email SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID memberEmailSK;

    /**
     * The primary key of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "Member SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID memberSK;

    /**
     * The unique code of the member email in MMS
     */
    @JsonProperty(required = true)
    @Schema(description = "Member Email Code - Unique id that is assigned to the member email in MMS", example = "DFEV323455DE5S3", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String memberEmailCode;

    /**
     * The email type code of the email
     */
    @JsonProperty(required = true)
    @Schema(description = "The email type code of the email", example = "PERSONAL", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String emailTypeCode;

    /**
     * The EMAIL of the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The email of the member", example = "vbalaji215@gmail.com", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String email;

    /**
     * Identifies if the email is the primary email
     */
    @JsonProperty(required = true)
    @Schema(description = "Identifies if the email is the primary email", example = "true", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private boolean isPrimary;

    /**
     * The start date of the email
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Schema(description = "The start date of the email", example = "1/1/2021", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate startDate;

    /**
     * The end date of the email
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Schema(description = "The end date of the email", example = "12/31/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate endDate;

    /**
     * The date when the email was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Schema(description = "The date when the email was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the email was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Schema(description = "The date when the email was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "MemberEmailDto{" +
                "memberEmailSK=" + memberEmailSK +
                ", memberSK=" + memberSK +
                ", memberEmailCode='" + memberEmailCode + '\'' +
                ", emailTypeCode='" + emailTypeCode + '\'' +
                ", email='" + email + '\'' +
                ", isPrimary=" + isPrimary +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
