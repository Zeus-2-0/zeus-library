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
public class TransactionMemberAddressDto {

    /**
     * The primary key of the member address
     */
    @JsonProperty(required = false)
    @Schema(description = "Member Address SK - This is a UUID value", example = "657cfd75-634e-49f1-9556-4d79f79848ec", required = false, accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private UUID memberAddressSK;

    /**
     * The member for whom the address was received
     */
    @JsonProperty(required = true)
    private TransactionMemberDto member;

    /**
     * The type of address that was received for the member
     */
    @JsonProperty(required = true)
    @Schema(description = "The type of address that was received for the member", example = "RES", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String addressTypeCode;

    /**
     * The address line 1 of the address
     */
    @JsonProperty(required = true)
    @Schema(description = "The address line 1 of the address", example = "123 Main Street", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String addressLine1;

    /**
     * The address line 2 of the address
     */
    @JsonProperty(required = false)
    @Schema(description = "The address line 2 of the address", example = "Apt 301", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String addressLine2;

    /**
     * The city of the address
     */
    @JsonProperty(required = true)
    @Schema(description = "The city of the address", example = "Tampa", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String city;

    /**
     * The state received in the address
     */
    @JsonProperty(required = true)
    @Schema(description = "The state received in the address", example = "FL", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String stateTypeCode;

    /**
     * The zip code received in the address
     */
    @JsonProperty(required = true)
    @Schema(description = "The zip code received in the address", example = "33556", required = true, accessMode = Schema.AccessMode.READ_WRITE)
    private String zipCode;

    /**
     * The county code received in the address
     */
    @JsonProperty(required = false)
    @Schema(description = "The county code received in the address", example = "37017", required = false, accessMode = Schema.AccessMode.READ_WRITE)
    private String countyCode;

    /**
     * The date when the member address was received
     */
    @JsonProperty(required = false)
    @Schema(description = "The date when the member address was received", example = "12/15/2021", required = false, accessMode = Schema.AccessMode.READ_ONLY)
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
        return "TransactionMemberAddressDto{" +
                "memberAddressSK=" + memberAddressSK +
                ", member=" + member +
                ", addressTypeCode='" + addressTypeCode + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", stateTypeCode='" + stateTypeCode + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", countyCode='" + countyCode + '\'' +
                ", receivedDate=" + receivedDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
