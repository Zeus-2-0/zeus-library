package com.brihaspathee.zeus.dto.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

//import jakarta.validation.constraints.Null;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2022
 * Time: 11:52 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.dto.account
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SponsorDto {

    /**
     * The primary key of the sponsor in MMS
     */
    @JsonProperty(required = false)
    @Schema(description = "Sponsor SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID sponsorSK;

    /**
     * The unique code of the sponsor
     */
    @JsonProperty(required = true)
    @Schema(description = "Sponsor Code - Unique id that is assigned to the sponsor in MMS", example = "DFEV323455DE5S3", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String sponsorCode;

    /**
     * The account key of the account that the enrollment span is associated with
     */
    @JsonProperty(required = false)
    @Schema(description = "Account SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    @Null
    private UUID accountSK;

    /**
     * The id of the sponsor
     */
    @JsonProperty(required = true)
    @Schema(description = "The id of the sponsor", example = "923-53-6234", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String sponsorId;

    /**
     * The name of the sponsor
     */
    @JsonProperty(required = true)
    @Schema(description = "The name of the sponsor", example = "John Doe", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String sponsorName;

    /**
     * The start date of the sponsor
     */
    @JsonProperty(required = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Schema(description = "Start date of the sponsor", example = "1/1/2022", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate startDate;

    /**
     * The end date of the sponsor
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Schema(description = "End date of the sponsor", example = "12/31/2022", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDate endDate;

    /**
     * The date when the account was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Schema(description = "The date when the account was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the account was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Schema(description = "The date when the account was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "SponsorDto{" +
                "sponsorSK=" + sponsorSK +
                ", sponsorCode='" + sponsorCode + '\'' +
                ", accountSK=" + accountSK +
                ", sponsorId='" + sponsorId + '\'' +
                ", sponsorName='" + sponsorName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
