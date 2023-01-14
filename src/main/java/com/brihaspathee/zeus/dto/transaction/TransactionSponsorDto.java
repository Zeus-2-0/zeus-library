package com.brihaspathee.zeus.dto.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

//import javax.validation.constraints.Null;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 17, October 2022
 * Time: 5:47 PM
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
public class TransactionSponsorDto {

    /**
     * The primary key of the sponsor
     */
    @JsonProperty(required = false)
    @Schema(description = "Sponsor SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID sponsorSK;

    /**
     * The transaction associated with the payer
     */
    @JsonProperty(required = true)
    private TransactionDto transaction;

    /**
     * The sponsor name received in the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The sponsor name received in the transaction", example = "John Doe", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String sponsorName;

    /**
     * The sponsor id received in the transaction
     */
    @JsonProperty(required = true)
    @Schema(description = "The sponsor id received in the transaction", example = "65236472", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String sponsorId;

    /**
     * The date when the sponsor was received
     */
    @JsonProperty(required = false)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="EST" )
    @Schema(description = "The date when the sponsor was received", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime receivedDate;

    /**
     * The date when the record was created
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the sponsor was created", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime createdDate;

    /**
     * The date when the record was updated
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the sponsor was updated", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private LocalDateTime updatedDate;

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TransactionSponsorDto{" +
                "sponsorSK=" + sponsorSK +
                ", transaction=" + transaction +
                ", sponsorName='" + sponsorName + '\'' +
                ", sponsorId='" + sponsorId + '\'' +
                ", receivedDate=" + receivedDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
