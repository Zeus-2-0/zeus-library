package com.brihaspathee.zeus.dto.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.Null;
import java.time.LocalDateTime;
import java.util.UUID;

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
public class MemberIdentifierDto {

    /**
     * The primary key of the member identifier
     */
    @JsonProperty(required = false)
    @Schema(description = "Member Identifier SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID memberIdentifierSK;

    /**
     * The primary key of the member
     */
    @JsonProperty(required = false)
    @Schema(description = "Member SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private UUID memberSK;

    /**
     * The unique code of the member identifier in MMS
     */
    @JsonProperty(required = true)
    @Schema(description = "Member Address Code - Unique id that is assigned to the member address in MMS", example = "DFEV323455DE5S3", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String memberIdentifierCode;

    /**
     * The identifier type code of the identifier
     */
    @JsonProperty(required = true)
    @Schema(description = "The identifier type code of the identifier", example = "SSN", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String identifierTypeCode;

    /**
     * The identifier of the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The identifier of the member", example = "345-34-6434", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String identifierValue;

    /**
     * Identifies if the identifier is active
     */
    @JsonProperty(required = true)
    @Schema(description = "Identifies if the identifier is active", example = "true", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private boolean isActive;

    /**
     * The date when the identifier was created
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Schema(description = "The date when the identifier was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the identifier was updated
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Schema(description = "The date when the identifier was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "MemberIdentifierDto{" +
                "memberIdentifierSK=" + memberIdentifierSK +
                ", memberSK=" + memberSK +
                ", memberIdentifierCode='" + memberIdentifierCode + '\'' +
                ", identifierTypeCode='" + identifierTypeCode + '\'' +
                ", identifierValue='" + identifierValue + '\'' +
                ", isActive=" + isActive +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
