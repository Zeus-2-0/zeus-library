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
public class TransactionMemberIdentifierDto {

    /**
     * The primary key of the member identifier
     */
    @JsonProperty(required = false)
    @Schema(description = "Member Identifier SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID memberIdentifierSK;

    /**
     * The member for whom the identifier was received
     */
    @JsonProperty(required = true)
    private TransactionMemberDto member;

    /**
     * The type of identifier that was received for the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The type of identifier that was received for the member", example = "SSN", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String identifierTypeCode;

    /**
     * The identifier that was received for the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The identifier that was received for the member", example = "999-99-9999", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String identifierValue;

    /**
     * The date when the member identifier was received
     */
    @JsonProperty(required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "The date when the member identifier was received", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_ONLY)
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
}
