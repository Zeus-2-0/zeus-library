package com.brihaspathee.zeus.dto.transaction;

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
 * Time: 5:49 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.transaction.dto
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionMemberLanguageDto {

    /**
     * The primary key of the member language
     */
    @JsonProperty(required = false)
    @Schema(description = "Member Language SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID memberLanguageSK;

    /**
     * The member for whom the language was received
     */
    @JsonProperty(required = true)
    private TransactionMemberDto member;

    /**
     * The type of language that was received for the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The type of language that was received for the member", example = "WRITTEN", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String languageTypeCode;

    /**
     * The language that was received for the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The language that was received for the member", example = "ENG", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String languageCode;

    /**
     * The date when the member language was received
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the member language was received", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_ONLY)
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
        return "TransactionMemberLanguageDto{" +
                "memberLanguageSK=" + memberLanguageSK +
                ", member=" + member +
                ", languageTypeCode='" + languageTypeCode + '\'' +
                ", languageCode='" + languageCode + '\'' +
                ", receivedDate=" + receivedDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
