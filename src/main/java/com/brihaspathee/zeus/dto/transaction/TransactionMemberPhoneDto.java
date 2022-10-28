package com.brihaspathee.zeus.dto.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.Null;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 17, October 2022
 * Time: 5:48 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.transaction.dto
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class TransactionMemberPhoneDto {

    /**
     * The primary key of the member phone
     */
    @JsonProperty(required = false)
    @Schema(description = "Member Phone SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID memberPhoneSK;

    /**
     * The member for whom the phone was received
     */
    @JsonProperty(required = true)
    private TransactionMemberDto member;

    /**
     * The type of phone that was received for the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The type of phone that was received for the member", example = "CELL", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String phoneTypeCode;

    /**
     * The phone number that was received for the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The phone number that was received for the member", example = "813-357-9150", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String phoneNumber;

    /**
     * The date when the member phone was received
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "The date when the member phone was received", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime receivedDate;

    /**
     * The date when the record was created
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the record was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the record was updated
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the record was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TransactionMemberPhoneDto{" +
                "memberPhoneSK=" + memberPhoneSK +
                ", member=" + member +
                ", phoneTypeCode='" + phoneTypeCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", receivedDate=" + receivedDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
